let cat1 = document.getElementById("image_cat1");
let cat2 = document.getElementById("image_cat2");
let cat3 = document.getElementById("image_cat3");
let cat4 = document.getElementById("image_cat4");
let cat5 = document.getElementById("image_cat5");
function onchangeImage(number) {
    switch (number) {
        case 1: {
            if (cat1.getAttribute("src") === "./image/cat_1.jpg") {
                cat1.src = "./image/monkey_1.jpg";
            } else if (cat1.getAttribute("src") === "./image/monkey_1.jpg") {
                cat1.src = "./image/panda_1.jpg";
            } else if (cat1.getAttribute("src") === "./image/panda_1.jpg") {
                cat1.src = "./image/cat_1.jpg";
            }
            break;
        }
        case 2: {
            if (cat2.getAttribute("src") === "./image/cat_2.jpg") {
                cat2.src = "./image/monkey_2.jpg";
            } else if (cat2.getAttribute("src") === "./image/monkey_2.jpg") {
                cat2.src = "./image/panda_2.jpg";
            } else if (cat2.getAttribute("src") === "./image/panda_2.jpg") {
                cat2.src = "./image/cat_2.jpg";
            }
            break;
        }
        case 3: {
            if (cat3.getAttribute("src") === "./image/cat_3.jpg") {
                cat3.src = "./image/monkey_3.jpg";
            } else if (cat3.getAttribute("src") === "./image/monkey_3.jpg") {
                cat3.src = "./image/panda_3.jpg";
            } else if (cat3.getAttribute("src") === "./image/panda_3.jpg") {
                cat3.src = "./image/cat_3.jpg";
            }
            break;
        }
        case 4: {
            if (cat4.getAttribute("src") === "./image/cat_4.jpg") {
                cat4.src = "./image/monkey_4.jpg";
            } else if (cat4.getAttribute("src") === "./image/monkey_4.jpg") {
                cat4.src = "./image/panda_4.jpg";
            } else if (cat4.getAttribute("src") === "./image/panda_4.jpg") {
                cat4.src = "./image/cat_4.jpg";
            }
            break;
        }
        case 5: {
            if (cat5.getAttribute("src") === "./image/cat_5.jpg") {
                cat5.src = "./image/monkey_5.jpg";
            } else if (cat5.getAttribute("src") === "./image/monkey_5.jpg") {
                cat5.src = "./image/panda_5.jpg";
            } else if (cat5.getAttribute("src") === "./image/panda_5.jpg") {
                cat5.src = "./image/cat_5.jpg";
            }
        }
    }
     checkImage();
}
function checkImage() {
    if (cat1.getAttribute("src") === "./image/cat_1.jpg"
        && cat2.getAttribute("src") === "./image/cat_2.jpg"
        && cat3.getAttribute("src") === "./image/cat_3.jpg"
        && cat4.getAttribute("src") === "./image/cat_4.jpg"
        && cat5.getAttribute("src") === "./image/cat_5.jpg") {
        endSetup();
    } else if (cat1.getAttribute("src") === "./image/monkey_1.jpg"
            && cat2.getAttribute("src") === "./image/monkey_2.jpg"
            && cat3.getAttribute("src") === "./image/monkey_3.jpg"
            && cat4.getAttribute("src") === "./image/monkey_4.jpg"
            && cat5.getAttribute("src") === "./image/monkey_5.jpg") {
        endSetup();
    } else if (cat1.getAttribute("src") === "./image/panda_1.jpg"
        && cat2.getAttribute("src") === "./image/panda_2.jpg"
        && cat3.getAttribute("src") === "./image/panda_3.jpg"
        && cat4.getAttribute("src") === "./image/panda_4.jpg"
        && cat5.getAttribute("src") === "./image/panda_5.jpg") {
        endSetup();
    } else {
        setupBorder();
    }
}
function endSetup() {
    let obj = document.getElementsByClassName("setupDiv");
    for (let i = 0; i < obj.length; i++) {
        obj[i].style.border = "5px solid black";
    }
}
function setupBorder() {
    let obj2 = document.getElementsByClassName("setupDiv");
    for (let i = 0; i < obj2.length; i++) {
        obj2[i].style.border = "1px solid red";
    }
}


