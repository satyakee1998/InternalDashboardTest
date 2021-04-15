<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/css/sidebar.css">
<link rel="stylesheet" href="resources/css/clientdetails.css">

</head>
<body>

<div class="sidenav">
  <div class="logo"> <a href="#"><img src="resources/image/logo.jpeg"  alt="Nisg" title="Nisg" width="175" height="150" style="border-radius: 15%;" /></a> </div>
  <button class="dropdown-btn">Select Program 
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="dropdown-container">
    <a href="#">NIUM</a>
    <a href="#">MM</a>
  </div>
  <a href="#client-details">Client Details</a>
  <a href="#user-details">User List</a>
  <a href="#user-details" disabled>User Details</a>
</div>
<!-- Here is the main body -->
<div class="main">
  
	<form action="action_page.php">
  <div class="container">
    <h1>Client Details</h1>
    
    <hr>

    <label for="clientname"><b>Client Name</b></label>
    <input type="text" placeholder="Client Name" name="cname" id="cname" required>

    <label for="clientcode"><b>Client Code</b></label>
    <input type="text" placeholder="Client Code" name="ccode" id="ccode" required>

    <label for="mobilenumber"><b>Mobile Number</b></label>
    <input type="text" placeholder="Mobile Number" name="mob" id="mob" required>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Client Email" name="cemail" id="cemail" required>
    <label for="agentcode"><b>Agent Code</b></label>
    <input type="text" placeholder="Client Agent Code" name="clientagcode" id="clientagcode" required>
     <label for="subagentcode"><b>Sub-Agent Code</b></label>
    <input type="text" placeholder="Client Sub-Agent Code" name="clientsubagcode" id="clientsubagcode" required>
    <hr>

    
    <button type="submit" class="registerbtn">User List</button>
  </div>

  
</form>
  
</div>



</body>
</html> 
