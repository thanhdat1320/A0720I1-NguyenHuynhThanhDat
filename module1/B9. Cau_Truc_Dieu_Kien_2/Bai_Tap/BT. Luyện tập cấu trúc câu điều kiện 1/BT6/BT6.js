let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = calculate;
function calculate() {
    let revenue = parseFloat(document.getElementById("revenue").value);
    let commission;
    if (isNaN(revenue) || revenue < 0) {
        alert("Enter wrong revenue.");
    } else if (revenue <= 100) {
        commission = revenue * 5 / 100;
    } else if (revenue < 300) {
        commission = revenue * 10 / 100;
    } else if (revenue > 300) {
        commission = revenue * 20 / 100;
    }
    document.getElementById("showResult").innerHTML = "Earned" + " " + commission;
}
