let broadOfCaro = new Array();
let isCheckPerson = true;

function init() {
    for (let i = 0; i < 5; i ++) {
        broadOfCaro[i] = new Array();
        for (let j = 0; j < 5; j++) {
            broadOfCaro[i][j] = "";
        }
    }
}

function displayCaro() {
    let temp = "<table border='1' cellpadding='20'>";
    for (let i = 0; i < 5; i ++) {
        temp += "<tr>";
        for (let j = 0; j < 5; j ++) {
            temp += "<td onclick='changeCaro("+ i +", "+ j +")'>" + broadOfCaro[i][j] + "</td>";
        }
        temp += "</tr>";
    }
    temp += "</table>";
    document.write(temp);
}

function changeCaro(x, y) {
    if (broadOfCaro[x][y] === "X" || broadOfCaro[x][y] === "O" ) {
        alert("Ô nãy đã được chọn.");
    } else {
        if (isCheckPerson) {
            broadOfCaro[x][y] = "X";
            isWinner("X");
            isCheckPerson = false;
        } else {
            broadOfCaro[x][y] = "O";
            isWinner("O");
            isCheckPerson = true;
        }
        document.body.innerHTML = "";
        displayCaro();
    }
}

function isWinner(temp) {
    for (let i = 0; i < 5; i ++) {
        for (let j = 0; j < 5; j++) {
            if ((broadOfCaro[i][j] === temp && broadOfCaro[i][j + 1] === temp && broadOfCaro[i][j + 2] === temp) ||
                (broadOfCaro[i][j] === temp && broadOfCaro[i + 1][j] === temp && broadOfCaro[i + 2][j] === temp) ||
                (broadOfCaro[i][j] === temp && broadOfCaro[i + 1][j + 1] === temp && broadOfCaro[i + 2][j + 2] === temp) ||
                (broadOfCaro[i][j] === temp && broadOfCaro[i + 1][j - 1] === temp && broadOfCaro[i + 2][j - 2] === temp)){
                alert( temp + "win");
                init();
                displayCaro();
            }
        }
    }
}
init();
displayCaro();