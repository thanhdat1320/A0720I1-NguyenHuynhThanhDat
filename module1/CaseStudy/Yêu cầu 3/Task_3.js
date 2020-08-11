let guestName = document.forms["guestMain"]["guestName"];
let guestPassport = document.forms["guestMain"]["guestPassport"];
let guestBirthday = document.forms["guestMain"]["guestBirthday"];
let guestEmail = document.forms["guestMain"]["guestEmail"];
let guestAddress = document.forms["guestMain"]["guestAddress"];
let guestCustomerType = document.forms["guestMain"]["guestCustomerType"];
let guestAmount = document.forms["guestMain"]["guestAmount"];
let guestRentDays = document.forms["guestMain"]["guestRentDays"];
let Rents = parseFloat(guestRentDays.value);
let guestTypeOfHouse = document.forms["guestMain"]["guestTypeOfHouse"];
let guestTypeOfRoom = document.forms["guestMain"]["guestTypeOfRoom"];
let total;
let discount;
let typeHousePrices;
let addDiscount;
let timestayDiscount;
let typeCustomerDiscount;

    // Check Email.
function checkEmail() {
    let countAt = 0;
    let countDot = 0;
    if (guestEmail.value === "") {
        alert("Please input your email.");
    } else {
            for (let i = 0; i < guestEmail.value.length; i++) {
                if (guestEmail.value.charAt(i) === "@") {
                    countAt++;
                    for (let j = 0; j < guestEmail.value.length; j++) {
                        if (guestEmail.value.charAt(j) === ".") {
                            countDot++;
                        }
                    }
                }
            }
            if (countAt !== 1 || countDot < 1) {
                alert("Your email is not correct.");
            }
        }
}

    // Check passport
function checkPassport() {
    if (guestPassport.value === "") {
        alert("Please input your passport.");
    } else {
            let tempPP = guestPassport.value;
            if (!isNaN(tempPP)) {
                tempPP = Number.parseFloat(tempPP);
            }
            if (!Number.isInteger(tempPP)) {
                alert("Your passport is not correct");
            }
            if (tempPP < 100000000 || tempPP > 999999999) {
                alert("Your passport is not correct");
            }
    }
}

    //Check Rentdays
function checkRentdays() {
    let tempRD = guestRentDays.value;
    if (guestRentDays.value === "") {
        alert("Please input your rent days.");
    } else if (!isNaN(tempRD)) {
        tempRD = parseFloat(tempRD);
        if (!Number.isInteger(tempRD) || tempRD < 0) {
            alert("Your rent days is not correct");
        }
    }
}
    // Check Amount
function checkAmount() {
    let tempAmount = guestAmount.value;
    if (guestAmount.value === "") {
        alert("Please input your amount.")
    } else if (!isNaN(tempAmount)) {
        tempAmount = parseFloat(tempAmount);
        if (!Number.isInteger(tempAmount) || tempAmount < 0) {
            alert("Your amount is not correct.");
        }
    }
}

    // Change input name
    function changeName() {
        let tempName = "";
        guestName.value = guestName.value.trim().toLowerCase();
        for (let i = 0; i < guestName.value.length; i ++) {
            if (guestName.value.charAt(i) === " " && guestName.value.charAt(i + 1) === " ") {
                continue;
            }
            if (i === 0 || guestName.value.charAt(i - 1) === " ") {
                tempName += guestName.value.charAt(i).toUpperCase();
                continue;
            }
            tempName += guestName.value.charAt(i);
        }
        guestName.value = tempName;
    }
    // Show All Information
function showAllInformation() {
    changeName();
    checkEmail();
    checkPassport();
    checkRentdays();
    checkAmount();
    Rents = parseFloat(guestRentDays.value);
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
    } else if (guestRentDays.value >= 5 || guestRentDays.value <= 7) {
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
        "<td>" + discount + " " + "USD/day" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Total:</td>" +
        "<td  class='totalAll'>" + total + " " + "USD" + "</td>" +
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
        "<td>" + timestayDiscount + "/" + " USD" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Type of House:</td>" +
        "<td>" + guestTypeOfHouse.value + "</td>" +
        "<td>" + typeHousePrices + "/" + " USD" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Prices:</td>" +
        "<td>" + discount + " " + " USD/day" + "</td>" +
        "</tr>" +
        "<tr>" +
        "<td>Total:</td>" +
        "<td  class='totalAll'>" + total + " " + " USD" + "</td>" +
        "</tr>" +
        "</table>"
}









