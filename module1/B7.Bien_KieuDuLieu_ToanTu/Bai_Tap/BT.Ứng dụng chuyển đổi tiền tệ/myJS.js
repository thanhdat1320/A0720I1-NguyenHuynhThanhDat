function convert() {
    let inputCurrency = document.forms["change"]["Amount"];
    let fromCurrency = document.forms["change"]["fromCurrency"];
    let toCurrency = document.forms["change"]["toCurrency"];
    let Currency = parseInt(inputCurrency.value);
    let monney;
    if (fromCurrency.value == toCurrency.value || toCurrency.value == fromCurrency.value) {
        alert("Can't Convert");
    } else  {
        debugger
        if (fromCurrency.value == "VietNam" && toCurrency.value == "USD") {
            monney = Currency * 23000;
            document.getElementById("showResult").innerHTML = "Result:" + " " + monney + "VND";
        } else {
            monney = Currency / 23000;
            document.getElementById("showResult").innerHTML = "Result:" + " " + monney + "USD";
        }
    }
}