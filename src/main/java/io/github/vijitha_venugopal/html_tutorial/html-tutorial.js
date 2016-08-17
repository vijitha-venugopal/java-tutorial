/**
 * Created by vijitha on 16/08/16.
 */
$(function () {
    $("#placeholder").append("<h1>Hello World</h1>")
    $("#click").click(function () {
        $("#placeholder").append("<p>Hello 2</p>")
    })
});
