function selectOption()
{
if(document.getElementById("program").value == "MM"){
	document.getElementById("userlist").style.display="block";
 	var apiurl = "/userDetailsListMM";
} 
else if(document.getElementById("program").value == "NIUM"){
	document.getElementById("userlist").style.display="block";
	var apiurl = "/userDetailsListNIUM";
}
else if(document.getElementById("program").value == "SP"){
	document.getElementById("userlist").style.display="none";

}
else{
}


	$.ajax({
		method:"GET",
		url:apiurl,
	    timeout : 100000,
 success : function(data) {	
	    	

            	var obj = JSON.parse(data);

	            var table =  $('#myUserTable');
	             $('#myUserTable').empty() 
	            for (var i = 0; i < obj.length; i++){
			
					   		var val =obj[i];
	    		
		
var table = '<tr><td>'+i+"\n"+'</td><td id="userId'+i+'" value="'+val['companyId']+'" >'+val['companyId']+"\n"+'</td><td>'
+val['companyName']+"\n"+'</td><td>'+val['email']+"\n"+'</td></tr>';			    	
$('#myUserTable').append(table)
    
	   }   
		}
	});
}