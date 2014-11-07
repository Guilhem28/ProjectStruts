<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
	  <meta charset="utf-8">
	  <title>Contact</title>
	  <meta name="description" content="mobile first, app, web app, responsive, admin dashboard, flat, flat ui">
	  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"> 
	  <link rel="stylesheet" href="css/bootstrap.css">
	  <link rel="stylesheet" href="css/font-awesome.min.css">
	  <link rel="stylesheet" href="css/plugin.css">
	  <link rel="stylesheet" href="css/style.css">
	  <link rel="stylesheet" href="css/mystyle.css">
	  
	  
	<s:url action="logout.action" var="logOutTag"> </s:url>
	
	<header id="header" class="navbar navbar-sm bg ">
	    <a href='<s:property value="logOutTag" />' class="btn btn-link pull-right"><i id="off" class="icon-large icon-off"></i></a>
	    <a id="titreNavBar" class="navbar-brand" href="#"><s:property value=" getText('index.titre')"/></a>
	</header>
</head>
