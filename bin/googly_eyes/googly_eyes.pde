void setup() {
  size(1000, 1000);
  
  

}
void draw() {
  PImage face = loadImage("face.jpg");
  image(face, 0, 18);
  println("X:"+ mouseX +" Y:"+ mouseY);
  fill(255, 255, 255);
  ellipse(400, 500, 150, 100);
  ellipse(600, 500, 150, 100);
  fill(0, 0, 0);
 // if(mouseX > 465 && mouseY > 543 && mouseX < 332 && mouseY < 465){
     
  //} 
  if(mouseX < 472 && mouseX > 325 && mouseY > 457 && mouseY < 549){
  ellipse(mouseX, mouseY, 75, 50);
    ellipse(mouseX+200, mouseY, 75, 50);
  }else{ 
    ellipse(400, 500, 75, 50);
    ellipse(600, 500, 75, 50);
  }
}