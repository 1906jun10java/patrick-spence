let Employee = {};

window.onload = function(){
	populateEmployee();
}

function populateEmployee() {
	fetch("http://localhost:8089/Project1/sessionservlet").then(function(response){
		return response.json();
		
	}).then(function(populateEmployee) {
		console.log(data);
		
		if(data.sess === null) {
			window.location = "http://localhost:8089/Project1/companylogin"
		}else {
			PopulateEmployee = data;
			document.getElementById("Employee_FN").innerText = "Employee_FN: "+Employee.Employee_FN;
			document.getElementById("Employee_LN").innerText = "Employee_LN: "+Employee.Employee_LN;
			document.getElementById("Employee_EM").innerText = "Employee_EM: "+Employee.Employee_EM;
			document.getElementById("Employee_RR").innerText = "Employee_RR: "+Employee.Employee_RR;
			document.getElementById("Employee_Id").innerText = "Employee_Id: "+Employee.Employee_Id;
			document.getElementById("Manager_Id").innerText = "Manager_Id: "+Employee.Manager_Id;
		}
	})
}
