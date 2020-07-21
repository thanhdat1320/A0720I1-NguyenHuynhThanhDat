function calcullate() {
    let inputChemistry = document.getElementById("chemistry");
    let inputMath = document.getElementById("math");
    let inputBiology = document.getElementById("biology");
    let resultSum = document.getElementById("resultSum");
    let Chemistry = parseInt(inputChemistry);
    let Math = parseInt(inputMath);
    let Biology = parseInt(inputBiology);
    let Sum = Chemistry.value + Math.value + Biology.value;
    if (!isNaN(Sum)) {
        resultSum.value = Sum;
    }
    let Overage = (Chemistry.value + Math.value + Biology.value)/3;
    if (!isNaN(Overage)) {
        resultOverage.value = Overage;
    }

}




