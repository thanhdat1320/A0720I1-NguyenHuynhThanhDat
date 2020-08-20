let clickBai1 = document.getElementById("baiTap1");
let clickBai2 = document.getElementById("baiTap2");
let clickBai3 = document.getElementById("baiTap3");
let clickBai4 = document.getElementById("baiTap4");
let clickBai5 = document.getElementById("baiTap5");
let clickBai6 = document.getElementById("baiTap6");
clickBai1.onclick = baiTap1;
clickBai2.onclick = baiTap2;
clickBai3.onclick = baiTap3;
clickBai4.onclick = baiTap4;
clickBai5.onclick = baiTap5;
clickBai6.onclick = baiTap6;

function baiTap1() {
    let arr = new Array();
    for (let i = 0; i < 4; i++) {
        arr[i] = new Array();
        console.log("Row" + i);
        for (let j = 0; j < 5; j++) {
            arr[i][j] = parseInt(prompt("Enter a number in array B:"));
            console.log("" + arr[i][j]);
        }
    }
}

function baiTap2() {
    let newString = "";
    let arr = [];
    let count = parseInt(prompt("Number of array element:"));
    for (let i = 0; i < count; i++) {
        arr[i] = prompt("write something:");
    }
    console.log(arr);
    for (let j = arr.length - 1; j >= 0; j--) {
       newString += arr[j];

    }
    console.log(newString);
}

function baiTap3() {
    let arr = [];
    let countNumber = 0;
    let count = parseInt(prompt("Number of array element:"));
    for (let i = 0; i < count; i++) {
        arr[i] = prompt("write something:");
    }
    console.log(arr);
    for (let j = 0; j < arr.length; j++) {
        if (!isNaN(arr[j])) {
            countNumber++;
        }
    }
    alert(countNumber);
}

function baiTap4() {
    let count = 0;
    let inputString = prompt("Write something:");
    for (let i = 0; i < inputString.length; i++) {
        if (inputString[i] === " ") {
            count++;
        }
    }
    let word = count + 1;
    alert("Have" + " " + " word" + word + " in your string.");
}

function baiTap5() {
    let stringA = prompt("Write string A:");
    let stringB = prompt("Write string B:");
    if (stringA === stringB) {
        alert("resemble");
    } else {
        alert("not resemble");
    }
}

function baiTap6() {
    let arr = [];
    let count = parseInt(prompt("Number of array element:"));
    for (let i = 0; i < count; i++) {
        arr[i] = prompt("write something:");
    }
    console.log(arr);
    for (let j = 0; j < arr.length; j++) {
        if (arr[j] === "-") {
            arr[j] = "_";
        }
    }
    console.log(arr);
}