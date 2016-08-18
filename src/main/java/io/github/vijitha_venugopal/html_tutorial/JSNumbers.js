/**
 * javascript numbers
 * Created by vijitha on 18/08/16.
 */
function myFunction() {
    var x = 999999999999999;
    var y = 9999999999999999;
    document.getElementById("demo").innerHTML = x + "<br>" + y;}
function myFunction1() {
    var x = (0.2*10 + 0.1*10) / 10;
    document.getElementById("demo").innerHTML = "0.2 + 0.1 = " + x;}
function myFunction2() {
    var x = 2/0;
    var y = -2/0;
    document.getElementById("demo").innerHTML = x + "<br>" + y;
}
function myFunction3() {
    var x = 2;
    var y = "Apple";
    document.getElementById("demo").innerHTML = x/y;
}
function myFunction4() {

    var x = 123;
    var y = new Number(123);

    document.getElementById("demo").innerHTML = typeof x + "<br>" + typeof y;

}