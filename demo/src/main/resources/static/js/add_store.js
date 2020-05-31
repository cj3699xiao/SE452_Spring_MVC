function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let storename = document.querySelector('#storename'); 
            let storeemail = document.querySelector('#storeemail'); 
            let phone = document.querySelector('#phone'); 
            let commentID = document.querySelector('#commentID'); 
            let rating = document.querySelector('#rating');
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/store/save"; 
        
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
            	"storename": storename.value,
            	"storeemail": storeemail.value,
            	"phone": phone.value,
            	"commentID": commentID.value,
            	"rating": rating.value,
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 