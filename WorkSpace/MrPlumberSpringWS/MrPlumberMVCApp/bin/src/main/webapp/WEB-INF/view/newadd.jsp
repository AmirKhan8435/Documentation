<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var plumberData = {};
			/* plumberData["id"] = $("#id").val();  */
			plumberData["plumberFirstname"] = $("#firstName").val();
			plumberData["plumberLastname"] = $("#lastName").val();
			plumberData["plumberUsername"] = $("#user").val();
			plumberData["plumberPassword"] = $("#password").val();
			plumberData["plumberAddress"] = $("#address").val();
			plumberData["plumberPincode"] = $("#pincode").val();
			plumberData["plumberAadharNo"] = $("#aadhar").val();
			plumberData["plumberPhone"] = $("#phone").val();
			plumberData["plumberJoindate"] = $("#date").val();
		
			
			
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addajax",
				data : JSON.stringify(plumberData),
						
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
			<td>First Name</td>
			<td><input type="text" id="firstName"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" id="lastName"></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" id="user"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" id="password"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" id="address"></td>
		</tr>
		
		<tr>
			<td>Pincode</td>
			<td><input type="number" id="pincode"></td>
		</tr>
		
		<tr>
			<td>AadharNo.</td>
			<td><input type="text" id="aadhar"></td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td><input type="text" id="phone"></td>
		</tr>
		
		<tr>
			<td>Date</td>
			<td><input type="date" id="date"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="Submit" /></td>
		</tr>
	</table>
	
	<hr/>
	<div id="displayDiv" style="display:none"><h3>JSON Data returned from Server after processing</h3>
		<div id="processedData"></div>
	</div>

</body>
</html>