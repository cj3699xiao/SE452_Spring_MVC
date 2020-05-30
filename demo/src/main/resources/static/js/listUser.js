var httpRequest = new XMLHttpRequest();

        httpRequest.open('GET', "/list", true);
        
        httpRequest.send();
        
        httpRequest.onreadystatechange = function () {
            if (httpRequest.readyState == 4 && httpRequest.status == 200) {
                var json = httpRequest.responseText;
                var rows = JSON.parse(json);
                
                var table = document.getElementsByTagName('table')[0];
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
        
        