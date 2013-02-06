/**
 * 
 */
package org.connectopensource.interoperabilityshowcasegui.managedbean;

import javax.faces.bean.ManagedBean;

import org.connectopensource.interoperabilityshowcasegui.view.Endpoint;
import org.connectopensource.interoperabilityshowcasegui.view.EndpointImpl;

/**
 * @author msw
 *
 */
@ManagedBean
public class Register {
    
    public enum SpecVersion { JAN_2010, SUMMER_2011 }
    public enum CertificateType { CERT_REQ, CERT_TO_TRUST }
    private String hcid = null;
    
    private Endpoint PDEndpoint = null;

    private String DQEndpoint = null;
    private SpecVersion DQVersion;
    private String DREndpoint = null;
    private SpecVersion DRVersion;
    private String DSEndpoint = null;
    private SpecVersion DSVersion;
    private String ADEndpoint = null;
    private SpecVersion ADVersion;
    
    private CertificateType certType;
    private String certPath = null;
    
    private String firstName = null;
    private String lastName = null;
    private String DoB = null;
    private String gender = null;
    
    private String documentUniqueId = null;
    private String documentType = null;
    private String documentComment = null;
    
    public Register() {
        PDEndpoint = new EndpointImpl();
    }
    
    /**
     * @return the hcid
     */
    public String getHcid() {
        return hcid;
    }
    /**
     * @param hcid the hcid to set
     */
    public void setHcid(String hcid) {
        this.hcid = hcid;
    }
    /**
     * @return the pDEndpoint
     */
    public Endpoint getPDEndpoint() {
        return PDEndpoint;
    }
    /**
     * @param pDEndpoint the pDEndpoint to set
     */
    public void setPDEndpoint(Endpoint pDEndpoint) {
        PDEndpoint = pDEndpoint;
    }
    /**
     * @return the dQEndpoint
     */
    public String getDQEndpoint() {
        return DQEndpoint;
    }
    /**
     * @param dQEndpoint the dQEndpoint to set
     */
    public void setDQEndpoint(String dQEndpoint) {
        DQEndpoint = dQEndpoint;
    }
    /**
     * @return the dQVersion
     */
    public SpecVersion getDQVersion() {
        return DQVersion;
    }
    /**
     * @param dQVersion the dQVersion to set
     */
    public void setDQVersion(SpecVersion dQVersion) {
        DQVersion = dQVersion;
    }
    /**
     * @return the dREndpoint
     */
    public String getDREndpoint() {
        return DREndpoint;
    }
    /**
     * @param dREndpoint the dREndpoint to set
     */
    public void setDREndpoint(String dREndpoint) {
        DREndpoint = dREndpoint;
    }
    /**
     * @return the dRVersion
     */
    public SpecVersion getDRVersion() {
        return DRVersion;
    }
    /**
     * @param dRVersion the dRVersion to set
     */
    public void setDRVersion(SpecVersion dRVersion) {
        DRVersion = dRVersion;
    }
    /**
     * @return the dSEndpoint
     */
    public String getDSEndpoint() {
        return DSEndpoint;
    }
    /**
     * @param dSEndpoint the dSEndpoint to set
     */
    public void setDSEndpoint(String dSEndpoint) {
        DSEndpoint = dSEndpoint;
    }
    /**
     * @return the dSVersion
     */
    public SpecVersion getDSVersion() {
        return DSVersion;
    }
    /**
     * @param dSVersion the dSVersion to set
     */
    public void setDSVersion(SpecVersion dSVersion) {
        DSVersion = dSVersion;
    }
    /**
     * @return the aDEndpoint
     */
    public String getADEndpoint() {
        return ADEndpoint;
    }
    /**
     * @param aDEndpoint the aDEndpoint to set
     */
    public void setADEndpoint(String aDEndpoint) {
        ADEndpoint = aDEndpoint;
    }
    /**
     * @return the aDVersion
     */
    public SpecVersion getADVersion() {
        return ADVersion;
    }
    /**
     * @param aDVersion the aDVersion to set
     */
    public void setADVersion(SpecVersion aDVersion) {
        ADVersion = aDVersion;
    }
    /**
     * @return the certType
     */
    public CertificateType getCertType() {
        return certType;
    }
    /**
     * @param certType the certType to set
     */
    public void setCertType(CertificateType certType) {
        this.certType = certType;
    }
    /**
     * @return the certPath
     */
    public String getCertPath() {
        return certPath;
    }
    /**
     * @param certPath the certPath to set
     */
    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return the doB
     */
    public String getDoB() {
        return DoB;
    }
    /**
     * @param doB the doB to set
     */
    public void setDoB(String doB) {
        DoB = doB;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @return the documentUniqueId
     */
    public String getDocumentUniqueId() {
        return documentUniqueId;
    }
    /**
     * @param documentUniqueId the documentUniqueId to set
     */
    public void setDocumentUniqueId(String documentUniqueId) {
        this.documentUniqueId = documentUniqueId;
    }
    /**
     * @return the documentType
     */
    public String getDocumentType() {
        return documentType;
    }
    /**
     * @param documentType the documentType to set
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
    /**
     * @return the documentComment
     */
    public String getDocumentComment() {
        return documentComment;
    }
    /**
     * @param documentComment the documentComment to set
     */
    public void setDocumentComment(String documentComment) {
        this.documentComment = documentComment;
    }
    
    public String saveInfo() {
        return "";
    }
}
