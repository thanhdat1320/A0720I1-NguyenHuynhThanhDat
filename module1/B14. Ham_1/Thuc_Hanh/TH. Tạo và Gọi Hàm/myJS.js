let confirmAnswer = confirm("Shall we play a game:");
let theAnswer = proessConfirm(confirmAnswer);
alert(theAnswer);

function proessConfirm(answer) {
    let result = "";
    if (answer) {
        result = "Excellent. We'll play a nice game of chess.";
    } else {
        result = "Maybe later then.";
    }
    return result;
}