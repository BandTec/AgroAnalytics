var botaoAceitarLance = document.querySelector("#leilao");

console.log("Chegou aqui")

botaoAceitarLance.addEventListener("click", function(e) {

    e.preventDefault();

    console.log("OIII");

    var form = document.querySelector("#idOferta");

    var xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/ofertas/aceitarOferta");
    //xhr.open("POST", "http://localhost:8080/culturas?id=" + culturas.id);

    xhr.setRequestHeader("Content-type", "application/json");

    xhr.send(JSON.stringify(form.value));

    xhr.addEventListener("load", function() {

        var resposta = xhr.responseText;

        console.log(resposta);
        
    });

});


