<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h2> <s:property value="Ajout d'une Entreprise"/> </h2>
        
        <s:actionerror/>
 
 <table>       
        <s:form action="addEntrepriseAction.action" >
        	
        	<s:hidden name="id" ></s:hidden>
        	<tr><td>
        	<s:label value="Name"></s:label>
            <s:textfield name="name" />
            </td></tr>
            
            <tr><td>
            <s:label value="Adress"></s:label>
            <s:textfield name="adresse" />
           </td></tr>
            
            <tr><td>
            <s:label value="Secteur d'Activite"></s:label>
            <s:textfield name="secteurActivite" />
           </td></tr>
            
            <tr><td> 
            <s:submit />
            </td></tr>
        </s:form>
</table>
       
</body>
</html>