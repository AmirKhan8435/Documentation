<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var serviceData = {};
			/* serviceData["serviceId"] = 1; */
			serviceData["serviceName"] = $("#serviceName").val();
			serviceData["serviceAmount"] = $("#serviceAmount").val();
			
			console.log(serviceData.serviceName)
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addserviceindata",
				data : JSON.stringify(serviceData),
						
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
	
	<table >
		<!-- <tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr> -->
		<tr>
			<td>Enter Service Name : </td>
			<td><input type="text" id="serviceName"></td>
		</tr>
		<tr>
			<td>Enter Service amount : </td>
			<td><input type="text" id="serviceAmount"></td>
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