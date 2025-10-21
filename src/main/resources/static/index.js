function search() {
    
    fetch(`http://localhost:8080/lineal?name=${nameVar}&search=${search}`)
        .then(response => response.text())
        .then(data => {
            document.getElementById("getrespmsg").innerHTML = data;
        })
        .catch(error => {
            console.error('Error:', error);
            document.getElementById("getrespmsg").innerHTML = "An error occurred.";
        });
    }