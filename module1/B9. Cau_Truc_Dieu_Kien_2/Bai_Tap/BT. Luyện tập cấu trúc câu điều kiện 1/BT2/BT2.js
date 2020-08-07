let Check = document.getElementById("btn-check");
Check.onclick = function checkTheAge() {
    let Age = parseInt(document.getElementById("Age").value);
    if (isNaN(Age) || Age <= 0) {
        alert("Enter the wrong age.");
    } else if (Age >= 16) {
        alert("You qualify for Grade 10.");
    } else {
        alert("You are not qualify for Grade 10.")
    }
};