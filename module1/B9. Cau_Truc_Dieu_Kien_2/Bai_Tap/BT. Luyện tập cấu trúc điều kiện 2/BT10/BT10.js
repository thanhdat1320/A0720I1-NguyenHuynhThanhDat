let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let Money;
function Calculate() {
    let Kw = parseFloat(document.getElementById("inputKw").value);
    if (isNaN(Kw) || Kw <0) {
        alert("Enter a wrong Kw.");
    } else if (Kw >= 201) {
        Money = (Kw - 200) * 1100 + (200 - 150) * 900 + (150 - 100) * 700 + 100 * 600;
    } else if (151 <= Kw && Kw <= 200 ) {
        Money = (200 - 150) * 900 + (150 - 100) * 700 + 100 * 600;
    } else if (101 <= Kw && Kw <= 150) {
        Money = (150 - 100) * 700 + 100 * 600;
    } else {
        Money = Kw * 600;
    }
    document.getElementById("showResult").innerHTML = Money;
}