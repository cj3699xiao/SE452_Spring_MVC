var xhr1 = new XMLHttpRequest(); 

xhr1.open("GET", "/shoes/list", true); 

xhr1.send(); 

xhr1.onreadystatechange = function () { 
    if (xhr1.readyState === 4 && xhr1.status === 200) { 
    	var json1 = xhr1.responseText;
        var rows1 = JSON.parse(json1);
        
        var table1 = document.getElementsByTagName('table')[0];
		for (var j = 0; j < rows1.length; j++) {
			var tr1 = document.createElement('tr');
			var temp1 = rows1[j];
			for ( var i in temp1) {
				var th1 = document.createElement('th');
        		tr1.appendChild(th1);
        		th1.innerHTML = temp1[i];
            }
            table1.appendChild(tr1);
        }	
	} 
}; 



//
function search(){ 
               
            let search_bar = document.querySelector('#search_bar'); 
               
            let xhr = new XMLHttpRequest(); 
            let url = "/search/result/" + search_bar.value; 
        
            xhr.open("GET", url, true); 

            xhr.send(); 

            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 
                	var json = xhr.responseText;
                    var rows = JSON.parse(json);
                    
                    var table = document.getElementsByTagName('table')[0];
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