function showFibonnacci() {
    let a0 = 1;
    let a1 = 1;
    let temp;
    let result = a0 + " " + a1 + " ";
    let count = 2;
    while (count <= 20) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        result += temp + " ";
        count++;
    }
    document.write(result);
}
showFibonnacci();