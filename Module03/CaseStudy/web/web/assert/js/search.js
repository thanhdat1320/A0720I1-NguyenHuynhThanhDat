$(document).ready(function () {
    $("#search").click(function (event) {
        $.ajax({
            url: "customer",
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