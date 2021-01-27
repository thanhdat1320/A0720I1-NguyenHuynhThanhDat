$(document).ready(function () {
    $("#search").click(function (event) {
        $.ajax({
            url :"hospital",
            type : "POST",
            data : {
                nameSearch : $("#nameSearch").val(),
                action : "search"
            },
            success: function (responseText) {
                $('#result').html(responseText)
            }
        })
    })
});