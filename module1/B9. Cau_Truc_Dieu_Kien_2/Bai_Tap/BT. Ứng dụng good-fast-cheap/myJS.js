let Good = document.getElementById("Good");
let Fast = document.getElementById("Fast");
let Cheap = document.getElementById("Cheap");
function check(option) {
    switch (option) {
        case 1:{
            if (Cheap.checked && Fast.checked) {
                Cheap.checked = false;
            }
            break;
        }
        case 2: {
            if (Good.checked && Cheap.checked) {
                Good.checked = false;
            }
            break;
        }
        case 3: {
            if (Fast.checked && Cheap.checked) {
                Fast.checked = false;
            }
        }
    }
}