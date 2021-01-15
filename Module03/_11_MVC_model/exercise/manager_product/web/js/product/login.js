$(document).ready(function () {
    $('#submit').click(function (event) {
        $.ajax({
            url : "login",
            type : "POST",
            data : {
                username : ('#username').val(),
                pass : ("#pass").val()
            },
        })
    })
});