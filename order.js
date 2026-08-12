function openOrderForm() {
    document.getElementById("orderForm").style.display = "block";
}

function closeOrderForm() {
    document.getElementById("orderForm").style.display = "none";
}

function saveOrder() {

    const customer = document.getElementById("orderCustomer").value;
    const book = document.getElementById("orderBook").value;
    const quantity = document.getElementById("orderQuantity").value;

    if (customer === "" || book === "" || quantity === "") {
        alert("Please fill all order details.");
        return;
    }

    alert("Order created successfully!");

    closeOrderForm();

    document.getElementById("orderCustomer").value = "";
    document.getElementById("orderBook").value = "";
    document.getElementById("orderQuantity").value = "";
}