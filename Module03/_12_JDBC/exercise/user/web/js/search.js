$(document).ready(function () {
    $('#search').click(function (event) {
        $.ajax({
            url: "users",
            type: "POST",
            data: {
                nameSearch: $('#nameSearch').val(),
                action: "search"
            },
            success: function (responseText) {
                $('#result').html(responseText)
            }
        });
    });
});

// $(document).ready(function () {
//     $('#search').click(function (event) {
//         let nameSearch = $('#nameSearch').val();
//         $.post('users', {
//             nameSearch : nameSearch,
//             action : 'search'
//         }, function (responseText) {
//             $('#result').html(responseText);
//         });
//     });
// });