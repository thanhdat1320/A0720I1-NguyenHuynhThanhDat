function show() {
    let inputWeight = document.getElementById("Weight");
    let inputHeight = document.getElementById("Height");
    let Weight = parseFloat(inputWeight.value);
    let Height = parseFloat(inputHeight.value);
    let BMI = Weight / (Height * Height);
    if (BMI < 18.5) {
        document.getElementById("showBMI").innerHTML = "Underweight";
    } else if (BMI < 25.0) {
        document.getElementById("showBMI").innerHTML = "Normal";
    } else if (BMI < 30.0) {
        document.getElementById("showBMI").innerHTML = "Overweight";
    } else {
        document.getElementById("showBMI").innerHTML = "obese";
    }
}
