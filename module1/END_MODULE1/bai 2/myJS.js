let number1;
let number2;
let sumNumber1 = 0;
let sumNumber2 = 0;
let checkNum = false;
do {
    number1 = parseInt(prompt("Enter number 1:"));
} while (number1 <= 0 || isNaN(number1));

do {
    number2 = parseInt(prompt("Enter number 2:"));
} while (number2 <= 0 || isNaN(number2));

function isNumber(num1, num2) {
    for (let i = 1; i < num1; i++) {
        if (num1 % i === 0) {
            sumNumber1 += i;
        }
    }
    for (let j = 1; j < num2; j++) {
        if (num2 % j === 0) {
            sumNumber2 += j;
        }
    }
    if (sumNumber1 === sumNumber2) {
        checkNum = true;
    }
    console.log(checkNum);
}
isNumber(number1, number2);





