function main() {
    let result = "";
    let count = 0;
    let Number = 2;
    let inputMaxPrimeNeedDisplay = prompt("Nhập số lượng số nguyên tố cần hiển thị:");
    while (count <= inputMaxPrimeNeedDisplay) {
        if (isPrime(Number)) {
            result += Number + "Là số nguyên tố" + "<br>";
            count++;
        }
        Number++;
    }
    document.write(result);
}

function isPrime(temp) {
    if (temp < 2) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(temp); i++) {
        if (temp % i === 0) {
            return false;
        }
    }
    return true;
}
main();