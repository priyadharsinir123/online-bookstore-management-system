function openCustomerForm() {
    document.getElementById("customerForm").style.display = "block";
}

function closeCustomerForm() {
    document.getElementById("customerForm").style.display = "none";
}

function saveCustomer() {

    const name = document.getElementById("customerName").value;
    const email = document.getElementById("customerEmail").value;
    const phone = document.getElementById("customerPhone").value;

    if (name === "" || email === "" || phone === "") {
        alert("Please fill all details.");
        return;
    }

    alert("Customer added successfully!");

    closeCustomerForm();

    document.getElementById("customerName").value = "";
    document.getElementById("customerEmail").value = "";
    document.getElementById("customerPhone").value = "";
}