let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let Area;
function Calculate() {
    let EnterA = parseFloat(document.getElementById("InputA").value);
    if (isNaN(EnterA) || EnterA <0) {
        alert("Enter a wrong A.");
    } else {
        Area = EnterA * 4;
    }
    document.getElementById("showResult").innerHTML = Area;
}