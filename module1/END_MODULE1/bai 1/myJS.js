let arr = [];
let ave = 0;
let result;
let countNumber;
let count = 0;
do {
    countNumber = parseInt(prompt("Number of array: "));
} while (countNumber > 50 || isNaN(countNumber));

for (let i = 0; i < countNumber; i++) {
    arr[i] = parseInt(prompt("Enter a number: "));
}
for (let j = 0; j < arr.length; j++) {
    if (j % 2 === 0) {
        if (arr[j] % 2 !== 0 ) {
            count++;
            ave += arr[j];
        }
    }
    result = ave / count;
}
console.log(arr);
console.log("Average: " + result);