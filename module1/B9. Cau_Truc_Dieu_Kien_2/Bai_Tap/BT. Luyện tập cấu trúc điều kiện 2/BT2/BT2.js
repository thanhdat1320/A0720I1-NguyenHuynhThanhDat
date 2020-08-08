let clickToChange = document.getElementById("btn");
clickToChange.onclick = Calculate;
let Feet;
function Calculate() {
    let met = parseFloat(document.getElementById("met").value);
    if (isNaN(met) || met <0) {
        alert("Enter a wrong M.");
    } else {
        Feet = met * 3.2808;
    }
    document.getElementById("showResult").innerHTML = Feet;
}
