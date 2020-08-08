let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
function Calculate() {
    let A = parseFloat(document.getElementById("InputA").value);
    let B = parseFloat(document.getElementById("InputB").value);
    let C = parseFloat(document.getElementById("InputC").value);
    if (isNaN(A) || isNaN(B) || isNaN(C)) {
        alert("Enter a wrong number.");
    } else if (A > 0 && B > 0 && C > 0 ) {
        if (A + B > C || B + C > A || A + C >B) {
            alert("Là ba cạnh của tam giác.");
        } else {
            alert(" Không phải là ba cạnh của tam giác.")
        }
    } else {
        alert("Failed");
    }
}