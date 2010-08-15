package gov.hhs.fha.nhinc.docretrieve.adapter.deferred.request.error.proxy;

import gov.hhs.fha.nhinc.adapterdocretrievedeferredreqerrorsecured.AdapterDocRetrieveDeferredRequestErrorSecuredPortType;
import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.common.nhinccommonadapter.AdapterDocumentRetrieveDeferredRequestErrorSecuredType;
import gov.hhs.fha.nhinc.connectmgr.ConnectionManagerCache;
import gov.hhs.fha.nhinc.connectmgr.ConnectionManagerException;
import gov.hhs.fha.nhinc.nhinclib.NhincConstants;
import gov.hhs.fha.nhinc.nhinclib.NullChecker;
import gov.hhs.fha.nhinc.saml.extraction.SamlTokenCreator;
import gov.hhs.fha.nhinc.service.ServiceUtil;
import gov.hhs.healthit.nhin.DocRetrieveAcknowledgementType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import java.util.Map;

/**
 * Created by
 * User: ralph
 * Date: Jul 26, 2010
 * Time: 2:37:22 PM
 */
public class AdapterDocRetrieveDeferredReqErrorProxyWebServiceSecuredImpl implements AdapterDocRetrieveDeferredReqErrorProxy {
    private static Service cachedService = null;
    private static final String NAMESPACE_URI = "urn:gov:hhs:fha:nhinc:adapterdocretrievedeferredreqerrorsecured";
    private static final String SERVICE_LOCAL_PART = "AdapterDocRetrieveDeferredRequestErrorSecuredService";
    private static final String PORT_LOCAL_PART = "AdapterDocRetrieveDeferredRequestErrorSecuredPortSoap";
    private static final String WSDL_FILE = "AdapterDocRetrieveDeferredReqErrorSecured.wsdl";
    private Log log = null;

    public AdapterDocRetrieveDeferredReqErrorProxyWebServiceSecuredImpl() {
        log = LogFactory.getLog(getClass());
    }

    public DocRetrieveAcknowledgementType sendToAdapter(AdapterDocumentRetrieveDeferredRequestErrorSecuredType body,
                                                        AssertionType assertion) {
        String url = null;
        DocRetrieveAcknowledgementType result = new DocRetrieveAcknowledgementType();

        try {
            url = ConnectionManagerCache.getLocalEndpointURLByServiceName(NhincConstants.ADAPTER_DOC_RETRIEVE_DEFERRED_REQUEST_ERROR_SECURED_SERVICE_NAME);
        } catch (ConnectionManagerException ex) {
            log.error("Error: Failed to retrieve url for service: " +
                    NhincConstants.ADAPTER_DOC_RETRIEVE_DEFERRED_REQUEST_ERROR_SECURED_SERVICE_NAME + " for local home community");
            log.error(ex.getMessage());
        }

        if (NullChecker.isNotNullish(url)) {
            AdapterDocRetrieveDeferredRequestErrorSecuredPortType port = getPort(url);

            SamlTokenCreator tokenCreator = new SamlTokenCreator();
            Map requestContext = tokenCreator.CreateRequestContext(assertion, url, NhincConstants.AUDIT_REPO_ACTION);

            ((BindingProvider) port).getRequestContext().putAll(requestContext);

            result = port.crossGatewayRetrieveRequestError(body);
        }

        return result;
    }

    protected AdapterDocRetrieveDeferredRequestErrorSecuredPortType getPort(String url) {

        AdapterDocRetrieveDeferredRequestErrorSecuredPortType port = null;
        Service service = getService();
        if(service != null)
        {
            log.debug("Obtained service - creating port.");
            port = service.getPort(new QName(NAMESPACE_URI, PORT_LOCAL_PART), AdapterDocRetrieveDeferredRequestErrorSecuredPortType.class);
            setEndpointAddress(port, url);
        }
        else
        {
            log.error("Unable to obtain serivce - no port created.");
        }
        return port;
    }


    protected Service getService()
    {
        if(cachedService == null)
        {
            try
            {
                cachedService = new ServiceUtil().createService(WSDL_FILE, NAMESPACE_URI, SERVICE_LOCAL_PART);
            }
            catch(Throwable t)
            {
                log.error("Error creating service: " + t.getMessage(), t);
            }
        }
        return cachedService;
    }


    protected void setEndpointAddress(AdapterDocRetrieveDeferredRequestErrorSecuredPortType port, String url)
    {
        if(port == null)
        {
            log.error("Port was null - not setting endpoint address.");
        }
        else if((url == null) || (url.length() < 1))
        {
            log.error("URL was null or empty - not setting endpoint address.");
        }
        else
        {
            log.info("Setting endpoint address to Document Retrieve Request Secure Service to " + url);
            ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
        }
    }

}