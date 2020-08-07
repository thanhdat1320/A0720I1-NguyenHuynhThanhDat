let num = parseInt(prompt("Enter a number:"));
let total = 0;
for (let i = 0; i <= num; i++) {
    total += i;
}
document.getElementById("show").innerHTML = total;
