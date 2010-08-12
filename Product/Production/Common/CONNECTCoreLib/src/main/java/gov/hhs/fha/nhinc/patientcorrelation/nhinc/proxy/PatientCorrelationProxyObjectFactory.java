/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.hhs.fha.nhinc.patientcorrelation.nhinc.proxy;

import gov.hhs.fha.nhinc.proxy.ComponentProxyObjectFactory;

/**
 
 *
 * @author Jon Hoppesch
 */
public class PatientCorrelationProxyObjectFactory extends ComponentProxyObjectFactory {

    private static final String CONFIG_FILE_NAME = "PatientCorrelationConfig.xml";
    private static final String BEAN_NAME = "patientcorrelation";

    protected String getConfigFileName() {
        return CONFIG_FILE_NAME;
    }

    public PatientCorrelationProxy getPatientCorrelationProxy() {
        return getBean(BEAN_NAME, PatientCorrelationProxy.class);
    }
}
