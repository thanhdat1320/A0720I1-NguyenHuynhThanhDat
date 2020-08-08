let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let Area;
function Calculate() {
    let NumA = parseFloat(document.getElementById("InputA").value);
    let NumB = parseFloat(document.getElementById("InputB").value);
    if (isNaN(NumA) || NumA <0 || isNaN(NumB) || NumB <0) {
        alert("Enter a wrong number.");
    } else {
        Area = NumA * NumB;
    }
    document.getElementById("showResult").innerHTML = Area;
}