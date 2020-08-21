let clickBai1 = document.getElementById("baiTap1");
let clickBai2 = document.getElementById("baiTap2");
let clickBai3 = document.getElementById("baiTap3");
let clickBai4 = document.getElementById("baiTap4");
let clickBai5 = document.getElementById("baiTap5");
let clickBai6 = document.getElementById("baiTap6");
let clickBai7 = document.getElementById("baiTap7");
let clickBai8 = document.getElementById("baiTap8");
let clickBai9 = document.getElementById("baiTap9");
clickBai1.onclick = baiTap1;
clickBai2.onclick = baiTap2;
clickBai3.onclick = baiTap3;
clickBai4.onclick = baiTap4;
clickBai5.onclick = baiTap5;
clickBai6.onclick = baiTap6;
clickBai7.onclick = baiTap7;
clickBai8.onclick = baiTap8;
clickBai9.onclick = baiTap9;

// Bài Tập 1
function baiTap1() {
    let inputNumber = parseInt(prompt("Enter a number:"));
    let result = "";
    console.log(squareNumber(inputNumber));
    function squareNumber(Number) {
        if (isNaN(Number)) {
            alert("Enter wrong number.");
        } else {
            result = Number * Number;
            return result;
        }
    }
}

// Bài Tập 2
function baiTap2() {
    let inputRadius = parseInt(prompt("Enter Radius"));
    let resultCircumference = "";
    let resultArea = "";
    console.log(Circumference(inputRadius));
    console.log(Area(inputRadius));
    
    function Circumference(radius) {
        if (isNaN(radius) || radius < 0) {
            alert("Enter wrong Radius");
        } else {
            resultCircumference = 2 * Math.PI * radius;
        }
        return resultCircumference;
    }

    function Area(radius) {
        if (isNaN(radius) || radius < 0) {
            alert("Enter wrong Radius");
        } else {
            resultArea =  Math.PI * radius * radius;
        }
        return resultArea;
    }
}

// Bài Tập 3
function baiTap3() {
    let inputNumber = parseInt(prompt("Enter a number"));
    let resultFactorial = 1;
    console.log(calculateFactorial(inputNumber));
    function calculateFactorial(Number) {
        if (Number === 1) {
            return 1;
        } else {
            for (let i = 1; i <= Number; i++) {
                resultFactorial *= i;
            }
            return resultFactorial;
        }
    }
}

// Bài Tập 4
function baiTap4() {
    let inputWord = prompt("Write something:");
    let check = false;
    console.log(checkWord(inputWord));
    function checkWord(Word) {
        if (!isNaN(Word)) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}

// Bài Tập 5
function baiTap5() {
    let inputNumber1 = parseInt(prompt("Enter a number 1:"));
    let inputNumber2 = parseInt(prompt("Enter a number 2:"));
    let inputNumber3 = parseInt(prompt("Enter a number 3:"));
    console.log("Min =" + compare(inputNumber1, inputNumber2, inputNumber3));
    function compare(Number1, Number2, Number3) {
        if (isNaN(Number1) || isNaN(Number2) || isNaN(Number3)) {
            alert("Enter wrong number");
        } else {
            let Min = Number1;
            if (Number2 < Min) {
                Min = Number2;
            } else if (Number3 < Min) {
                Min = Number3
            }
            return Min;
        }
    }
}

// Bài Tập 6
function baiTap6() {
    let inputNumber = parseInt(prompt("Enter a number"));
    let check = false;
    console.log(checkNumber(inputNumber));
    function checkNumber(Number) {
        if (Number > 0) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}

// Bài Tập 7
function baiTap7() {
    let inputNumber1 = parseInt(prompt("Enter a number 1:"));
    let inputNumber2 = parseInt(prompt("Enter a number 2:"));
    checkNumber(inputNumber1, inputNumber2);
    function checkNumber(Number1, Number2) {
        let temp = Number1;
        Number1 = Number2;
        Number2 = temp;
        console.log("Number1 = " + Number1);
        console.log("Number2 = " + Number2);
    }
}

// Bài Tập 8
function baiTap8() {
    let countNumber = parseInt(prompt("Enter number of array:"));
    let arr = [];
    for (let i = 0; i < countNumber; i++) {
        arr[i] = parseInt(prompt("Enter a number:"));
    }
    console.log(reverseArray(arr));
    function reverseArray(array) {
        return array.reverse();
    }
}

// Bài Tập 9
function baiTap9() {
    let countWord = parseInt(prompt("Enter number of array:"));
    let arr = [];
    for (let i = 0; i < countWord; i++) {
        arr[i] = prompt("Write something:");
    }
    console.log(checkWord(arr));
    function checkWord(array) {
        let countWord = 0;
        let word = "";
        let inputWord = prompt("Enter a word to check:");
        for (let j = 0; j < array.length; j++) {
            if (inputWord === array[j]) {
                word = array[j];
                countWord++;
            }
        }
        if (countWord === 0) {
            return -1;
        } else {
            return "Số lần xuất hiện của " + word + " là" + countWord;
        }
    }
}