<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var customerData = {};
			/* customerData["id"] = $("#id").val();  */
			customerData["workDate"] = $("#workdate").val();
			customerData["workTime"] = $("#worktime").val();
			customerData["workAddress"] = $("#workaddress").val();
			customerData["workPincode"] = $("#workpincode").val();
			customerData["bookingDate"] = $("#bdate").val();
			customerData["bookingStatus"] = $("#bstatus").val();
			customerData["bookingTotalAmount"] = $("#btamount").val();
			
		
			
			
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addBooking",
				data : JSON.stringify(customerData),
						
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
	<h2>Enter Booking Details</h2>
	
	<table>
		<!-- <tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr> -->
		<tr>
			<td>Work Date</td>
			<td><input type="date" id="workdate"></td>
		</tr>
		<tr>
			<td>Work Time</td>
			<td><input type="time" step="2" min="9:00" max="20:00" id="worktime" required="required"></td>
		</tr>
		<tr>
			<td>Work Address</td>
			<td><input type="text" id="workaddress"></td>
		</tr>
		<tr>
			<td>Work Pincode</td>
			<td><input type="number" id="workpincode"></td>
		</tr>
		
		<tr>
			<td>Booking Date:</td>
			<td><input type="date" id="bdate"></td>
		</tr>
		
		<tr>
			<td>Booking Status</td>
			<td><input type="text" id="bstatus"></td>
		</tr>
		
		<tr>
			<td>Booking Total Amount</td>
			<td><input type="number" id="btamount"></td>
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