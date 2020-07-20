//BT1.Khai báo các biến thuộc các kiểu khác nhau, gán giá trị cho chúng và in ra tài liệu HTML.
let i = 10;
let f = 20.5;
let b = true;
let s = "Hà Nội";
document.write('i =' + i);
document.write('<br>');
document.write('f =' + f);
document.write('<br>');
document.write('b =' + b);
document.write('<br>');
document.write('s =' + s);
document.write('<hr>');
//BT2.Viết một đoạn mã Javascript, khai báo biến width chứa giá trị độ rộng của hình chữ nhật, biến height chứa giá trị chiều cao của hình chữ nhật. In ra màn hình diện tích của hình chữ nhật đó.
let width = 20;
let height = 10;
area = width * height;
document.write('Area =' + area);
document.write('<hr>');
//BT3.Dùng hàm prompt() để nhập 2 số từ bàn phím, lưu vào 2 biến là a và b. Kiểm tra xem a có phải là bội số của b hay không (tức là a có chia hết cho b hay không). Hiển thị kết quả ra màn hình bằng cách sử dụng hàm alert().
function tinhtoan() {
    a = prompt("Nhập a:");
    b = prompt("Nhập b:");
    if (a % b == 0){
        alert("a là bội số của b");
    } else {
        alert("a khong la bội số của b");
    }
}

