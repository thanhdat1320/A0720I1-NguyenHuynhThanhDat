let clickButton = document.getElementById("btn");
    clickButton.onclick = checkNumber;
function checkNumber() {

    let numberA = parseInt(document.getElementById("numberA").value);
    let numberB = parseInt(document.getElementById("numberB").value);
    let numberC = parseInt(document.getElementById("numberC").value);
    let max = numberA;
    if (isNaN(numberA) || isNaN(numberB) || isNaN(numberC)) {
        alert("Enter the wrong number.");
    } else if (max < numberB) {
        max = numberB;
    } else if (max < numberC) {
        max = numberC;
    }
    alert(max);
}