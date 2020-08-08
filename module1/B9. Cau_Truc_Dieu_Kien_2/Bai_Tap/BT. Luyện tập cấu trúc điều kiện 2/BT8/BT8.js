let clickToCheck = document.getElementById("btn");
clickToCheck.onclick = isOld;
function isOld() {
    let inputOld = parseInt(document.getElementById("inputOld").value);
    if (isNaN(inputOld) || inputOld > 120 || inputOld < 0 ) {
        alert("Không phải tuổi.")
    } else {
        alert(inputOld + " " + " là tuổi của một người.");
    }
}