function clickYes() {
    alert("Yes. you are right");
}
function clickNo() {
    let weight= Math.random() * window.innerWidth;
    let height = Math.random() * window.innerHeight;
    document.getElementById("clickNo").style.left = weight + "px";
    document.getElementById("clickNo").style.top = height + "px";
}