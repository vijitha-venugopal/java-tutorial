/**
 * number methods
 * Created by vijitha on 18/08/16.
 */
function myfunction() {var x = 123;
document.getElementById("demo").innerHTML =
    x.toString() + "<br>" +
    (123).toString() + "<br>" +
    (100 + 23).toString();}
function myfunction1() {
    var x = 9.656;
    document.getElementById("demo").innerHTML =
        x.toExponential() + "<br>" +
        x.toExponential(2) + "<br>" +
        x.toExponential(4) + "<br>" +
        x.toExponential(6);
}
function myfunction2 () {
    var x = 9.656;
    document.getElementById("demo").innerHTML =
        x.toFixed(0) + "<br>" +
        x.toFixed(2) + "<br>" +
        x.toFixed(4) + "<br>" +
        x.toFixed(6);
}
function myfunction3() {
    var x = 9.656;
    document.getElementById("demo").innerHTML =
        x.toPrecision() + "<br>" +
        x.toPrecision(2) + "<br>" +
        x.toPrecision(4) + "<br>" +
        x.toPrecision(6);
}
function myfunction4() {
    var x = 123;

    document.getElementById("demo").innerHTML =
        x.valueOf() + "<br>" +
        (123).valueOf() + "<br>" +
        (100 + 23).valueOf();
}
function myfunction5() {
    document.getElementById("demo").innerHTML =
        parseInt("10") + "<br>" +
        parseInt("10.33") + "<br>" +
        parseInt("10 6") + "<br>" +
        parseInt("10 years") + "<br>" +
        parseInt("years 10");
}
function myfunction6() {
    document.getElementById("demo").innerHTML =
        parseFloat("10") + "<br>" +
        parseFloat("10.33") + "<br>" +
        parseFloat("10 6") + "<br>" +
        parseFloat("10 years") + "<br>" +
        parseFloat("years 10");
}
function myfunction7() {
document.getElementById("demo").innerHTML =
    Number(true) + "<br>" +
    Number(false) + "<br>" +
    Number(new Date()) + "<br>" +
    Number("  10") + "<br>" +
    Number("10  ") + "<br>" +
    Number("10 6");
}
function myfunction8() {
    document.getElementById("demo").innerHTML ="Max value of number :"+Number.MAX_VALUE+"<br>"+
        "Min value of number :"+Number.MIN_VALUE+"<br>";

}