function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let username = document.querySelector('#username'); 
            let password = document.querySelector('#password'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/login/merchant/" + username.value + "/" + password.value; 
        
            // open a connection 
            xhr.open("GET", url, true); 
  
            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8"); 
            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) {
                	let tr = this.responseText;
                    if(tr == "merchant") {
                    	document.getElementById("wrong").innerHTML = "Wrong username or password";
                    }
                    else {
	                	document.getElementById("address").innerHTML = tr; 
	                	window.location.href = document.getElementById("address").innerHTML;
                    }
                } 
            }; 
            
  
            // Sending data with the request 
            xhr.send(); 
        } 