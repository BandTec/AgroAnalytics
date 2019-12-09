var botaoCriarCulturas = document.querySelector("#cadastrar-talhao");

botaoCriarCulturas.addEventListener("click", function() {

    var form = document.querySelector("#form-cadastro-talhao");

    var talhoes = {
        id:form.id.value,
        nome: form.nome.value,
        disponibilidade: form.disponibilidade.value
    }


    var xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/talhoes");

    xhr.setRequestHeader("Content-type", "application/json");

    xhr.send(JSON.stringify(talhoes));

    xhr.addEventListener("load", function() {

        var resposta = xhr.responseText;

        var talhao = JSON.parse(resposta);


        alert('Talhão '+ talhoes.nome+" foi criado.")

     

    });

});