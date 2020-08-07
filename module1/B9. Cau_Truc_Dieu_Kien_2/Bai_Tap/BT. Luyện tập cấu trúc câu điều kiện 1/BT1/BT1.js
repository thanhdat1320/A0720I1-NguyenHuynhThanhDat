let clickButton = document.getElementById("btn");
    clickButton.onclick = function calculate() {
        let numberA = parseFloat(document.getElementById("numberA").value);
        let numberB = parseFloat(document.getElementById("numberB").value);
        if (numberB === 0 || isNaN(numberB) || isNaN(numberA)) {
            alert("Input wrong number.");
        } else {
            let mul = numberA / numberB;
            alert(mul);
        }
    }
