let inputFeet = parseFloat(prompt("Enter feet"));
function feetToMeter(inputFeet) {
    let meter = 0.305 * inputFeet;
    console.log("meter=" + meter);
}
feetToMeter(inputFeet);

let inputMeter = parseFloat(prompt("Enter a meter:"));
function meterToFeet(inputMeter) {
    let feet = 3.279 * inputMeter;
    console.log("feet=" + feet);
}
meterToFeet(inputMeter);