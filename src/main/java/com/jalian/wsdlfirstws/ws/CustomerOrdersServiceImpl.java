package com.jalian.wsdlfirstws.ws;

import com.jalian.wsdlfirstws.generated.*;
import org.apache.cxf.feature.Features;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrdersServiceImpl implements CustomerOrdersPortType {

    private final Map<BigInteger, List<Order>> customerOrders = new HashMap<>();

    private int customerId;

    public CustomerOrdersServiceImpl() {
        init();
    }

    public void init() {
        var orders = new ArrayList<Order>();
        var order = new Order();
        order.setId(BigInteger.valueOf(1));
        var product = new Product();
        product.setId("1");
        product.setDescription("Test product");
        product.setQuantity(BigInteger.valueOf(3));
        order.getProduct().add(product);
        orders.add(order);
        customerOrders.put(BigInteger.valueOf(++customerId), orders);
    }

    @Override
    public GetOrdersResponse getOrders(GetOrdersRequest request) {
        var customerId = request.getCustomerId();
        var orders = customerOrders.get(customerId);
        var resp = new GetOrdersResponse();
        resp.getOrder().addAll(orders);
        return resp;
    }

    @Override
    public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
        var customerId = request.getCustomerId();
        var order = request.getOrder();
        var orders = customerOrders.get(customerId);
        orders.add(order);
        var resp = new CreateOrdersResponse();
        resp.setResult(true);
        return resp;
    }
}
