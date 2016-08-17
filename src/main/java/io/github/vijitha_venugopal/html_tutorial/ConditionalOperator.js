/**
 * conditional operations
 * Created by vijitha on 17/08/16.
 */
var a = 10;
var b = 20;
var linebreak = "<br />";

document.write(" a=");
document.write(a);
document.write(linebreak);
document.write(" b=");
document.write(b);
document.write(linebreak);

document.write ("((a > b) ? true : false) => ");
result = (a > b) ? true : false;
document.write(result);
document.write(linebreak);

document.write ("((a < b) ? true : false) => ");
result = (a < b) ? true : false;
document.write(result);
document.write(linebreak);