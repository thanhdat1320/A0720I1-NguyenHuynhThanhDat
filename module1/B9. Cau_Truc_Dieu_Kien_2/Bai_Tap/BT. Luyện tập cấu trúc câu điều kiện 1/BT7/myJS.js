// Tính cước điện thoại cho một hộ gia đình với các thông số đã cho.
let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = calculate;
let Fxied = 25;
let fee = 0;
function calculate() {
    let minutes = parseInt(document.getElementById("minutes").value);
    if (minutes > 200) {
        fee = (minutes - 200) * 200 + 150 * 400 + 50 * 600;
    } else if (minutes > 50) {
        fee = (minutes - 50) * 400 + 50 * 600;
    } else {
        fee = minutes * 600;
    }
    let total = 0.01 * fee + Fxied;
    document.getElementById("showResult").innerHTML = "Total" + " " + total;
}