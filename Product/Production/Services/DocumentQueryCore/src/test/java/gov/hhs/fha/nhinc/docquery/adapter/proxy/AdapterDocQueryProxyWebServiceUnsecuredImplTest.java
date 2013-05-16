/*
 * Copyright (c) 2009-2013, United States Government, as represented by the Secretary of Health and Human Services. 
 * All rights reserved. 
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met: 
 *     * Redistributions of source code must retain the above 
 *       copyright notice, this list of conditions and the following disclaimer. 
 *     * Redistributions in binary form must reproduce the above copyright 
 *       notice, this list of conditions and the following disclaimer in the documentation 
 *       and/or other materials provided with the distribution. 
 *     * Neither the name of the United States Government nor the 
 *       names of its contributors may be used to endorse or promote products 
 *       derived from this software without specific prior written permission. 
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE 
 * DISCLAIMED. IN NO EVENT SHALL THE UNITED STATES GOVERNMENT BE LIABLE FOR ANY 
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND 
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS 
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package gov.hhs.fha.nhinc.docquery.adapter.proxy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import gov.hhs.fha.nhinc.adapterdocquery.AdapterDocQueryPortType;
import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.messaging.client.CONNECTClient;
import gov.hhs.fha.nhinc.messaging.service.port.ServicePortDescriptor;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;

import org.junit.Test;

/**
 * @author msw
 * 
 */
public class AdapterDocQueryProxyWebServiceUnsecuredImplTest {

    @SuppressWarnings("unchecked")
    private final CONNECTClient<AdapterDocQueryPortType> client = mock(CONNECTClient.class);
    private AssertionType assertion;
    private AdhocQueryRequest request;

    @Test
    public void testNoMtom() throws Exception {
        AdapterDocQueryProxyWebServiceUnsecuredImpl impl = getImpl();
        impl.respondingGatewayCrossGatewayQuery(request, assertion);
        verify(client, never()).enableMtom();
    }

    /**
     * @return
     */
    private AdapterDocQueryProxyWebServiceUnsecuredImpl getImpl() {
        return new AdapterDocQueryProxyWebServiceUnsecuredImpl() {

            /*
             * (non-Javadoc)
             * 
             * @see gov.hhs.fha.nhinc.docquery.adapter.proxy.AdapterDocQueryProxyWebServiceUnsecuredImpl#
             * getCONNECTClientUnsecured(gov.hhs.fha.nhinc.messaging.service.port.ServicePortDescriptor,
             * java.lang.String, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType)
             */
            @Override
            protected CONNECTClient<AdapterDocQueryPortType> getCONNECTClientUnsecured(
                    ServicePortDescriptor<AdapterDocQueryPortType> portDescriptor, String url, AssertionType assertion) {
                return client;
            }
        };
    }

}
