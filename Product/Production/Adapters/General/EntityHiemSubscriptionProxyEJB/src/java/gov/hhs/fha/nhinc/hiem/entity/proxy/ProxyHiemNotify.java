/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.hiem.entity.proxy;

import gov.hhs.fha.nhinc.nhincproxynotificationconsumer.NhincProxyNotificationConsumerPortType;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author dunnek
 */
@WebService(serviceName = "NhincProxyNotificationConsumer", portName = "NhincProxyNotificationConsumerPortSoap11", endpointInterface = "gov.hhs.fha.nhinc.nhincproxynotificationconsumer.NhincProxyNotificationConsumerPortType", targetNamespace = "urn:gov:hhs:fha:nhinc:nhincproxynotificationconsumer", wsdlLocation = "META-INF/wsdl/ProxyHiemNotify/NhincProxyNotificationConsumer.wsdl")
@Stateless
public class ProxyHiemNotify implements NhincProxyNotificationConsumerPortType {

    public void notify(gov.hhs.fha.nhinc.common.nhinccommonproxy.NotifyRequestType notifyRequest) {
        new ProxyHiemNotifyImpl().notify(notifyRequest);
    }



}
