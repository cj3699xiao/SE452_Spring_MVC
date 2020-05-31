function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let shoesnameID = document.querySelector('#shoesnameID'); 
            let storeID = document.querySelector('#storeID'); 
            let crowd = document.querySelector('#crowd'); 
            let style = document.querySelector('#style');
            let shoesname = document.querySelector('#shoesname'); 
            let brand = document.querySelector('#brand'); 
            let material = document.querySelector('#material'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/shoestype/save"; 
        
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
            	"shoesnameID": shoesnameID.value,
            	"storeID": storeID.value,
            	"crowd": crowd.value,
            	"style": style.value,
            	"shoesname": shoesname.value,
                "brand": brand.value,
                "material": material.value
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 