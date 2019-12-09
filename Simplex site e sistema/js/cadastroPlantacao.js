var botaoCriarCulturas = document.querySelector("#cadastrar-plantacao");



botaoCriarCulturas.addEventListener("click", function() {

var form =  document.querySelector("#form-cadastro-plantacao");


  var plantacoes = {
        dataCriacao: "30/11/1998",
        cultura: {
            id: "1"
        },
        talhoes: [
            { id: form.adicionaId.value }
        ],
        insumos: [
            { id: form.adicionaid2.value }
        ]
    }




    var xhr = new XMLHttpRequest();

  
    xhr.open("POST", "http://localhost:8080/plantacoes");


    xhr.setRequestHeader("Content-type", "application/json");

    xhr.send(JSON.stringify(plantacoes));

    xhr.addEventListener("load", function() {

        var resposta = xhr.responseText;

        var talhao = JSON.parse(resposta);


        alert("vai toma)

     

    });

});