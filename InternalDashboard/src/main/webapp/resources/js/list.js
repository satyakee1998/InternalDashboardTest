window.onload = function hide () {
	document.getElementById("for_numrows").style.display = "none";
		document.getElementById("for_filter_by").style.display = "none";
		document.getElementById("pagesControllers").style.display = "none";
}

function selectOption() {
	


	if (document.getElementById("program").value == "MM") {
	document.getElementById("for_numrows").style.display = "block";
		document.getElementById("for_filter_by").style.display = "block";
		document.getElementById("pagesControllers").style.display = "block";
		document.getElementById("userlist").style.display = "block";
		var apiurl = "/userDetailsListMM";

	}
	else if (document.getElementById("program").value == "NIUM") {

	document.getElementById("for_numrows").style.display = "block";
		document.getElementById("for_filter_by").style.display = "block";
		document.getElementById("pagesControllers").style.display = "block";
		document.getElementById("userlist").style.display = "block";
		var apiurl = "/userDetailsListNIUM";


	}
	else if (document.getElementById("program").value == "SP") {
		document.getElementById("userlist").style.display = "none";
		document.getElementById("for_numrows").style.display = "none";
		document.getElementById("for_filter_by").style.display = "none";
		document.getElementById("pagesControllers").style.display = "none";

	}
	else {
	}
	$.ajax({
		method: "GET",
		url: apiurl,
		timeout: 100000,
		success: function(data) {


			var obj = JSON.parse(data);

			var table = $('#myUserTable');
			$('#myUserTable').empty()
			for (var i = 0; i < obj.length; i++) {

				var val = obj[i];


				var table = '<tr><td>' + (i+1) + "\n" + '</td><td id="userId' + i + '" value="' + val['companyId'] + '" >' + val['companyId'] + "\n" + '</td><td>' + val['companyName'] + "\n" + '</td><td>' + val['email'] + "\n" + '</td><td>' + "<a href = '/nisginternalcustomer?companyId=" + val['companyId'] + "&email=" + val['email'] + "' class='bo'> Details</a> <div class='clearfix'></div></td></tr>";
				$('#myUserTable').append(table)

			}
		}
	});
	
}

