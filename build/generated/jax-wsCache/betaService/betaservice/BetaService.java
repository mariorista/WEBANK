
package betaservice;

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
@WebServiceClient(name = "betaService", targetNamespace = "http://beta/", wsdlLocation = "http://localhost:33330/WEBANK/betaService?wsdl")
public class BetaService
    extends Service
{

    private final static URL BETASERVICE_WSDL_LOCATION;
    private final static WebServiceException BETASERVICE_EXCEPTION;
    private final static QName BETASERVICE_QNAME = new QName("http://beta/", "betaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:33330/WEBANK/betaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BETASERVICE_WSDL_LOCATION = url;
        BETASERVICE_EXCEPTION = e;
    }

    public BetaService() {
        super(__getWsdlLocation(), BETASERVICE_QNAME);
    }

    public BetaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BETASERVICE_QNAME, features);
    }

    public BetaService(URL wsdlLocation) {
        super(wsdlLocation, BETASERVICE_QNAME);
    }

    public BetaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BETASERVICE_QNAME, features);
    }

    public BetaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BetaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Beta
     */
    @WebEndpoint(name = "betaPort")
    public Beta getBetaPort() {
        return super.getPort(new QName("http://beta/", "betaPort"), Beta.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Beta
     */
    @WebEndpoint(name = "betaPort")
    public Beta getBetaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://beta/", "betaPort"), Beta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BETASERVICE_EXCEPTION!= null) {
            throw BETASERVICE_EXCEPTION;
        }
        return BETASERVICE_WSDL_LOCATION;
    }

}
