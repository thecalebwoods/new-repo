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

    newTodoE.addEventListener('click', removeTodo)

    // Append the new element to the OL as a child 
    listE.appendChild(newTodoE);

}

let removeTodo = function(){
    // this = current todo
    listE.removeChild(this);
}

let setup = function(){
    // Setup endent listeners on intitial li element
    const children = listE.children;
    for( let i = 0; i < children.length; i++){
        children[i].addEventListener('click', removeTodo);
}
submitE.addEventListener('click', addTodo);
}
// Tells browser to listen for clicks on the submit element and call the function add to do when a click is intitiated 

setup();