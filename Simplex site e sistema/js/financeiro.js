var referenciaInsumo = document.querySelector("#grafico-insumos-anual").getContext("2d");

var referenciaInvestimento = document.querySelector("#grafico-investimento-anual").getContext("2d");

var tabelaInvestimento = new Chart(referenciaInvestimento, {
    type: 'bar',
    data: {
        labels: ["JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"],
        datasets: [{
                label: "Investimento.",
                backgroundColor: "green",
                borderColor: "green",
                data: [20, 1, 2, 2, 4, 9, 1, 2, 3, 1, 3, 8],

            },
            {
                label: "Gasto.",
                backgroundColor: "red",
                borderColor: "red",
                data: [20, 10, 20, 2, 4, 90, 10, 20, 30, 10, 3, 3],
                borderWidth: 3

            }, {
                label: "Venda de culturas.",
                backgroundColor: "blue",
                borderColor: "blue",
                data: [10, 10, 20, 2, 4, 90, 10, 20, 30, 1, 3, 8],
                borderWidth: 3
            }
        ], 
        borderWidth: 1
        
    },
    options: {
        title: {
            text: "Investimentos, vendas e gasto em 2019.",
            display: true,
            fontSize: 40
        }
    }

});

var tabelaInsumo = new Chart(referenciaInsumo, {

    type: 'line',
    data: {
        labels: ["JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"],
        datasets: [{
                label: "TIPO A",
                backgroundColor: "transparent",
                borderColor: "blue",
                data: [20.000, 100.000, 200.000, 2.220, 4.000, 9.000, 100, 2.000, 3.300, 1.000, 3.344, 8.923],
                borderWidth: 3


            },
            {
                label: "TIPO B",
                backgroundColor: "transparent",
                borderColor: "green",
                data: [10, 100, 200, 2, 4, 90, 10, 20, 30, 100, 344, 823],
                borderWidth: 3

            }
        ],
    },
    options: {
        title: {
            text: "Gastos com insumos comprados em 2019.",
            display: true,
            fontSize: 40
        }
    }
});