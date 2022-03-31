<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
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
			<td>Booking-Service Id :</td>
			<td><input type="text" id="bookingServiceMapTbl"></td>
		</tr>
		<tr>
			<td>Overall Rating (1-5):</td>
			<td><input type="number" id="overall" min="1" max="5"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" id="submit" value="submit" /></td>
		</tr>
	</table>
	
	<hr/>
	<div id="displayDiv" style="display:none"><h3>JSON Service sData returned from Server after processing</h3>
		<div id="processedData"></div>
	</div>

</body>
</html>