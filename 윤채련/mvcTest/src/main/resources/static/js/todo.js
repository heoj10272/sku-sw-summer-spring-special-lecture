//디비에서 todoList를 얻어와서 화면에 뿌려줘야한다.
console.log('hello');
let basicDatas=[]

//서버에서 가져오는 것을 비동기 통신이라고 한다.
function getTodos(){
	const xhr = new XMLHttpRequest();
	xhr.open("get","http://localhost:8080/mvcTest/api/todos")	
	//get post put delete 방식 정할수 있따.
	xhr.onreadystatechange = function(){
		console.log(xhr.readyState);
		if(xhr.readyState ===4){
			if(xhr.status ===200){
				let todos = JSON.parse(this.responseText);
				for(let i =0; i<todos.length; i++){
					todoItemAdd(todos[i]);
				}
			}
		}
	}
	
	xhr.send();

}


getTodos();


function updateTodo(id){
    let updateTodo = {"id":id};
    let xhr = new XMLHttpRequest();
    xhr.open('PUT','http://localhost:8080/mvcTest/api/todos');
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.send(JSON.stringify(updateTodo));
}

function deleteTodo(id){
    let delTodo = {"id": id};
    let xhr = new XMLHttpRequest();
    xhr.open('DELETE','http://localhost:8080/mvcTest/api/todos');
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.send(JSON.stringify(delTodo));
}

function postTodo(todo){
    let xhr = new XMLHttpRequest();
    xhr.open('post','http://localhost:8080/mvcTest/api/todos');
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.onload = function(){
        // 글쓰기를 할 경우 ajax의 결과를 json 오브젝트로 변환하여 추가한다.
        todoItemAdd(JSON.parse(xhr.responseText));
    };
    xhr.send(JSON.stringify({"todo":todo}));
}

getTodos();

let todoUl = document.querySelector("#todo-item-list");

todoUl.addEventListener('click',function(event){
    let eventTarget = event.target;
    if(event.target.tagName === 'LI' || event.target.tagName === 'SPAN'){
        if(event.target.tagName ==='LI'){
            eventTarget =eventTarget.querySelector('.todo-text');
        }

        let liObj = eventTarget.parentElement;
        if(eventTarget.classList.value.indexOf('checked') >= 0){
            updateTodo(liObj.getAttribute("id"));
        }else{
            updateTodo(liObj.getAttribute("id"));
        }
        eventTarget.classList.toggle('checked');
    }
});

 const inputbtn = document.querySelector('.add-button');
//  const myinput = document.querySelector('#myInput');


inputbtn.addEventListener('click', function(){
    inputValue = document.querySelector('#myInput').value;
    if(inputValue === ''){
        alert("할 일을 입력해 주세요^^ ");
        return;
    }
    document.querySelector('#myInput').value = '';
    postTodo(inputValue);
});

function todoItemAdd(todoObj){
    console.log(todoObj);
    const li = document.createElement('li');
    li.className = "todo-item";
    const textSpan = document.createElement('SPAN');
    textSpan.className = "todo-text" ;

    const todotxt = document.createTextNode(todoObj.todo);
    textSpan.appendChild(todotxt);
    if(todoObj.endDate != null){
        // 완료된 작업일 경우 css를 이용하여 줄을 긋는다.
        textSpan.classList.toggle('checked');
    }
    li.appendChild(textSpan);
    li.setAttribute("id", todoObj.id);
    document.getElementById('todo-item-list').appendChild(li);

    const removeSpan = document.createElement("SPAN");
    const removetxt = document.createTextNode("\u00D7");
    removeSpan.className = "remove";

    removeSpan.appendChild(removetxt);
    li.appendChild(removeSpan);

    // 동적으로 x버튼을 클릭했을 때 처리해야할 이벤트를 추가한다.
    removeSpan.addEventListener('click',function(){
        let liObj = this.parentElement;
        console.log(liObj);
        deleteTodo(liObj.getAttribute("id"));
        liObj.remove();
    });
};
