<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var feedbackData = {};
			/* feedbackData["plumberServiceMapId"] = 1; */
			feedbackData["bookingServiceMapTbl"] = $("#bookingServiceMapTbl").val();
			feedbackData["overall"] = $("#overall").val();
			
			
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addFeedback",
				data : JSON.stringify(feedbackData),
						
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
	<h2>Enter Feedback Details</h2>
	<form method="post" action="addFeedback">
		<table>
			<tr>
				<td>Booking-Service Id :</td>
				<td><input type="text" id="bookingServiceMapTbl" name="bookingServiceMapTbl"></td>
			</tr>
			<tr>
				<td>Overall Rating (1-5):</td>
				<td><input type="number" id="overall" name="overall" min="1" max="5"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" id="submit" value="submit" /></td>
			</tr>
		</table>
	</form>

	<hr />


</body>
</html>