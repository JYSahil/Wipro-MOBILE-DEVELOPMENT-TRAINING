document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var errorMessage = document.getElementById('error-message');

    // Simple validation logic (for demonstration purposes)
    var correctUsername = 'admin';
    var correctPassword = 'password';

    if (username === correctUsername && password === correctPassword) {
        window.location.href = 'myindex.html';
    } else {
        errorMessage.textContent = 'Invalid username or password';
        errorMessage.style.display = 'block';
    }
});
