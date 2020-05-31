function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let productID = document.querySelector('#productID'); 
            let color = document.querySelector('#color'); 
            let size = document.querySelector('#size'); 
            let price = document.querySelector('#price'); 
            let itemID = document.querySelector('#itemID'); 
            let shoestypeID = document.querySelector('#shoestypeID'); 


               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/shoes/save"; 
        
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
            	"productID": productID.value,
            	"color": color.value,
            	"size": size.value,
            	"price": price.value,
            	"itemID": itemID.value,
            	"shoestypeID": shoestypeID.value
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 