<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <jsp:include page="/header/header.jsp" /> 
</head>

<body>

	<s:actionerror/>

<div class="col col-lg-4 col-offset-4 m-t-large">
	<section class="panel">
          <header class="panel-heading text-center">
            Sign in
          </header>
          <form action="login.action" class="padder">
            <div class="block">
              <label class="control-label">Username</label>
              <input name="user.name" placeholder="Username" type="text">
            </div>
            <div class="block">
              <label class="control-label">Password</label>
              <input name="user.password" id="inputPassword" placeholder="Password" type="password">
            </div>
            <div class="checkbox">
              <label>
                <input type="checkbox"> Keep me logged in
              </label>
            </div>
            <a href="#" class="pull-right m-t-mini"><small>Forgot password?</small></a>
            <button type="submit" class="btn btn-info">Sign in</button>
            <div class="line line-dashed"></div>
            <a href="#" class="btn btn-facebook btn-block m-b-small"><i class="icon-facebook pull-left"></i>Sign in with Facebook</a>
            <a href="#" class="btn btn-twitter btn-block"><i class="icon-twitter pull-left"></i>Sign in with Twitter</a>
            <div class="line line-dashed"></div>
            <p class="text-muted text-center"><small>Do not have an account?</small></p>
            <a href="signup.html" class="btn btn-white btn-block">Create an account</a>
          </form>
        </section>
  </div>      
        
	<script src="js/jquery.min.js"></script>
</body>
</html>