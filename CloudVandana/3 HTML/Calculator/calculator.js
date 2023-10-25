let displayValue = '';

function append(value) {
    displayValue += value;
    document.getElementById('display').value = displayValue;
}
function calculate() {
    try {
        displayValue = eval(displayValue);
        document.getElementById('display').value = displayValue;
    } catch (error) {
        document.getElementById('display').value = 'Error';
    }
}
function clearButtonClick() {
    displayValue = '';
    document.getElementById('display').value = '';
}
