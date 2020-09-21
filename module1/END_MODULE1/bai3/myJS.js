class Book {
    constructor(nameBook, idBook, yearBook, numberBook, status) {
        this.nameBook = nameBook;
        this.idBook = idBook;
        this.yearBook = yearBook;
        this.number = numberBook;
        this.status = status;
    }
    getNameBook() {
        return this.nameBook;
    }
    setNameBook(name) {
        this.nameBook = name;
    }
    getIdBook() {
        return this.idBook;
    }
    setIdBook(id) {
        this.idBook = id;
    }
    getYearBook() {
        return this.yearBook;
    }
    setYearBook(year) {
        this.yearBook = year;
    }
    getNumberBook() {
        return this.yearBook;
    }
    setNumberBook(number) {
        this.numberBook = number;
    }
    getStatus() {
        return this.status;
    }
    setStatusBook(status) {
        this.status = status;
    }
    checkStatus() {
        if (this.numberBook === 0 ) {
            this.status = false;
        } else {
            this.status = true;
        }
    }
}

let arrBook = [];
let regexYear = /^\d{4}$/;
let regexNum = /^\d+$/;
let regexText = /^\D+$/;

function display() {
    let result = "<table border='1'>" + "<tr><td>ma so sach</td>" +
        "<td>ten sach</td>"+
        "<td>nam san xuat</td>"+
        "<td>so quyen</td>"+
        "<td>tinh trang<td></tr>";
    for (let i = 0; i < arrBook.length; i++) {
        result += "<tr>" + "<td>" + arrBook[i].idBook + "</td>" +
                            "<td>" + arrBook[i].nameBook + "</td>" +
                            "<td>" + arrBook[i].yearBook + "</td>" +
                            "<td>" + arrBook[i].numberBook + "</td>" +
                            "<td>" + arrBook[i].status + "</td>" + "</tr>";
    }
    result += "</table>";
    document.getElementById("display").innerHTML = result;
}

function addNewBook() {
    let newBook = new Book();
    let checkValid = false;
    //id
    let id;
    do {
        id = prompt("nhap id:");
        if (parseInt(id) >= 10000 && parseInt(id) < 60000 ) {
            checkValid = true;
        } else {
            checkValid = false;
        }
    } while (!checkValid);
    // name
    checkValid = false;
    let name;
    do {
        name = prompt("nhap ten sach");
        if (regexText.test(name)) {
            checkValid = true;
        } else {
            alert("nhap lai ten:")
        }
    } while (!checkValid);
    // year
    checkValid = false;
    let year;
    do {
        year = prompt("nhap nam sach");
        if (regexYear.test(year)) {
            checkValid = true;
        } else {
            alert("nhap lai nam:")
        }
    } while (!checkValid);
    // number book
    checkValid = false;
    let numberBook;
    do {
        numberBook = prompt("nhap so quyen:");
       if (regexNum.test(numberBook)) {
           checkValid = true;
       }  else {
           alert("nhap lai so luong sach:")
       }
    } while (!checkValid);
    checkValid = false;
    newBook.setIdBook(id);
    newBook.setNameBook(name);
    newBook.setYearBook(year);
    newBook.setNumberBook(numberBook);
    newBook.checkStatus();
    arrBook.push(newBook);
    alert("Add new book complete!");
    display();
}
