var botaoCriarInsumo = document.querySelector("#botao-criar-insumo");

botaoCriarInsumo.addEventListener("click", function() {

    var form = document.querySelector("#form-cadastrar-insumo");

    var insumo = {
        nome: form.nome.value,
        tipo: form.tipo.value,
        tempoAcao: form.tempo.value,
        quantRecomendada: form.recomendacao.value
    }

    var xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/insumos");

    xhr.setRequestHeader("Content-type", "application/json");

    xhr.send(JSON.stringify(insumo));

    xhr.addEventListener("load", function() {

        var resposta = xhr.responseText;

        var insumo = JSON.parse(resposta);

        console.log(resposta);

        console.log(insumo.id);

        alert("Cadastrado com sucesso!");

    });

});