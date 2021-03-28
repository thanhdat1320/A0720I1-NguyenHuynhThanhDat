$(document).ready(function () {
    $("#search").click(function (event) {
        $.ajax({
            url: "house",
            type: "POST",
            data: {
                nameSearch: $("#nameSearch").val(),
                action: "search"
            },
            success: function (responseText) {
                $('#result').html(responseText)
            }
        })
    });
    $(".delete").click((event) => {
        if (!confirm("Are you sure to delete?")) {
            event.preventDefault();
        }
    });
});