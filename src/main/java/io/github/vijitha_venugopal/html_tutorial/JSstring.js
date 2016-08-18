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
    typeof(txt2)+"<br>"+"text2 and text3 are same ? : "+
    (txt1==txt2)+"<br>"+"Index of G in text1 : "+
    txt.indexOf("G")+"<br>"+"Search G in text1 :"+
    txt.search("G")+"<br>"+"After Slice text1 : "+
    txt.slice(1,10)+"<br>"+"Substring of ABCD : "+
    txt1.substring(1,3)+"<br>"+"Substr of ABCD : "+txt1.substr(1,2)+"<br>"+"replace ABCD as ABBD: "+txt1.replace("BC","BB");
