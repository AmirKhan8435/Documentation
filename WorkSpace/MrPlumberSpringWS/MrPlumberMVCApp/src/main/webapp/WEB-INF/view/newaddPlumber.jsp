<%@page import="project.entities.*"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>

<!-- <script>
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
</script>	 -->
</head>
<body>
	<h2>Enter Plumber Details</h2>
	<p>${plumber.getPlumberLastname()} </p>
	<form action="addajax" method="post">
	<table>
		<!-- <tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr> -->
		<tr>
			<td>First Name</td>
			<td><input type="text" id="plumberFirstname" name="plumberFirstname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" id="plumberLastname" name="plumberLastname"></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" id="plumberUsername" name="plumberUsername"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" id="plumberPassword" name="plumberPassword"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" id="plumberAddress" name="plumberAddress"></td>
		</tr>
		
		<tr>
			<td>Pincode</td>
			<td><input type="number" id="plumberPincode" name="plumberPincode"></td>
		</tr>
		
		<tr>
			<td>AadharNo.</td>
			<td><input type="text" id="plumberAadharNo" name="plumberAadharNo"></td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td><input type="text" id="plumberPhone" name="plumberPhone"></td>
		</tr>
		
		<tr>
			<td>Date</td>
			<td><input type="date"  id="plumberJoindate" name="plumberJoindate"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="Submit" /></td>
		</tr>
	</table>
	</form>
	

</body>
</html>