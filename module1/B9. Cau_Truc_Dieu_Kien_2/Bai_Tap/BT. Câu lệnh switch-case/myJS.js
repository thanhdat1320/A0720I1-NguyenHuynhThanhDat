function month_Ahave() {
    let month_A = parseInt(document.getElementById("month_A").value);
    switch (month_A) {
        case 2:
            document.getElementById("showMonth_A").innerHTML = "Tháng" + " " + month_A + " có 28 hoặc 29 ngày";
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById("showMonth_A").innerHTML = "Tháng" + " " + month_A + " có 31 ngày";
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            document.getElementById("showMonth_A").innerHTML = "Tháng" + " " + month_A + " có 30 ngày";
            break;
    }

}
function month_Bhave() {
    let month_B = parseInt(document.getElementById("month_B").value);
    switch (month_B) {
        case 2:
            document.getElementById("showMonth_B").innerHTML = "Tháng" + " " + month_B + " có 28 hoặc 29 ngày";
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById("showMonth_B").innerHTML = "Tháng" + " " + month_B + " có 31 ngày";
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            document.getElementById("showMonth_B").innerHTML = "Tháng" + " " + month_B + " có 30 ngày";
            break;
    }
}
