
package com.jalian.wsdlfirstws.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jalian.wsdlfirstws.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOrdersRequest_QNAME = new QName("com/jalian/wsdlfirstws/generated/", "getOrdersRequest");
    private final static QName _GetOrdersResponse_QNAME = new QName("com/jalian/wsdlfirstws/generated/", "getOrdersResponse");
    private final static QName _CreateOrdersRequest_QNAME = new QName("com/jalian/wsdlfirstws/generated/", "createOrdersRequest");
    private final static QName _CreateOrdersResponse_QNAME = new QName("com/jalian/wsdlfirstws/generated/", "createOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jalian.wsdlfirstws.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOrdersRequest }
     * 
     */
    public CreateOrdersRequest createCreateOrdersRequest() {
        return new CreateOrdersRequest();
    }

    /**
     * Create an instance of {@link CreateOrdersResponse }
     * 
     */
    public CreateOrdersResponse createCreateOrdersResponse() {
        return new CreateOrdersResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "com/jalian/wsdlfirstws/generated/", name = "getOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "com/jalian/wsdlfirstws/generated/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrdersRequest }{@code >}
     */
    @XmlElementDecl(namespace = "com/jalian/wsdlfirstws/generated/", name = "createOrdersRequest")
    public JAXBElement<CreateOrdersRequest> createCreateOrdersRequest(CreateOrdersRequest value) {
        return new JAXBElement<CreateOrdersRequest>(_CreateOrdersRequest_QNAME, CreateOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOrdersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "com/jalian/wsdlfirstws/generated/", name = "createOrdersResponse")
    public JAXBElement<CreateOrdersResponse> createCreateOrdersResponse(CreateOrdersResponse value) {
        return new JAXBElement<CreateOrdersResponse>(_CreateOrdersResponse_QNAME, CreateOrdersResponse.class, null, value);
    }

}
