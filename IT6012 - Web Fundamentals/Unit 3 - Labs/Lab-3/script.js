function validateForm() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  if (!name) {
    alert("Name cannot be empty.");
    return;
  }

  if (!email) {
    alert("Email cannot be empty.");
    return;
  }

  if (!mobile) {
    alert("Mobile Number cannot be empty.");
    return;
  }

  const mobilePattern = /^[0-9]{8}$/;
  if (!mobilePattern.test(mobile)) {
    document.getElementById("mobileError").textContent = "Must be 8 digits.";
    return;
  }

  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
  if (!emailPattern.test(email)) {
    document.getElementById("emailError").textContent =
      "Must be in correct format.";
    return;
  }

  const currentDate = new Date();
  const formattedDate = currentDate.toLocaleDateString();
  alert("Appointment is Booked on: " + formattedDate);
}
