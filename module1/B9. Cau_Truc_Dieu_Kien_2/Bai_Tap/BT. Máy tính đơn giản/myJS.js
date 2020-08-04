let Result = document.getElementById("Result");
function Input(so) {
    Result.value = Result.value + so;
}
function Calculate() {
    Result.value = eval(Result.value);
}
function Delete() {
    Result.value = "";
}