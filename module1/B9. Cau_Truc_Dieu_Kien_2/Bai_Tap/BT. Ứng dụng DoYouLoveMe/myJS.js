function clickYes() {
    alert("Yes. you are right");
}
function clickNo() {
    let x = Math.random() * window.innerWidth;
    let y = Math.random() * window.innerHeight;
    document.getElementById("clickNo").style.left = x + "px";
    document.getElementById("clickNo").style.top = y + "px";
}