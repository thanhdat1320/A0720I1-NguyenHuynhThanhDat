let total = 0;
let num = parseFloat(prompt("Enter a number :"));
while (num != -1) {
    total += num;
    document.getElementById("showResult").innerHTML = num;
    num = parseFloat("Enter a number:");
}
document.getElementById("showTotal").innerHTML = total;
