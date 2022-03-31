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
</script> -->	
</head>
<body>
	<h2>Enter Booking Details</h2>
	
	<form method="post" action="addBooking"></form>
	<table>
		<!-- <tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr> -->
		<tr>
			<td>Work Date</td>
			<td><input type="date" id="workDate" name="workDate"></td>
		</tr>
		<tr>
			<td>Work Time</td>
			<td><input type="time"  id="workTime" name="workTime" step="2" min="9:00" max="20:00" required="required"></td>
		</tr>
		<tr>
			<td>Work Address</td>
			<td><input type="text" id="workAddress" name="workAddress"></td>
		</tr>
		<tr>
			<td>Work Pincode</td>
			<td><input type="number" id="workPincode" name="workPincode"></td>
		</tr>
		
		<tr>
			<td>Booking Date:</td>
			<td><input type="date" id="bookingDate" name="bookingDate"></td>
		</tr>
		
		<tr>
			<td>Booking Status</td>
			<td><input type="text" id="bookingStatus" name="bookingStatus"></td>
		</tr>
		
		<tr>
			<td>Booking Total Amount</td>
			<td><input type="number" id="bookingTotalAmount" name="bookingTotalAmount"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="Submit" /></td>
		</tr>
	</table>
	</form>
	
	<hr/>
	

</body>
</html>