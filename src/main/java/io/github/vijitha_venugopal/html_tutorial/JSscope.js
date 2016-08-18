/**
 * java scope
 * Created by vijitha on 18/08/16.
 */
var carName = "Volvo";
myFunction();

function myFunction() {
    document.getElementById("demo").innerHTML =
        "I can display " + carName;
}