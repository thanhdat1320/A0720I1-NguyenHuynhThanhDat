let clickBai1 = document.getElementById("baiTap1");
let clickBai2 = document.getElementById("baiTap2");
let clickBai3 = document.getElementById("baiTap3");
let clickBai4 = document.getElementById("baiTap4");
let clickBai5 = document.getElementById("baiTap5");
clickBai1.onclick = baiTap1;
clickBai2.onclick = baiTap2;
clickBai3.onclick = baiTap3;
clickBai4.onclick = baiTap4;
clickBai5.onclick = baiTap5;

function baiTap1() {
    alert("Xin Chào");
}

function baiTap2() {
    let Number = parseInt(prompt("Enter number:"));
    function increaseNumber(Number) {
        Number++;
        console.log(Number);
    }
    increaseNumber(Number);
}

function baiTap3() {
    function sumOfNumber(num1, num2) {
        let sum = 0;
        if (num1 > num2) {
            alert(num1 + " Lớn hơn " + num2);
        } else {
            sum = num1 + num2;
        }
        console.log(sum);
    }
    let num1 = parseFloat(prompt("Enter number 1:"));
    let num2 = parseFloat(prompt("Enter number 2:"));
    sumOfNumber(num1, num2)
}

function baiTap4() {
    function addNumbers() {
        let firstNum = 4;
        let secondNum = 8;
        result = firstNum + secondNum;
        alert("Kết quả sau khi gọi hàm:" + result);
    }
    let result = 0;
    alert("Kết quả trước khi gọi hàm:" + result );
    result = addNumbers();
}

function baiTap5() {
    function check(input) {
        let arr1 = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe", "Regulus"];
        let arr2 = ["Ursa Minor", "Taurus", "Cygnus", "Lyra", "Aquila"," Ursa Major", "Leo"];
        let result = "Not thing";
        for (let i = 0; i < arr1.length; i++) {
            if (input === arr1[i]) {
                for (let j = 0; j < arr2.length; j++){
                    result = arr2[j];
                    break;
                }
            } else {
                return result;
            }
        }
        return result;
    }
    let input = prompt("Write something:");
    console.log(check(input));
}