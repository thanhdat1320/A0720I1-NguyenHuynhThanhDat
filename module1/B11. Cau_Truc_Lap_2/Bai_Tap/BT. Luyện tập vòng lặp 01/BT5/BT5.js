function showSumFibo() {
    let a0 = 1;
    let a1 = 1;
    let temp;
    let count = 2;
    let result = "";
    while (count <= 20 ) {
        temp = a1 + a0;
        a0 = a1;
        a1 = temp;
        result += temp;
        count++;
    }
    document.write(a1 + a0 + result);
}
showSumFibo();