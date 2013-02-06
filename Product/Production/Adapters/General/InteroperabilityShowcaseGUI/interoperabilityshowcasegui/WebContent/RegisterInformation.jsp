<?xml version="1.0" encoding="US-ASCII" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:view="http://java.sun.com/jsf/composite/view" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="US-ASCII" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII" />
<title>Insert title here</title>
</head>
<body>
<f:view>
Welcome to the CONNECT Interoperability Showcase Information Registration Page. Please enter your information below.

<h:form>
HCID:<h:inputText id="hcid" value="#{register.hcid}" />
<view:Endpoint />
Done.
<!-- Certificates
<h:panelGroup>
<h:selectOneListbox></h:selectOneListbox>Path:<h:textInput></h:textInput> Need browse button here.
</h:panelGroup>
Demographics
<h:panelGroup>
First Name:<h:inputText value="#{register.firstName }" />Last Name:<h:inputText value="#{register.lastName }" />
<br>
DoB:<h:inputText value="#{register.doB }" />Gender:<h:inputText value="#{register.gender }" />
</h:panelGroup>
Documents
<h:panelGroup>Document Unique Id<h:inputText value="#{register.documentUniqueId }" />Document Type:<h:inputText value="#{register.documentType }" />
<br>
Comments:<h:inputText value="#{register.documentComment }" />
</h:panelGroup>
-->
<h:commandButton value="Submit" action="#{register.saveInfo}"/>

</h:form>

</f:view>
</body>
</html>
</jsp:root>