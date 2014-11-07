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


<section class="panel">
            <form class="form-horizontal" action="saveEchangeAction.action" data-validate="parsley">                             

              <div class="row">
                <label class="col col-lg-3 control-label"> Id Contact </label>
                <div class="col col-lg-8">
                  <input name="contact.id" type="text" value=${ idUser }>
                </div>
              </div>

              <div class="row">
                <label class="col col-lg-3 control-label"> Type </label>
                <div class="col col-lg-8">
                  <select name="type">
                  		<option value="mail">E-mail</option>
                  		<option value="telephone">Téléphone</option>
                  		<option value="mail">Commentaire</option>
                  </select>
                </div>                             
              </div>
              
              <div class="row">
                <label class="col col-lg-3 control-label"> Commentaire </label>
                <div class="col col-lg-8">
                  <input class="parsley-validated" name="commentaire" placeholder="Write your com" data-required="true" type="text">
                </div>
              </div>
   
              <div class="row">
                <label class="col col-lg-3 control-label">Date</label>
                <div class="col col-lg-9">
                
                  
                  
                  
                  <select name="day" style="width: auto;" class="day">
                  		<option value=""></option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
						<option value="13">13</option>
						<option value="14">14</option>
						<option value="15">15</option>
						<option value="16">16</option>
						<option value="17">17</option>
						<option value="18">18</option>
						<option value="19">19</option>
						<option value="20">20</option>
						<option value="21">21</option>
						<option value="22">22</option>
						<option value="23">23</option>
						<option value="24">24</option>
						<option value="25">25</option>
						<option value="26">26</option>
						<option value="27">27</option>
						<option value="28">28</option>
						<option value="29">29</option>
						<option value="30">30</option>
						<option value="31">31</option></select>
						&nbsp;&nbsp;
				<select name="month" style="width: auto;" class="month">
					<option value=""></option>
					<option value="1">Jan</option>
					<option value="2">Feb</option>
					<option value="3">Mar</option>
					<option value="4">Apr</option>
					<option value="5">May</option>
					<option value="6">Jun</option>
					<option value="7">Jul</option>
					<option value="8">Aug</option>
					<option value="9">Sep</option>
					<option value="10">Oct</option>
					<option value="11">Nov</option>
					<option value="12">Dec</option>
				</select>
					&nbsp;&nbsp;
			<select name="year" style="width: auto;" class="year">
				<option value=""></option>
				<option value="2015">2015</option>
				<option value="2014">2014</option>
				<option value="2013">2013</option>
				<option value="2012">2012</option>
				<option value="2011">2011</option>
				<option value="2010">2010</option>
				<option value="2009">2009</option>
				<option value="2008">2008</option>
				<option value="2007">2007</option>
				<option value="2006">2006</option>
				<option value="2005">2005</option>
				<option value="2004">2004</option>
				<option value="2003">2003</option>
				<option value="2002">2002</option>
				<option value="2001">2001</option>
				<option value="2000">2000</option>
				<option value="1999">1999</option>
				<option value="1998">1998</option>
				<option value="1997">1997</option>
				<option value="1996">1996</option>
				<option value="1995">1995</option>
				<option value="1994">1994</option>
				<option value="1993">1993</option>
				<option value="1992">1992</option>
				<option value="1991">1991</option>
				<option value="1990">1990</option>
				<option value="1989">1989</option>
				<option value="1988">1988</option>
				<option value="1987">1987</option>
				<option value="1986">1986</option>
				<option value="1985">1985</option>
				<option value="1984">1984</option>
				<option value="1983">1983</option>
				<option value="1982">1982</option>
				<option value="1981">1981</option>
				<option value="1980">1980</option>
				<option value="1979">1979</option>
				<option value="1978">1978</option>
				<option value="1977">1977</option>
				<option value="1976">1976</option>
				<option value="1975">1975</option>
				<option value="1974">1974</option>
				<option value="1973">1973</option>
				<option value="1972">1972</option>
				<option value="1971">1971</option>
				<option value="1970">1970</option>
			</select>

		</span>
                </div>
              </div>

              <div class="row">
                <div class="col col-lg-9 col-offset-3">                      
                  <button type="submit" class="btn btn-white">Cancel</button>
                  <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
              </div>
            </form>
          </section>



</body>
</html>