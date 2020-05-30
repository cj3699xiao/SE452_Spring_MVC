function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let customerID = document.querySelector('#customerID'); 
            let storeID = document.querySelector('#storeID'); 
            let CustomeraddressID = document.querySelector('#customeraddressID'); 
            let MerchantaddressID = document.querySelector('#merchantaddressID'); 
            let orderprice = document.querySelector('#orderprice');
            let paymentmethod = document.querySelector('#paymentmethod'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "/order/save"; 
        
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
            	"customerID": customerID.value,
            	"storeID": storeID.value,
            	"customeraddressID": customeraddressID.value,
            	"merchantaddressID": merchantaddressID.value,
            	"orderprice": orderprice.value,
            	"paymentmethod": paymentmethod.value
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
        } 