/*if()
{
	window.onload=function FetchUserList2()
	{


		$.ajax
		({
			method:'GET',
			url:'/userDetailsList2',
	    	timeout : 100000,
 			success : function(data) 
			{	
	    	

            	var obj = JSON.parse(data);

	            var table =  $('#myUserTable');
	             $('#myUserTable').empty() 
	            for (var i = 0; i < obj.length; i++)
				{
			
					   		var val =obj[i];
	    		
		
				var table = '<tr><td>'+i+"\n"+'</td><td id="userId'+i+'" value="'+val['memberId']+'" >'+val['memberId']+"\n"+'</td><td>'
				+val['firstName']+"\n"+'</td><td>'+val['lastName']+"\n"+'</td><td>'+val['email']+"\n"+'</td></tr>';			    	
				$('#myUserTable').append(table)
    
	   			}   
			}
		});
	}
}
else if(document.getElementById("program")=="MM")
{
	window.onload=function FetchUserList()
	{


		$.ajax
		({
			method:'GET',
			url:'/userDetailsList',
	    	timeout : 100000,
 			success : function(data) 
			{	
	    	

            	var obj = JSON.parse(data);

	            var table =  $('#myUserTable');
	             $('#myUserTable').empty() 
	            for (var i = 0; i < obj.length; i++)
				{
			
					   		var val =obj[i];
	    		
		
				var table = '<tr><td>'+i+"\n"+'</td><td id="userId'+i+'" value="'+val['memberId']+'" >'+val['memberId']+"\n"+'</td><td>'
				+val['firstName']+"\n"+'</td><td>'+val['lastName']+"\n"+'</td><td>'+val['email']+"\n"+'</td></tr>';			    	
				$('#myUserTable').append(table)
    
	   			}   
			}
		});
	}
}
*/
function selectOption (){
	if(document.getElementById("program")=="NIUM" ){
		
		
	}
	
	else  {
		
		
	}
	
	
}
