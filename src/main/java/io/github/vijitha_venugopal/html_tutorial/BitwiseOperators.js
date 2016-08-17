/**
 * Bitwise operatins
 * Created by vijitha on 17/08/16.
 */
var a = 2;
var b = 3;
var linebreak = "<br />";

document.write("a = ");
document.write(a);
document.write(linebreak);
document.write("b = ");
document.write(b);
document.write(linebreak);

document.write("(a & b) => ");
result = (a & b);
document.write(result);
document.write(linebreak);

document.write("(a | b) => ");
result = (a | b);
document.write(result);
document.write(linebreak);

document.write("(a ^ b) => ");
result = (a ^ b);
document.write(result);
document.write(linebreak);

document.write("(~b) => ");
result = (~b);
document.write(result);
document.write(linebreak);

document.write("(a << b) => ");
result = (a << b);
document.write(result);
document.write(linebreak);

document.write("(a >> b) => ");
result = (a >> b);
document.write(result);
document.write(linebreak);