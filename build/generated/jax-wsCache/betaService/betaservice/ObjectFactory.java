
package betaservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the betaservice package. 
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

    private final static QName _Transfer_QNAME = new QName("http://beta/", "transfer");
    private final static QName _TransferResponse_QNAME = new QName("http://beta/", "transferResponse");
    private final static QName _ConnectionNE_QNAME = new QName("http://beta/", "ConnectionNE");
    private final static QName _ConnectionNEResponse_QNAME = new QName("http://beta/", "ConnectionNEResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: betaservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link ConnectionNE }
     * 
     */
    public ConnectionNE createConnectionNE() {
        return new ConnectionNE();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link ConnectionNEResponse }
     * 
     */
    public ConnectionNEResponse createConnectionNEResponse() {
        return new ConnectionNEResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beta/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beta/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionNE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beta/", name = "ConnectionNE")
    public JAXBElement<ConnectionNE> createConnectionNE(ConnectionNE value) {
        return new JAXBElement<ConnectionNE>(_ConnectionNE_QNAME, ConnectionNE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionNEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beta/", name = "ConnectionNEResponse")
    public JAXBElement<ConnectionNEResponse> createConnectionNEResponse(ConnectionNEResponse value) {
        return new JAXBElement<ConnectionNEResponse>(_ConnectionNEResponse_QNAME, ConnectionNEResponse.class, null, value);
    }

}
