package com.jalian.wsdlfirstws.generated;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-10-27T23:34:05.033+03:30
 * Generated source version: 4.0.5
 *
 */
@WebServiceClient(name = "CustomerOrders",
                  wsdlLocation = "file:/F:/Java%20Apps/wsdlfirstws/src/main/resources/wsdl/4.1%20CustomerOrders.wsdl",
                  targetNamespace = "com/jalian/wsdlfirstws/generated/")
public class CustomerOrders extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("com/jalian/wsdlfirstws/generated/", "CustomerOrders");
    public static final QName CustomerOrdersSOAP = new QName("com/jalian/wsdlfirstws/generated/", "CustomerOrdersSOAP");
    static {
        URL url = null;
        try {
            url = URI.create("file:/F:/Java%20Apps/wsdlfirstws/src/main/resources/wsdl/4.1%20CustomerOrders.wsdl").toURL();
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerOrders.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/F:/Java%20Apps/wsdlfirstws/src/main/resources/wsdl/4.1%20CustomerOrders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerOrders(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerOrders(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerOrders() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CustomerOrders(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerOrders(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerOrders(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrdersSOAP")
    public CustomerOrdersPortType getCustomerOrdersSOAP() {
        return super.getPort(CustomerOrdersSOAP, CustomerOrdersPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrdersSOAP")
    public CustomerOrdersPortType getCustomerOrdersSOAP(WebServiceFeature... features) {
        return super.getPort(CustomerOrdersSOAP, CustomerOrdersPortType.class, features);
    }

}
