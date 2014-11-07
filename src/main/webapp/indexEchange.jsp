<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/header/header.jsp" /> 
    </head>
    
    <jsp:include page="/menu/menu.jsp" />
    
    <body>
    
	<div id="contentSecteur">	
		<h1>Liste des Echanges</h1>
	</div>




<div class="row">
<section id="contentSecteur" class="panel" >

            <header class="panel-heading">DataGrid <i class="icon-info-sign text-muted" data-toggle="popover" data-html="true" data-placement="top" data-content="The datagrid use ajax to load the data. please put this file on a server to preview." title="" data-trigger="hover" data-original-title="Help"></i> </header>
            <div class="pull-out">
              <table id="ContactGrid" class="table table-striped datagrid m-b-small" >
                <thead>
                  <tr>
                    <th>
                      <div >                        
                        <div class="col col-lg-8">
                          <div class="select filter m-b-small m-t-small" data-resize="auto">
                            <button data-toggle="dropdown" class="btn btn-small btn-white dropdown-toggle">
                              <span class="dropdown-label"></span>
                              <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                              <li data-value="all" data-selected="true"><a href="#">All</a></li>
                              <li data-value="lt5m"><a href="#">Population &lt; 5M</a></li>
                              <li data-value="gte5m"><a href="#">Population &gt;= 5M</a></li>
                            </ul>
                          </div>
                        </div>
                        <div class="col col-lg-4">
                          <div class="input-group search datagrid-search m-t-small">
                            <input type="text" class="input-small" placeholder="Search">
                            <div class="input-group-btn">
                              <button class="btn btn-white btn-small"><i class="icon-search"></i></button>
                            </div>
                          </div>
                        </div>
                      </div>
                    </th>
                  </tr>
                  
                  <tr>
	                  <th class="col col-lg-1">Id Echange</th>
	                  <th class="col col-lg-1">Type</th>
	                  <th class="col col-lg-2">Date</th>
	                  <th class="col col-lg-3">commentaire</th>          
	                  <th class="col col-lg-1">id Contact</th>     
	                  <th class="col col-lg-1">Edit</th>     
	                  <th class="col col-lg-1">Delete</th>     
                  </tr>
                                
                </thead>

		<tbody>
		
				<s:iterator value="echanges">
					<tr class="col col-lg-12">
						<td class="col col-lg-1" ><s:property value="id" /></td>
						<td class="col col-lg-1"><s:property value="type" /></td>
						<td class="col col-lg-2"> <s:property value="date" /></td>
						<td class="col col-lg-3"><s:property value="commentaire" /></td>
						<td class="col col-lg-1"><s:property value="contact.id" /></td>
						
			       	 	<s:url action="initUpdateEchangeAction.action" var="updateTag">
							<s:param name="id"> <s:property value="id"/> </s:param>		    
			       	 	</s:url>
			       		       	 	
			       	 	<td class="col col-lg-1"><a href="<s:property value="updateTag" />"><i class="icon-pencil"></i></a></td>
			       	 	
			       	 	<s:url action="deleteEchangeAction.action" var="deleteTag">
							<s:param name="id"> <s:property value="id"/> </s:param>		    
			       	 	</s:url>
			       	 	<td class="col col-lg-1"><a href="<s:property value="deleteTag" />" > <i class="icon-remove icon-large text-danger text"></i></a></td>
			      </tr>	 		
			</s:iterator>
		</tbody>
	
       </table>
     </div>
</section>
</div>


</body>





  <!-- / footer -->
	<script src="js/jquery.min.js"></script>
  <!-- Bootstrap -->
  <script src="js/bootstrap.js"></script>
  <!-- fuelux -->
  <script src="js/fuelux/fuelux.js"></script>
  <script src="js/underscore-min.js"></script>
  <!-- datatables -->
  <script src="js/datatables/jquery.dataTables.min.js"></script>
  <!-- Sparkline Chart -->
  <script src="js/charts/sparkline/jquery.sparkline.min.js"></script>
  <!-- Easy Pie Chart -->
  <script src="js/charts/easypiechart/jquery.easy-pie-chart.js"></script>

  <!-- app -->
  <script src="js/app.js"></script>
  <script src="js/app.plugin.js"></script>
  <script src="js/app.data.js"></script>

</html>
