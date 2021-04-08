function selectOption()
{

if(document.getElementById("program").value == "MM"){
 var apiurl = "/userDetailsList";
} 
else if(document.getElementById("program").value == "NIUM"){
 var apiurl = "/userDetailsList2";
}
else{
}


	$.ajax({
		method:'GET',
		url:apiurl,
	    timeout : 100000,
 success : function(data) {	
	    	

            	var obj = JSON.parse(data);

	            var table =  $('#myUserTable');
	             $('#myUserTable').empty() 
	            for (var i = 0; i < obj.length; i++){
			
					   		var val =obj[i];
	    		
		
var table = '<tr><td>'+i+"\n"+'</td><td id="userId'+i+'" value="'+val['memberId']+'" >'+val['memberId']+"\n"+'</td><td>'
+val['firstName']+"\n"+'</td><td>'+val['lastName']+"\n"+'</td><td>'+val['email']+"\n"+'</td></tr>';			    	
$('#myUserTable').append(table)
    
	   }   
		}
	});
}