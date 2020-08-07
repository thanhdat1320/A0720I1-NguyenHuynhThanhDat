let clickButton = document.getElementById("btn");
clickButton.onclick = checkNumber;
function checkNumber() {
    let Number = parseInt(document.getElementById("Number").value);
    if (isNaN(Number)) {
        alert("Enter wrong number");
    } else if (Number > 0) {
        alert("This number is larger than zero");
    } else {
        alert("This number is smaller than zẻo");
    }
}