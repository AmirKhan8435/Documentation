<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var customerData = {};
			/* customerData["id"] = $("#id").val();  */
			customerData["customerFirstname"] = $("#firstName").val();
			customerData["customerLastname"] = $("#lastName").val();
			customerData["customerUsername"] = $("#user").val();
			customerData["customerPassword"] = $("#password").val();
			customerData["customerAddress"] = $("#address").val();
			customerData["customerPincode"] = $("#pincode").val();
			customerData["customerEmail"] = $("#email").val();
			customerData["customerPhone"] = $("#phone").val();

			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addCustomer",
				data : JSON.stringify(customerData),
						
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
	<h2>Enter Customer Details</h2>

	<form method="post" action="addCustomer">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" id="customerFirstname"
					name="customerFirstname"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" id="customerLastname"
					name="customerLastname"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" id="customerUsername"
					name="customerUsername"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" id="customerPassword"
					name="customerPassword"></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><input type="text" id="customerAddress"
					name="customerAddress"></td>
			</tr>

			<tr>
				<td>Pincode</td>
				<td><input type="number" id="customerPincode"
					name="customerPincode"></td>
			</tr>

			<tr>
				<td>Email Address</td>
				<td><input type="text" id="customerEmail" name="customerEmail"></td>
			</tr>

			<tr>
				<td>Phone</td>
				<td><input type="text" id="customerPhone" name="customerPhone"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" id="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

	<hr />


</body>
</html>