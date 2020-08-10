let sout = "<table border = '1' width = '800px' height = '300px' cellspacing = '0' cellpadding = '3'>";
for (let i = 2; i <= 9; i ++) {
    sout = sout + "<tr>";
    for (let j = 1; j <= 10; j ++) {
        sout = sout + "<td>" + i + "x" + j + "=" + i * j + "</td>";
    }
    sout = sout + "</tr>";
}
sout = sout + "</table>";
document.getElementById("showResult").innerHTML = sout;
