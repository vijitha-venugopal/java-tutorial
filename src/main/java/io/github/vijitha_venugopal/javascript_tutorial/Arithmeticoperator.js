/**
 * Created by vijitha on 17/08/16.
 */

var a = 33;
var b = 10;
var c = 15;
var linebreak = "<br/>";

document.write("a = ");
document.write(a);
document.write(linebreak);
document.write("b = ");
document.write(b);
document.write(linebreak);
document.write("c = ");
document.write(c);
document.write(linebreak);

document.write("a + b = ");
result = a + b;
document.write(result);
document.write(linebreak);

document.write("a - b = ");
result = a - b;
document.write(result);
document.write(linebreak);

document.write("a / b = ");
result = a / b;
document.write(result);
document.write(linebreak);

document.write("a % b = ");
result = a % b;
document.write(result);
document.write(linebreak);

document.write("a + b + c = ");
result = a + b + c;
document.write(result);
document.write(linebreak);

a = ++a;
document.write("++a = ");
result = ++a;
document.write(result);
document.write(linebreak);

b = --b;
document.write("--b = ");
result = --b;
document.write(result);
document.write(linebreak);