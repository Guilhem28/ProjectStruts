<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h2> <s:property value="getText('contact.add.titre')"/> </h2>
        
        <s:actionerror/>
 
 <table>       
        <s:form action="addContactAction.action" >
        	
        	<s:hidden name="contact.id" ></s:hidden>
        	<tr><td>
        	<s:label value="nom"></s:label>
            <s:textfield name="nom" />
            </td></tr>
            
            <tr><td>
            <s:label value="Prenom"></s:label>
            <s:textfield name="prenom" />
           </td></tr>
            
            <tr><td>
            <s:label value="Email"></s:label>
            <s:textfield name="mail" />
           </td></tr>
            
            <tr><td>
            <s:label value="Tel Domicile"></s:label>
            <s:textfield name="numeroDomicile" />
           </td></tr>
            
            <tr><td>
            <s:label value="Tel Mobile"></s:label>
            <s:textfield name="numeroMobile" />
            </td></tr>
            
           <tr><td>
            <s:label value="Status"></s:label>
	           <select name="status">
	           <option value="0"> Client</option>
	           <option value="1"> Prospect </option>
	           <option value="2"> Contact Direct </option>
	           </select>
           </td></tr>
            
            <tr><td>
            <s:label value="Entreprise"></s:label>
            	<select name="idEntreprise">
            	
            	<s:iterator value="entreprises">
            	<option value="<s:property value="id" />"> <s:property value="name" /></option>
            	</s:iterator>
            	
            	</select>
            </td></tr>
            
            <tr><td> 
            <s:submit />
            </td></tr>
        </s:form>
</table>
       
        
    </body>
</html>
