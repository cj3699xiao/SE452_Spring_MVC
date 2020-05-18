var httpRequest = new XMLHttpRequest();

        httpRequest.open('GET', "/list", true);
        
        httpRequest.send();
        
        httpRequest.onreadystatechange = function () {
            if (httpRequest.readyState == 4 && httpRequest.status == 200) {
                var json = httpRequest.responseText;
                document.getElementById("userList").innerHTML=json;
            }
        };