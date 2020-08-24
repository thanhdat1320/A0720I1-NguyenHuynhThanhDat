let arrProduct = ["Iphone", "Samsung", "Oppo"];
function displayProduct() {
    document.body.innerHTML = "";
    let temp = "<h2> Add new product</h2><br>" +
        "<input type='text' id='newProduct'>" +
        "<input type='button' value='Add new product' onclick='addNewProduct()'>";
    temp += "<table>";
    for (let i = 0; i < arrProduct.length; i++) {
        temp += "<tr><td>" + arrProduct[i] + "</td>" +
            "<td><input type='button' value='Edit' onclick='displayFormEditProduct("+ i +")'></td>"+
            "<td><input type='button' value='Delete' onclick='deleteProduct("+ i +")'></td>" +
            "</tr>";
    }
    temp += "</table>";
    document.write(temp);
}
displayProduct();
// Add
function addNewProduct() {
    let newProduct = document.getElementById("newProduct").value;
    arrProduct.push(newProduct);
    displayProduct();
}
// Edit
function displayFormEditProduct(index) {
    let temp = "<h2> Edit Product </h2>" +
        "<input type='text' value='" + arrProduct[index] +"' id='product'>" +
        "<input type='button' value='Edit Product' onclick='editProduct("+ index +")'>";
    displayProduct();
    document.write(temp);
}
function editProduct(index) {
    let newProduct = document.getElementById("product").value;
    arrProduct[index] = newProduct;
    displayProduct();
}
// Delete
function deleteProduct(index) {
    if (confirm("Bạn có chắc chắn xóa" + arrProduct[index] + " này không?")) {
        arrProduct.splice(index, 1);
    }
    displayProduct();
}
displayProduct();