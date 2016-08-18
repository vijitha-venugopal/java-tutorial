/**
 * js array
 * Created by vijitha on 18/08/16.
 */
var cars = new Array("Saab", "Volvo", "BMW");
var person = {firstName:"John", lastName:"Doe", age:46};
var cars1 = new Array("Odi", "Beat");

document.getElementById("demo").innerHTML = cars+"<br>"+cars[1]+"<br>"+
    person["firstName"]+"<br>"+"length of cars : "+
    cars.length+"<br>"+"sort cars : "+
    cars.sort()+"<br>"+"Rits adding to cars : "+
    cars.push("Rits")+"<br>"+" cars : "+cars+"<br>"+"pop from cars : "+
    cars.pop()+"<br>"+"shift from cars : "+cars.shift()+"<br>"+"unshifting to cars : "+
    cars.unshift("BMW")+"<br>"+" cars : "+cars+"<br>"+"delete from cars : "+
    delete cars[0]+"<br>"+" cars : "+cars+"<br>"+" splice to cars "+
    cars.splice(2,0,"BMW","Rits")+"<br>"+" cars : "+cars+"<br>"+" splice from cars  "+
    cars.splice(0,1)+"<br>"+" cars : "+cars+"<br>"+" Concatinating cars and cars1 : "+"<br>"+cars.concat(cars1)
    ;
