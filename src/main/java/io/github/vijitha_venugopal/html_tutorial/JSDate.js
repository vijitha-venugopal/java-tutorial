/**
 * js date
 * Created by vijitha on 18/08/16.
 */
var d = new Date("October 13, 2014 11:13:00");
var d1 = new Date(86400000);
var d2 = new Date(99,5,24,11,33,30,0);
document.getElementById("demo").innerHTML = d+"<br>"+Date()+"<br>"+d1+"<br>"+d2;