let Fahrenheit;
let clickToChange = document.getElementById("btn");
clickToChange.onclick = Calculate;

function Calculate () {
    let Celsius = parseFloat(document.getElementById("Celsius").value);
    if (isNaN(Celsius) || Celsius <0) {
        alert("Enter a wrong Celsius");
    } else {
         Fahrenheit = Celsius * 9 / 5 + 32;
    }
    document.getElementById("showResult").innerHTML = Fahrenheit;
}