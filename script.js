let targetNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

const guessInput = document.getElementById('guessInput');
const guessBtn = document.getElementById('guessBtn');
const restartBtn = document.getElementById('restartBtn');
const message = document.getElementById('message');

guessBtn.addEventListener('click', checkGuess);
restartBtn.addEventListener('click', resetGame); 

function checkGuess() {
    let guess = parseInt(guessInput.value);
    attempts++;
    let msg = '';

    if (isNaN(guess) || guess < 1 || guess > 100) {
        msg = 'Please enter a valid number between 1 and 100!';
    } else if (guess < targetNumber) {
        msg = 'Too low! Try again.';
    } else if (guess > targetNumber) {
        msg = 'Too high! Try again.';
    } else {
        msg = 🎉 Correct! The number was ${targetNumber}. You guessed it in ${attempts} attempts.;
    }

    message.innerText = msg;
    guessInput.value = '';
}

function resetGame() {
    targetNumber = Math.floor(Math.random() * 100) + 1;
    attempts = 0;
    message.innerText = '';
    guessInput.value = '';
}
