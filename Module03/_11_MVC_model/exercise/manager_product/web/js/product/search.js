$(document).ready(function() {
    $('#search').click(function(event) {
        let customerName = $('#customerName').val();
        $.post('products', {
            search : customerName,
            action : "search"
        }, function(responseText) {
            $('#result').html(responseText);
        });
    });
});