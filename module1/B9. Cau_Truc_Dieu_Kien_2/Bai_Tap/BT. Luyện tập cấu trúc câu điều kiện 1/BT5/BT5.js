let clickButton = document.getElementById("btn");
clickButton.onclick = rating;
function rating() {
    let diligentMark = parseFloat(document.getElementById("diligentMark").value);
    let midtermMark = parseFloat(document.getElementById("midtermMark").value);
    let lastMark = parseFloat(document.getElementById("lastMark").value);
    if (isNaN(diligentMark) || isNaN(midtermMark) || isNaN(lastMark) || diligentMark < 0 || midtermMark < 0 || lastMark < 0) {
        alert("Enter wrong mark.");
    } else {
        let sum = (diligentMark * 2 + midtermMark * 3 + lastMark * 5) / 10;
    }
    if (sum >= 8.5) {
        alert("Mark A");
    } else if (sum >= 7) {
        alert("Mark B");
    } else if (sum >= 5.5) {
        alert("Mark C");
    } else if (sum >= 4) {
        alert("Mark D");
    } else {
        alert("Mark F");
    }
}