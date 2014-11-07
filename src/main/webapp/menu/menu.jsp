<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<nav id="nav" class="nav-primary visible-lg nav-vertical">
    <ul class="nav affix-top" data-spy="affix" data-offset-top="50">
      <li class="active"><a href="<s:url value="/index.action"/>"><i class="icon-dashboard icon-xlarge"></i>Dashboard</a></li>
      <li class="dropdown-submenu">
        <a href="<s:url value="/index.action"/>"> <i class="icon-th icon-xlarge"></i>Contact</a>
        <ul class="dropdown-menu">
          <li><a href="<s:url value="/addPageAction.action"/>">Add Contact</a></li>
          <li><a href="<s:url value="/deleteContactAction.action"/>"> Delete Contact</a></li>            
          <li><a href="<s:url value="/updateContactAction.action"/>">Update Contact</a></li>
        </ul>
      </li>
      <li class="dropdown-submenu">
        <a href="<s:url value="/entrepriseAction.action"/>"><i class="icon-list icon-xlarge"></i>Entreprise</a>
        <ul class="dropdown-menu">
          <li><a href="<s:url value="/entreprise/addEntreprise.jsp"/>">Add Entreprise</a></li>
          <li><a href="<s:url value="/deleteEntrepriseAction.action"/>"> Delete Entreprise</a></li>            
          <li><a href="<s:url value="/updateEntrepriseAction.action"/>">Update Entreprise</a></li>
        </ul>
      </li>
      <li class="dropdown-submenu">
        <a href="<s:url value="/echange.action"/>"><i class="icon-list icon-xlarge"></i>Echange</a>
        <ul class="dropdown-menu">
          <li><a href="<s:url value="/entreprise/addEchange.jsp"/>">Add Echange</a></li>
          <li><a href="<s:url value="/deleteEntrepriseAction.action"/>"> Delete Echange</a></li>            
          <li><a href="<s:url value="/updateEntrepriseAction.action"/>">Update Echange</a></li>
        </ul>
      </li>
    </ul>
  </nav>
