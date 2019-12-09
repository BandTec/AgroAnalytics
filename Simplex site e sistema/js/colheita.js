var botaoCriarCulturas = document.querySelector("#botao-cadastrar-colheita");

botaoCriarCulturas.addEventListener("click", function() {

    event.preventDefault();

    var form = document.querySelector("#cadastro-colheita");

    var colheitas = {
        plantacao : {
        id : form.idPlantacao.value
    },
        dataColheita: form.dataColheita.value,
        precoCaixa: form.precoCaixa.value,
        quantCaixas: form.quantCaixas.value
    }


    console.log("Esta merda");

    var xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/colheitas");

    xhr.setRequestHeader("Content-type", "application/json");

    console.log("Esta merda");

    xhr.send(JSON.stringify(colheitas));

    console.log("Esta merda");

    xhr.addEventListener("load", function() {

        console.log("Esta merda");

        var resposta = xhr.responseText;

        console.log("Esta merda");

        var culturas = JSON.parse(resposta);

        alert('colheita foi criado, talhões liberados')

    });

});