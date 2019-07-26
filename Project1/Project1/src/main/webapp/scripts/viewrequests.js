let Request = {};

window.onload = function(){
	populateRequest();
}

function populateRequest() {
	fetch("jdbc.oracle.thin:PS_Java_19/Revature@localhost:1521:orcl")//fetches the file
	.then(response =>{
		return response.json();//promise to the containing object 

	}).then(function(populateEmployee) {
		console.log(data);

		if(data.sess === null){
			window.location = "http://localhost:8089/Project1/updaterequest"
		}else {
			populateRequest = data;

			for(i = 0; populateRequest.length; i++){
				let rq = document.createElement("rq");
				let Reimbursement_Id = '${populateRequest[i].requestReimbursement_Id}';
				let Employee_Id = populateRequest[i].empId;
				let Employee_FN = populateRequest[i].empFN;
				let Employee_EM = populateRequest[i].empEmail;
				let Request_Id = populateRequest[i].reqId;


			}

		}
	})
}
