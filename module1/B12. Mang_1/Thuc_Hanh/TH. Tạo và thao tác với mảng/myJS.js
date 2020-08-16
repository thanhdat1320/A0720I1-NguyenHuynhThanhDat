let clickToAddValue = document.getElementById("addValue");
clickToAddValue.onclick = addValue;
let clickToDisplayValue = document.getElementById("displayValue");
clickToDisplayValue.onclick = displayValue;
let x = 0;
let array = Array();

function  addValue() {
    array[x] = document.getElementById("inputValue").value;
    alert("Element" + array[x] + "Added at index" + x);
    x ++;
    document.getElementById("inputValue").value = "";
}
function displayValue() {
    let e = "<hr/>";
    for (let i = 0; i < array.length; i++) {
        e += "element" + i + "=" + array[i] + "<br/>";
    }
    document.getElementById("showResult").innerHTML = e;
}