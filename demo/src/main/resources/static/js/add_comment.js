function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let userID = document.querySelector('#userID'); 
            let storeID = document.querySelector('#storeID'); 
            let rating = document.querySelector('#rating'); 
            let commentwords = document.querySelector('#commentwords');              
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/comments/save"; 
        
            // open a connection 
            xhr.open("POST", url, true); 
  
            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8"); 
            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 
  
                    // Print received data from server 
                    result.innerHTML = this.responseText; 
  
                } 
            }; 
            
            // Converting JSON data to string 
            var data = JSON.stringify({ 
            	"userID": userID.value,
            	"storeID": storeID.value,
            	"rating": rating.value,
            	"commentwords": commentwords.value,
            	"likesdislike": 2
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 