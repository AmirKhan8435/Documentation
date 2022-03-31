<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - JSON Request Sample</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script>
$(document).ready(()=>{
 
		$("#submit").click(function(){
		
			var bsmapData = {};
			/* bsmapData["plumberServiceMapId"] = 1; */
			bsmapData["bookingTbl"] = $("#bookingTbl").val();
			bsmapData["plumberServiceMapTbl"] = $("#plumberServiceMapTbl").val();
			
			
			$.ajax({
				beforeSend:function(jqXHR,settings){
					jqXHR.setRequestHeader('Content-Type','application/json');
				},
				type : "POST",
				url : "/addBSMap",
				data : JSON.stringify(bsmapData),
						
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
			<td>Booking Id :</td>
			<td><input type="number" id="bookingTbl"></td>
		</tr>
		<tr>
			<td>PlumberServiceMap Id :</td>
			<td><input type="number" id="plumberServiceMapTbl"></td>
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