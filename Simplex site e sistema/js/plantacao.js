var botaoPlantacao = document.querySelector("#cadastrar-plantacao");

botaoPlantacao.addEventListener("click", function() {

    function Talhao(id) {
        this.id = id;
    }

    function Insumo(id) {
        this.id = id;
    }

    event.preventDefault();

    var form = document.querySelector("#form-cadastro-talhao");

    var valorTalhoes = form.talhoes.value;

    var valorInsumos = form.insumos.value;

    var vetorTalhoes = valorTalhoes.split(";");

    var vetorInsumos = valorInsumos.split(";");

    var plantacao = {

        dataCriacao: form.dataCriacao.value,

        cultura: {
            id: form.cultura.value
        },
        talhoes: [

        ],
        insumos: [

        ]
    }

    vetorTalhoes.forEach(function(vetorTalhoes) {

        var cont = 0;

        var id = vetorTalhoes[cont];

        plantacao.talhoes.push(new Talhao(id));

        cont++;

    });

    vetorInsumos.forEach(function(vetorInsumos) {

        var cont = 0;

        var id = vetorInsumos[cont];

        plantacao.insumos.push(new Insumo(id));

        cont++;

    })

    console.log(plantacao);

    var xhr = new XMLHttpRequest();

    xhr.open("POST", "http://localhost:8080/plantacoes");

    xhr.setRequestHeader("Content-type", "application/json");

    xhr.send(JSON.stringify(plantacao));

    xhr.addEventListener("load", function() {

        var resposta = xhr.responseText;

        var plantacao = JSON.parse(resposta);

        alert(plantacao.nome + "A cultura foi criada");

    });


});