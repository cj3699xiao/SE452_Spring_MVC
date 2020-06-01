function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let username = document.querySelector('#username'); 
            let password = document.querySelector('#password'); 
            let storeID = document.querySelector('#storeID'); 
            let personalemail = document.querySelector('#personalemail'); 
            let phone = document.querySelector('#phone'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/merchant/save"; 
        
            // open a connection 
            xhr.open("POST", url, true); 
  
            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8"); 
            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 
  
                    // Print received data from server 
                	document.getElementById("login").innerHTML = this.responseText; 
  
                } 
            }; 
  
            // Converting JSON data to string 
            var data = JSON.stringify({ 
            	"username": username.value,
            	"password": password.value,
            	"storeID": storeID.value,
            	"personalemail": personalemail.value,
            	"phone": phone.value,
            	"rating": 0
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 