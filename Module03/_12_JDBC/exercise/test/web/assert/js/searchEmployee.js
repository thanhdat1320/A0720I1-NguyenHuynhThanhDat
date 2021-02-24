$(document).ready(function () {
    $("#search").click(function (event) {
        $.ajax({
            url: "employee",
            type : "POST",
            data : {
                nameEmployeeSearch : $("#nameSearch").val(),
                action : "search"
            },
            success: function (responseText) {
                $('#result').html(responseText)
            }
        })
    })
});