let guestName = document.forms["guestMain"]["guestName"];
let guestPassport = document.forms["guestMain"]["guestPassport"];
let guestBirthday = document.forms["guestMain"]["guestBirthday"];
let guestEmail = document.forms["guestMain"]["guestEmail"];
let guestAddress = document.forms["guestMain"]["guestAddress"];
let guestCustomerType = document.forms["guestMain"]["guestCustomerType"];
let guestAmount = document.forms["guestMain"]["guestAmount"];
let guestRentDays = document.forms["guestMain"]["guestRentDays"];
let Rents = parseInt(guestRentDays.value);
let guestTypeOfHouse = document.forms["guestMain"]["guestTypeOfHouse"];
let guestTypeOfRoom = document.forms["guestMain"]["guestTypeOfRoom"];
let total;
let discount;
let typeHousePrices;
let addDiscount;
let timestayDiscount;
let typeCustomerDiscount;

function showAllInformation(){
    Rents = parseInt(guestRentDays.value);
    /* Get price by services*/
    if (guestTypeOfHouse.value === "Villa") {
        typeHousePrices = 500;
    } else if (guestTypeOfHouse.value === "House") {
        typeHousePrices = 300;
    } else if (guestTypeOfHouse.value === "Room") {
        typeHousePrices = 100;
    }
    /*Get price discount by address*/
    if (guestAddress.value === "Đà Nẵng") {
        addDiscount = 20;
    } else if (guestAddress.value === "Huế") {
        addDiscount = 10;
    } else if (guestAddress.value === "Quảng Nam") {
        addDiscount = 5;
    }
    /*Get price discount by times stay*/
    if (guestRentDays.value > 7) {
        timestayDiscount = 30;
    } else if (guestRentDays.value >= 5 || guestRentDays.value <= 7 ) {
        timestayDiscount = 20;
    } else if (guestRentDays.value >= 2 || guestRentDays.value <= 4) {
        timestayDiscount = 10;
    }
    /*Get price discount by times stay*/
    if (guestCustomerType.value === "Diamond") {
        typeCustomerDiscount = 15;
    } else if (guestCustomerType.value === "Platinum") {
        typeCustomerDiscount = 10;
    } else if (guestCustomerType.value === "Gold") {
        typeCustomerDiscount = 10;
    } else if (guestCustomerType.value === "Silver") {
        typeCustomerDiscount = 10;
    } else if (guestCustomerType.value === "Member") {
        typeCustomerDiscount = 0;
    }
    discount = addDiscount + timestayDiscount + typeCustomerDiscount;
    total = typeHousePrices * Rents - discount;

    /*show Total*/
    document.getElementById("resultAndShow").innerHTML = "<h2>Booking Information</h2>" +
        "<table class='showInfo'> " +
        "<tr>" +
            "<td>Your Name:</td>" +
            "<td>" + guestName.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Passport:</td>" +
            "<td>" + guestPassport.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Birthday:</td>" +
            "<td>" + guestBirthday.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Email:</td>" +
            "<td>" + guestEmail.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Address:</td>" +
            "<td>" + guestAddress.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Customer Type:</td>" +
            "<td>" + guestCustomerType.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Amount:</td>" +
            "<td>" + guestAmount.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>RentDays:</td>" +
            "<td>" + guestRentDays.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Type of House:</td>" +
            "<td>" + guestTypeOfHouse.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Type of Room:</td>" +
            "<td>" + guestTypeOfRoom.value + "</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Prices:</td>" +
            "<td>" + discount + " " + "USD/day"+"</td>" +
        "</tr>" +
        "<tr>" +
            "<td>Total:</td>" +
            "<td  class='totalAll'>" + total + " " + "USD"+"</td>" +
        "</tr>" +
        "</table>"
}

/*Show Edit Information*/
function showEditInformation() {
    document.getElementById("resultAndShow").innerText = "";
}

/*Show Price After Discount*/
function showPriceAfterDiscount() {
    Rents = parseInt(guestRentDays.value);
    document.getElementById("resultAndShow").innerHTML = "<h2>Price After Discount</h2>" +
        "<table class='showInfo'> " +
        "<tr>" +
        "<td>Address:</td>" +
        "<td>" + guestAddress.value + "</td>" +
        "<td>" + addDiscount + "/" + " USD" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Customer Type:</td>" +
        "<td>" + guestCustomerType.value + "</td>" +
        "<td>" + typeCustomerDiscount + "/" + " USD" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>RentDays:</td>" +
        "<td>" + guestRentDays.value + "</td>" +
        "<td>" + timestayDiscount + "/" + " USD"+ "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Type of House:</td>" +
        "<td>" + guestTypeOfHouse.value + "</td>" +
        "<td>" + typeHousePrices + "/" + " USD" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Prices:</td>" +
        "<td>" + discount + " " + " USD/day"+"</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Total:</td>" +
        "<td  class='totalAll'>" + total + " " + " USD"+"</td>" +
        "</tr>" +
        "</table>"
}





