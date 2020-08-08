let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let x;
function Calculate() {
    let NumA = parseFloat(document.getElementById("InputA").value);
    let NumB = parseFloat(document.getElementById("InputB").value);
    if (isNaN(NumA) || NumA <0 || isNaN(NumB) || NumB <0) {
        alert("Enter a wrong number.");
    } else if (NumA === 0 && NumB === 0) {
        alert("Phương trình vô số nghiệm.");
    } else if (NumA === 0 && NumB !== 0) {
        alert("Phương trình vô nghiệm.")
    } else {
        x = -NumB / NumA;
    }
    document.getElementById("showResult").innerHTML = x;
}