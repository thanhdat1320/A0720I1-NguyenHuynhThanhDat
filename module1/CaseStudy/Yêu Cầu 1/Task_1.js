function showAllInformation(){
    let guestName = document.forms["guestMain"]["guestName"];
    let guestPassport = document.forms["guestMain"]["guestPassport"];
    let guestBirthday = document.forms["guestMain"]["guestBirthday"];
    let guestEmail = document.forms["guestMain"]["guestEmail"];
    let guestAddress = document.forms["guestMain"]["guestAddress"];
    let guestCustomerType = document.forms["guestMain"]["guestCustomerType"];
    let guestAmount = document.forms["guestMain"]["guestAmount"];
    /*let guestDiscount = document.forms["guestMain"]["guestDiscount"];*/
    let guestRentDays = document.forms["guestMain"]["guestRentDays"];
    let Rents = parseInt(guestRentDays.value);
    let guestTypeOfHouse = document.forms["guestMain"]["guestTypeOfHouse"];
    let guestTypeOfRoom = document.forms["guestMain"]["guestTypeOfRoom"];
    let prices;
    let total;
    let discount;
    if (guestTypeOfHouse.value == "Villa") {
       prices = 500;
    } else {
        if (guestTypeOfHouse.value == "House"){
           prices = 300;
        } else {
            prices = 100;
        }
    }
    discount = prices * (1 - 10 / 100);
    total = Rents * discount;
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
                "<td>" + total + " " + "USD"+"</td>" +
            "</tr>" +
        "</table>"
}



