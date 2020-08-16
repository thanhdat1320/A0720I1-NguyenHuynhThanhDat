let boardOfCaro = new Array();
let clickToInput = document.getElementById("btn");
clickToInput.onclick = inputNumber;



function init() {
    for (let i = 0; i < 5; i++) {
        boardOfCaro[i] = new Array();
        for (let j = 0; j < 5; j++) {
           boardOfCaro[i][j] = "O";
        }
    }
}
init();

function inputNumber() {
    let positionX = prompt("X +");
    let positionY = prompt("Y +");
     boardOfCaro[positionX][positionY] = "X";

}

function displayCaro() {
    let temp = "<table border='1' cellpadding='10' width='300px' height='300px'>";
    for (let i = 0; i < 5; i++) {
        temp += "<tr>";
        for (let j = 0; j < 5; j++) {
            temp += "<td>" + boardOfCaro[i][j] + "</td>";
        }
        temp += "</tr>";
    }
    temp += "</table">
    document.write(temp)
}
displayCaro();