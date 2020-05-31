function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let state = document.querySelector('#state'); 
            let city = document.querySelector('#city'); 
            let streetapt = document.querySelector('#streetapt'); 
            let zipcode = document.querySelector('#zipcode'); 

               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/address/save"; 
        
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
            	"result": result.value,
            	"state": state.value,
            	"city": city.value,
            	"streetapt": streetapt.value,
            	"zipcode": zipcode.value,
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 