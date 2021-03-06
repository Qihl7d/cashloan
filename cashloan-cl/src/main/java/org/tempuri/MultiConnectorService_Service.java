
package org.tempuri;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MultiConnectorService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://idmtest.creditinfo.co.ke/MultiConnector.svc?singleWsdl")
public class MultiConnectorService_Service
    extends Service
{

    private final static URL MULTICONNECTORSERVICE_WSDL_LOCATION;
    private final static WebServiceException MULTICONNECTORSERVICE_EXCEPTION;
    private final static QName MULTICONNECTORSERVICE_QNAME = new QName("http://tempuri.org/", "MultiConnectorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://idmtest.creditinfo.co.ke/MultiConnector.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MULTICONNECTORSERVICE_WSDL_LOCATION = url;
        MULTICONNECTORSERVICE_EXCEPTION = e;
    }

    public MultiConnectorService_Service() {
        super(__getWsdlLocation(), MULTICONNECTORSERVICE_QNAME);
    }

    public MultiConnectorService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MULTICONNECTORSERVICE_QNAME, features);
    }

    public MultiConnectorService_Service(URL wsdlLocation) {
        super(wsdlLocation, MULTICONNECTORSERVICE_QNAME);
    }

    public MultiConnectorService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MULTICONNECTORSERVICE_QNAME, features);
    }

    public MultiConnectorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MultiConnectorService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MultiConnectorService
     */
    @WebEndpoint(name = "BasicHttpBinding_MultiConnectorService")
    public MultiConnectorService getBasicHttpBindingMultiConnectorService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_MultiConnectorService"), MultiConnectorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MultiConnectorService
     */
    @WebEndpoint(name = "BasicHttpBinding_MultiConnectorService")
    public MultiConnectorService getBasicHttpBindingMultiConnectorService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_MultiConnectorService"), MultiConnectorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MULTICONNECTORSERVICE_EXCEPTION!= null) {
            throw MULTICONNECTORSERVICE_EXCEPTION;
        }
        return MULTICONNECTORSERVICE_WSDL_LOCATION;
    }

}
