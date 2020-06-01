function sendJSON(){ 
               
            let result = document.querySelector('.result'); 
            let customerID = document.querySelector('#shoesID'); 
//            let customerID = document.querySelector('#customerID'); 
//            let storeID = document.querySelector('#storeID'); 
//            let CustomeraddressID = document.querySelector('#customeraddressID'); 
//            let MerchantaddressID = document.querySelector('#merchantaddressID'); 
//            let orderprice = document.querySelector('#orderprice');
//            let paymentmethod = document.querySelector('#paymentmethod'); 
               
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
            	"shoesID": shoesID.value,
//            	"customerID": customerID.value,
//            	"storeID": storeID.value,
//            	"customeraddressID": customeraddressID.value,
//            	"merchantaddressID": merchantaddressID.value,
//            	"orderprice": orderprice.value,
//            	"paymentmethod": paymentmethod.value
            	}); 
  
            // Sending data with the request 
            xhr.send(data); 
            
            var httpRequest = new XMLHttpRequest();
            var url2 = "/order/list";
            httpRequest.open('GET', url2, true);

            httpRequest.send();

            httpRequest.onreadystatechange = function () {
                if (httpRequest.readyState == 4 && httpRequest.status == 200) {
                    var json = httpRequest.responseText;
                    var rows = JSON.parse(json);
                    
                    var table = document.getElementsByTagName('table')[1];
                    table.innerHTML = "";
            		for (var j = 0; j < rows.length; j++) {
            			var tr = document.createElement('tr');
            			var temp = rows[j];
            			for ( var i in temp) {
            				var th = document.createElement('th');
            				tr.appendChild(th);
            				th.innerHTML = temp[i];
            			}
            			table.appendChild(tr);
            		}	
                }
            };
            
            
        } 