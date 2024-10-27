package com.jalian.wsdlfirstws.generated;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-10-27T23:34:05.005+03:30
 * Generated source version: 4.0.5
 *
 */
@WebService(targetNamespace = "com/jalian/wsdlfirstws/generated/", name = "CustomerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod(action = "http://trainings.ws.jalian.com/NewOperation")
    @WebResult(name = "getOrdersResponse", targetNamespace = "com/jalian/wsdlfirstws/generated/", partName = "parameters")
    public GetOrdersResponse getOrders(

        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "com/jalian/wsdlfirstws/generated/")
        GetOrdersRequest parameters
    );

    @WebMethod(action = "http://trainings.ws.jalian.com/NewOperation")
    @WebResult(name = "createOrdersResponse", targetNamespace = "com/jalian/wsdlfirstws/generated/", partName = "parameters")
    public CreateOrdersResponse createOrders(

        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "com/jalian/wsdlfirstws/generated/")
        CreateOrdersRequest parameters
    );
}
