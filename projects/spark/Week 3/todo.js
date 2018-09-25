const listE = document.getElementById('todo-list');
const inputE = document.getElementById('todo-input');
const submitE = document.getElementById('todo-submit');

const addTodo = function () {
    // Getting input string from input
    const todoText = inputE.value;
    //Resetting the input field
    inputE.value = '';

    // Create new li element
    const newTodoE = document.createElement('li');

    // Assign innerText to the input value
    newTodoE.innerText = todoText;

    // Append the new element to the OL as a child 
    listE.appendChild(newTodoE);
}

// Tells browser to listen for clicks on the submit element and call the function add to do when a click is intitiated 
    submitE.addEventListener('click', addTodo);