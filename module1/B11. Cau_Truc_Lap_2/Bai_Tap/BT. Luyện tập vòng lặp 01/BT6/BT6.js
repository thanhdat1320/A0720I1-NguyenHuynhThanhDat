function show7Number() {
    let count = 0;
    let Sum = 0;
    let Number = 0;
    while (count < 30) {
        if (Number % 7 === 0) {
            Sum += Number;
            count++;
        }
        Number++;
    }
    document.write(Sum);
}
show7Number();