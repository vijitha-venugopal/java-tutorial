/**
 * js date methods
 * Created by vijitha on 18/08/16.
 */
var d = new Date();
document.getElementById("demo").innerHTML =d+"<br>"+"Date : "+d.getDate()+
    "<br>"+"Day : "+d.getDay()+"<br>"+"full year : "+d.getFullYear()+"<br>"+"hours : "+
    d.getHours()+"<br>"+"milliseconds : "+d.getMilliseconds()+"<br>"+"minutes : "+
    d.getMinutes()+"<br>"+"month : "+d.getMonth()+"<br>"+"seconds : "+d.getSeconds()+"<br>"+"time : "+d.getTime();