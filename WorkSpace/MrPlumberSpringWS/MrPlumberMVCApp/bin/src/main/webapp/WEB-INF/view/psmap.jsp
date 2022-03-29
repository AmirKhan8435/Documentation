<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var psmapData = {};
			/* plumberData["id"] = $("#id").val();  */
			psmapData["plumberInfoTbl"] = $("#plumberId").val();
			psmapData["serviceInfoTbl"] = $("#serviceId").val();
			psmapData["plumberServiceMapId"] = 1;
			console.log(psmapData.serviceName)
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addserviceindata",
				data : JSON.stringify(psmapData),
						
				 success : function(data) {
					$('#processedData').html((data));
					$('#displayDiv').show(); 
					
				}
			});
		});
 
	});
</script>	
</head>
<body>
	<h2>Enter Plumber Details</h2>
	
	<table>
		<!-- <tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr> -->
		<tr>
			<td>Service Id</td>
			<td><input type="text" id="serviceId"></td>
		</tr>
		<tr>
			<td>Plumber Id</td>
			<td><input type="text" id="plumberId"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="Submit" /></td>
		</tr>
	</table>
	
	<hr/>
	<div id="displayDiv" style="display:none"><h3>JSON Service sData returned from Server after processing</h3>
		<div id="processedData"></div>
	</div>

</body>
</html>