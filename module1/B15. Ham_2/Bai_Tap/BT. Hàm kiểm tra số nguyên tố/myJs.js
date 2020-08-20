function main() {
    let number = parseInt(prompt("Enter a number:"));
    if (isPrime(number)) {
        alert(number + " is a prime");
    } else {
        alert(number + " is not prime");
    }
}

function isPrime(temp) {
    if (temp < 2) {
        return false;
    }
    for (let i = 2; i < Math.sqrt(temp); i++ ) {
        if (temp % i === 0) {
            return false;
        }
    }
    return true;
}
main();