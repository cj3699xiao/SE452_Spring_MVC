function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let brand = document.querySelector('#brand'); 
            let type = document.querySelector('#type'); 
            let material = document.querySelector('#material'); 
            let color = document.querySelector('#color'); 
            let description = document.querySelector('#description'); 
            let size = document.querySelector('#size'); 
            let price = document.querySelector('#price'); 
       


               
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
            	"brand": brand.value,
            	"type": type.value,
            	"material": material.value,
            	"color": color.value,
            	"description": description.value,
            	"size": size.value,
            	"price": price.value
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 