let textArray = ["H", "e", "l", "l","o"];

function data() {
    let result = "";
    let text = document.getElementById("display");
    let j = text.length;
    if (j > 0) {
        for (let i = 0; i < j; i++) {
            result += textArray[i];
        }
    }
    document.getElementById("display").value = result;
}