let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
function Calculate() {
    let startMoney = parseFloat(document.getElementById("inputMoney").value);
    let timeMonth = parseFloat(document.getElementById("inputMonth").value);
    if (isNaN(startMoney) || startMoney < 0 || isNaN(timeMonth) || timeMonth < 0) {
        alert("Enter wrong.");
    } else {
        for (let  i = 0; i < timeMonth; i ++) {
            startMoney = startMoney + startMoney * 0.3 / 100;
        }
        document.getElementById("showResult").innerHTML = startMoney;
    }
}