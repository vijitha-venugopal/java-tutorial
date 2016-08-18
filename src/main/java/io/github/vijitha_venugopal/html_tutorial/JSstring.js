/**
 * java script string
 * Created by vijitha on 18/08/16.
 */
var txt = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"";
var txt1="\'ABCD\'";
var txt2=String(txt1);
document.getElementById("demo").innerHTML ="text1 : "+
    txt + "<br>"+"text length : "+txt.length+"<br>"+"text2 : "+
    txt1 + "<br>"+"text length : "+txt1.length+"<br>"+"text3 :"+
    txt2+"<br>"+"text length: "+txt2.length+"<br>"+"typeof text1 :"+
    typeof(txt)+"<br>"+"typeof text2 :"+
    typeof(txt1)+"<br>"+"typeof text3 :"+
    typeof(txt2);