function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let shoesID = document.querySelector('#shoesID'); 
            let storeID = document.querySelector('#storeID'); 
            let orderID = document.querySelector('#orderID'); 
            let customerID = document.querySelector('#customerID');
            let quantity = document.querySelector('#quantity'); 
            let note = document.querySelector('#note'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/item/save"; 
        
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
            	"shoesID": shoesID.value,
            	"storeID": storeID.value,
            	"orderID": orderID.value,
            	"customerID": customerID.value,
            	"quantity": quantity.value,
                "note": note.value,
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 