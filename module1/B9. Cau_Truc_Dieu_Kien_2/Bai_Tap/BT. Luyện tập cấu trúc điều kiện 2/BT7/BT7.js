let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let x1 = null;
let x2 = null;
function Calculate() {
    let NumA = parseFloat(document.getElementById("InputA").value);
    let NumB = parseFloat(document.getElementById("InputB").value);
    let NumC = parseFloat(document.getElementById("InputC").value);
    let delta = NumB * NumB - 4 * NumA * NumC;
    if (isNaN(NumA) || NumA <0 || isNaN(NumB) || NumB <0 || isNaN(NumC) || NumC <0){
        alert("Enter a wrong number.");
    } else if (delta < 0) {
        alert("Phương trình vô nghiệm.");
    } else if (delta === 0) {
        x1 = x2 = -NumB / (2 * NumA);
        alert("Phuong trình có nghiệm kép x1 = x2 = " + x1 );
    } else {
        delta = Math.sqrt(delta);
        x1 = (-NumB + delta) / (2 * NumA);
        x2 = (-NumB - delta) / (2 * NumA);
        document.getElementById("showResult").innerHTML = "x1 =" + x1 + " " + "x2 =" + x2;
    }
}