<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var psmapData = {};
			psmapData["plumberServiceMapId"] = 1;
			psmapData["plumberInfoTbl"] = $("#plumberId").val();
			psmapData["serviceInfoTbl"] = $("#serviceId").val();
			
			
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addpsmapdata",
				data : JSON.stringify(psmapData),
						
				 success : function(data) {
					$('#processedData').html((data));
					$('#displayDiv').show(); 
					
				}
			});
		});
 
	});
</script>	 -->
</head>
<body>
	<h2>Enter Plumber Details</h2>
	
	<form method="post" action="addpsmapdata">
	<table>
		<tr>
			<td>Service Id :</td>
			<td><input type="text" id="serviceInfoTbl" name="serviceInfoTbl"></td>
		</tr>
		<tr>
			<td>Plumber Id :</td>
			<td><input type="text" id="plumberInfoTbl" name="plumberInfoTbl"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="submit" /></td>
		</tr>
	</table>
	</form>
	
	<hr/>
	

</body>
</html>