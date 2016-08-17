/**
 * logical operations
 * Created by vijitha on 17/08/16.
 */
var a = true;
var b = false;
var linebreak = "<br />";

document.write("a = ");
document.write(a);
document.write(linebreak);
document.write("b = ");
document.write(b);
document.write(linebreak);

document.write("(a && b) => ");
result = (a && b);
document.write(result);
document.write(linebreak);

document.write("!(a && b) => ");
result = (!(a && b));
document.write(result);
document.write(linebreak);

document.write("(a || b) => ");
result = (a || b);
document.write(result);
document.write(linebreak);