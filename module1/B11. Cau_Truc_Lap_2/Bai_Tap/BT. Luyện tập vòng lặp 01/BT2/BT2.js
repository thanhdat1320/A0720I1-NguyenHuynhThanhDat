let temperature = parseFloat(prompt("Enter temperature: "));
while (true) {
    temperature = prompt("Enter temperature");
    if (temperature < 20) {
        alert("Increase in temperature.");
        break;
    } else if (temperature > 100) {
        alert("Reduce the temperature");
        break;
    }
}