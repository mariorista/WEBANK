
package wrr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wrr package. 
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

    private final static QName _MailCheckResponse_QNAME = new QName("http://Alfa/", "mailCheckResponse");
    private final static QName _ConnectionNQResponse_QNAME = new QName("http://Alfa/", "ConnectionNQResponse");
    private final static QName _Info_QNAME = new QName("http://Alfa/", "Info");
    private final static QName _InfoResponse_QNAME = new QName("http://Alfa/", "InfoResponse");
    private final static QName _MailCheck_QNAME = new QName("http://Alfa/", "mailCheck");
    private final static QName _ConnectionNQ_QNAME = new QName("http://Alfa/", "ConnectionNQ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wrr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MailCheckResponse }
     * 
     */
    public MailCheckResponse createMailCheckResponse() {
        return new MailCheckResponse();
    }

    /**
     * Create an instance of {@link ConnectionNQResponse }
     * 
     */
    public ConnectionNQResponse createConnectionNQResponse() {
        return new ConnectionNQResponse();
    }

    /**
     * Create an instance of {@link InfoResponse }
     * 
     */
    public InfoResponse createInfoResponse() {
        return new InfoResponse();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link MailCheck }
     * 
     */
    public MailCheck createMailCheck() {
        return new MailCheck();
    }

    /**
     * Create an instance of {@link ConnectionNQ }
     * 
     */
    public ConnectionNQ createConnectionNQ() {
        return new ConnectionNQ();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "mailCheckResponse")
    public JAXBElement<MailCheckResponse> createMailCheckResponse(MailCheckResponse value) {
        return new JAXBElement<MailCheckResponse>(_MailCheckResponse_QNAME, MailCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionNQResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "ConnectionNQResponse")
    public JAXBElement<ConnectionNQResponse> createConnectionNQResponse(ConnectionNQResponse value) {
        return new JAXBElement<ConnectionNQResponse>(_ConnectionNQResponse_QNAME, ConnectionNQResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Info }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "Info")
    public JAXBElement<Info> createInfo(Info value) {
        return new JAXBElement<Info>(_Info_QNAME, Info.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "InfoResponse")
    public JAXBElement<InfoResponse> createInfoResponse(InfoResponse value) {
        return new JAXBElement<InfoResponse>(_InfoResponse_QNAME, InfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "mailCheck")
    public JAXBElement<MailCheck> createMailCheck(MailCheck value) {
        return new JAXBElement<MailCheck>(_MailCheck_QNAME, MailCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionNQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Alfa/", name = "ConnectionNQ")
    public JAXBElement<ConnectionNQ> createConnectionNQ(ConnectionNQ value) {
        return new JAXBElement<ConnectionNQ>(_ConnectionNQ_QNAME, ConnectionNQ.class, null, value);
    }

}
