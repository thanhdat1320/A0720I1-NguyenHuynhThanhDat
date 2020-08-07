let total = 0;
let num = parseFloat(prompt("Enter a number :"));
while (num != -1) {
    num = parseFloat(prompt("Enter a number:"));
    alert(num);
    total += num;
}
document.getElementById("showTotal").innerHTML = total;
