function showFibonnacci5() {
    let a0 = 1;
    let a1 = 1;
    let temp;
    let count = 2;
    while (count <= 20) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        if (temp % 5 === 0) {
            alert(temp);
        }
        count++;
    }
}
showFibonnacci5();