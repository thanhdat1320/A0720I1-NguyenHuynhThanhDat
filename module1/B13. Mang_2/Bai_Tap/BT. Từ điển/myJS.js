let English = ["car", "pen", "table", "book"];
let VN = ["xe", "bút", "bàn", "sách"];
let check = prompt("Input a word");
for ( let i = 0; i < English.length; i++) {
    if (check === English[i]) {
        for (let j = 0; j < VN.length; j++) {
            if (i === j) {
                alert(VN[j]);
                break;
            }
        }
    }
}