
package wrr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AlfaService", targetNamespace = "http://Alfa/", wsdlLocation = "http://localhost:33330/WEBANK/AlfaService?wsdl")
public class AlfaService
    extends Service
{

    private final static URL ALFASERVICE_WSDL_LOCATION;
    private final static WebServiceException ALFASERVICE_EXCEPTION;
    private final static QName ALFASERVICE_QNAME = new QName("http://Alfa/", "AlfaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:33330/WEBANK/AlfaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALFASERVICE_WSDL_LOCATION = url;
        ALFASERVICE_EXCEPTION = e;
    }

    public AlfaService() {
        super(__getWsdlLocation(), ALFASERVICE_QNAME);
    }

    public AlfaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALFASERVICE_QNAME, features);
    }

    public AlfaService(URL wsdlLocation) {
        super(wsdlLocation, ALFASERVICE_QNAME);
    }

    public AlfaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALFASERVICE_QNAME, features);
    }

    public AlfaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlfaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Alfa
     */
    @WebEndpoint(name = "AlfaPort")
    public Alfa getAlfaPort() {
        return super.getPort(new QName("http://Alfa/", "AlfaPort"), Alfa.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Alfa
     */
    @WebEndpoint(name = "AlfaPort")
    public Alfa getAlfaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Alfa/", "AlfaPort"), Alfa.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALFASERVICE_EXCEPTION!= null) {
            throw ALFASERVICE_EXCEPTION;
        }
        return ALFASERVICE_WSDL_LOCATION;
    }

}