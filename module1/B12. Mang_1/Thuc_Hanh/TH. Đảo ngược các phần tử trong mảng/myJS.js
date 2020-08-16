let x = [-3, 5, 1, 3, 2, 10];
debugger
let frist = 0;
let last = x.length - 1;
while (frist < last) {
    let b = x[frist];
    x[frist] = x[last];
    x[last] = b;
    frist ++;
    last --;
}
document.write(x);