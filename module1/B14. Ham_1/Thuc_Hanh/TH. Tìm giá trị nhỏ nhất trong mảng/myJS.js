let arr1 = [3, 5, 1, 8, -3, 7, 8];
let arr2 = [7, 12, 6, 9, 20, 56, 89];
let arr3 = [];
let arr4 = [0, 0, 0, 0, 0, 0];

let min1 = minArray1(arr1);
alert(min1);
function minArray1(arr1) {
    let min = arr1[0];
    for (let i = 0; i < arr1.length; i++) {
        if (arr1[i] < min) {
            min = arr1[i];
        }
    }
}

let min2 = minArray2(arr2);
alert(min2);
function minArray2(arr2) {
    let min = arr2[0];
    for (let i = 0; i < arr2.length; i++) {
        if (arr2[i] < min) {
            min = arr2[i];
        }
    }
}

let min3 = minArray3(arr3);
alert(min3);
function minArray3(arr3) {
    if(arr3.length === 0)
        return -1;
    let min = arr3[0];

    for(let i = 1; i < arr3.length; i++){
        if(arr3[i] < min){
            min = arr3[i];
        }
    }
    return min;
}
