package com.jalian.wsdlfirstws.config;

import com.jalian.wsdlfirstws.ws.CustomerOrdersServiceImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WSConfig {

    private final Bus bus;

    @Autowired
    public WSConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        var endpoint = new EndpointImpl(bus, new CustomerOrdersServiceImpl());
        endpoint.publish("/customer-orders-service");
        return endpoint;
    }
}
