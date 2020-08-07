function calcullate() {
    let inputChemistry = document.getElementById("chemistry");
    let inputMath = document.getElementById("math");
    let inputBiology = document.getElementById("biology");
    let resultSum = document.getElementById("resultSum");
    let resultOverage = document.getElementById("resultOverage");
    let Chemistry = parseInt(inputChemistry.value);
    let Math = parseInt(inputMath.value);
    let Biology = parseInt(inputBiology.value);
    let Sum = Chemistry + Math + Biology;
    if (!isNaN(Sum)) {
        resultSum.value = Sum;
    }
    let Overage = (Chemistry + Math + Biology)/3;
    if (!isNaN(Overage)) {
        resultOverage.value = Overage;
    }

}




