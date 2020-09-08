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

function baiTap1() {
    let arr = [];
    let  count = 0;
    for (let i = 0; i < 10 ; i ++) {
        arr[i] = parseInt(prompt("Enter a numer"));
        if (arr[i] > 10) {
         count++;
        }
        console.log(arr);
    }
    alert("Có" + " " + count + " lớn hơn 10");
}

function baiTap2() {
    let arr = [];
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("Enter a numer"));
    }
    let max = arr[0];
    let indexMax = 0;
    for (let j = 1; j < arr.length; j++) {
        if (arr[j] > max) {
            max = arr[j];
            indexMax = j;
        }
        console.log(arr);
    }
    alert(max + " lớn nhất trong mảng ở vị trí" + " " + indexMax);
}

function baiTap3() {
    let arr = [];
    let overage = 0;
    let index = 0;
    let sum = 0;
    let count = parseInt(prompt("Bạn muốn nhập bao nhiêu số"));
    for (let j = 0; j < count; j++) {
        arr[j] = parseFloat(prompt("Enter a number"));
    }
    let max = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
        sum += arr[i];
        console.log(arr);
    }
    overage = sum / index;
    alert("Overage=" + overage + " " + "Max=" + max);
}

function baiTap4() {
    let arr = [];
    let count = parseInt(prompt("Bạn muốn nhập bao nhiêu số"));
    for (let j = 0; j < count; j++) {
        arr[j] = parseInt(prompt("Enter a number"));
    }
    console.log(arr.reverse())
}

function baiTap5() {
    let inputSomeThing = "";
    inputSomeThing = prompt("Write some thing:");
    let count = 0;
    for (let i = 0; i < inputSomeThing.length; i++ ) {
        if (inputSomeThing[i] === "u" || inputSomeThing[i] === "e" || inputSomeThing[i] === "o" || inputSomeThing[i] === "a" || inputSomeThing[i] === "i") {
            count++;
        }
    }
    console.log(inputSomeThing);
    alert(count);
}

function baiTap6() {
    let arr = [];
    let check = false;
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("Enter a number in the array:"));
    }
    console.log(arr);
    let Num = parseInt(prompt("Enter a Number to check:"));
    for (let j = 0; j < arr.length; j++) {
        if (Num === arr[j]) {
            check = true;
        }
    }
    if (check) {
        alert(Num + " is in the array");
    } else {
        alert(Num + " is not in the array");
    }
}

function baiTap7() {
    let arr = [];
    let check = false;
    let index = 0;
    for (let i = 0; i < 10; i++) {
        arr[i] = parseInt(prompt("Enter a number in the array:"));
    }
    console.log(arr);
    let Num = parseInt(prompt("Enter a Number to check:"));
    for (let j = 0; j < arr.length; j++) {
        if (Num === arr[j]) {
            index = j;
            check = true;
        }
    }
    if (check) {
      for (let k = index; k < 10; k++) {
          arr[k] = arr[k + 1];
          if (k === 9) {
              arr[k] = 0;
          }
      }
    } else {
        alert(Num + " is not in the array");
    }
}

function baiTap8() {
    let arr = [];
    for (let i = 0; i < 10; i ++) {
        arr[i] = parseInt(prompt("Enter a number in array:"));
    }
    let temp = "";
    let index = arr.length;
    for (let i = index - 1; i >= 0; i --) {
        for (let j = 1; j <= i; j ++) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    console.log(arr);
}

function baiTap9() {
    let arrA = [];
    let arrB = [];
    let arrC = new Array(20);
    for (let i = 0; i < 10; i++) {
        arrA[i] = parseInt(prompt("Enter a number in array A:"));
    }
    console.log(arrA);
    for (let j = 0; j < 10; j++) {
        arrB[j] = parseInt(prompt("Enter a number in array B:"));
    }
    console.log(arrB);
    arrC = arrA.concat(arrB);
    console.log(arrC);
}