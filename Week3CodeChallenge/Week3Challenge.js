window.onload = function(){
    let Book1 = document.getElementById("book1").value;
    let book2 = document.getElementById("book2").value;
    let book3 = document.getElementById("book3").value;
    console.log("My bookshelf consists of"+book1+", "+book2+", "+book3); 
}
function bookshelf(book1, book2, book3){
    book1= ["The Barking Ghost", "R. L. Stine", "Horror", "BarkingGhost.jpg"];
    book2= ["The Cat in the Hat", "Dr. Seuss", "Children", "CatintheHat.jpg"];
    book3= ["The Chef", "James Patterson", "Thriller", "TheChef.jpg"];
   if (bookshelf != null){
    return book1, book2, book3; 
   } 
}
function editBook(){
    book1[0] = "The Girl Who Cried Monster";
    book1[4] = "GirlCriedMonster";
    document.getElementById("div1").innerHTML = book1; 
    book2[0] = "Green Eggs and Ham";
    book2[4] = "GreenEggs.jpg";
    document.getElementById("div1").innerHTML = book2;
    
}
function viewBook(){
    document.getElementById("div1").innerHTML = book1;
    document.getElementById("div1").innerHTML = book2; 
}
function deleteBook(){
    
}