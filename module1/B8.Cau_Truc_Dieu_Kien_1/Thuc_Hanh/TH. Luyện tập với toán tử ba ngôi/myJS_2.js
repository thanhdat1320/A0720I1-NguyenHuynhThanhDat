let login = prompt("Enter a message:");
let message;

message = (login == "Employee") ? alert("Hello") :
          (login == "Director") ? alert("Greetings") :
              (login == "") ? alert("No login"): alert("");
