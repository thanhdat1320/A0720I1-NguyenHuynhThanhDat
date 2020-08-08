let clickToCalculate = document.getElementById("btn");
clickToCalculate.onclick = Calculate;
let Tax;
function Calculate() {
    let salary = parseFloat(document.getElementById("inputSalary").value);
    if (isNaN(salary) || salary <0) {
        alert("Enter a wrong salary.");
    } else if (salary > 4000000 || salary <= 6000000) {
        Tax = salary * 5 / 100;
    } else if (salary > 6000000 || salary <= 9000000) {
        Tax = salary * 10 / 100;
    } else if (salary > 9000000 || salary <= 14000000) {
        Tax = salary * 15 / 100;
    } else if (salary > 14000000 || salary <= 24000000) {
        Tax = salary * 20 / 100;
    } else if (salary > 24000000 || salary <= 44000000) {
        Tax = salary * 25 / 100;
    } else if (salary > 44000000 || salary <= 84000000) {
        Tax = salary * 30 / 100;
    } else if (salary > 84000000) {
        Tax = salary * 35 / 100;
    }
    document.getElementById("showResult").innerHTML = Tax;
}