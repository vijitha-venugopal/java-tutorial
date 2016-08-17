/**
 * with keyword
 * Created by vijitha on 17/08/16.
 */


function addPrice(amount) {
    with (this) {
        price = amount;
    }
}
function book(title, author){
    this.title = title;
    this.author  = author;
    this.price = 0;
    this.addPrice = addPrice; // Assign that method as property.
}
var myBook = new book("Perl", "Mohtashim");
myBook.addPrice(100);

document.write("Book title is : " + myBook.title + "<br>");
document.write("Book author is : " + myBook.author + "<br>");
document.write("Book price is : " + myBook.price + "<br>");