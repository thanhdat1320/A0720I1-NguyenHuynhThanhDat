let clickBaiTap1 = document.getElementById("baiTap1");
let clickBaiTap2 = document.getElementById("baiTap2");
let clickBaiTap3 = document.getElementById("baiTap3");
clickBaiTap1.onclick = baiTap1;
clickBaiTap2.onclick = baiTap2;
clickBaiTap3.onclick = baiTap3;

function baiTap1() {
    let myColor = ["Red", "Green", "White", "Black"];
    let myNewColor = myColor.join();
    console.log(myNewColor);
}

function baiTap2() {
 let num = prompt("Enter a number");
 let str = num.toString();
 let result = [str[0]];
 for (let i = 1; i < str.length; i ++) {
     if (str[i - 1] % 2 === 0 && str[i] % 2 === 0) {
         result.push("-", str[i]);
     } else {
         result.push(str[i]);
     }
 }
 console.log(result.join(""));
}
function baiTap3() {
    let str = [];
    str = prompt("Write some thing");
    let result = "";
    for (let i = 0; i < str.length; i ++) {
        if (str[i] === str[i].toUpperCase()) {
            result += str[i].toLowerCase();
        } else if (str[i] === str[i].toLowerCase()) {
            result += str[i].toUpperCase();
        }
    }
    console.log(result);
}