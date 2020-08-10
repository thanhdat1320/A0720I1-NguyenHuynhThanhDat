let clickToCount = document.getElementById("btn");
clickToCount.onclick = ClickCouunt;
function ClickCouunt() {
    for (let count = 1; count <= 100; count ++) {
        document.getElementById("showResult").innerHTML = count;
        if (count === 99) {
            alert("Finish");
        }
    }
}
