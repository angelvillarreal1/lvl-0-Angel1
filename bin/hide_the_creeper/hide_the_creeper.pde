boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}
PImage creeper; 
void setup() {
  size(1000, 1000); 
  PImage minecraft = loadImage("minecraft.jpg");     
  minecraft.resize(width, height);     
  background(minecraft);     
  creeper=loadImage("creeper.png");
  creeper.resize(10, 10);
}
void draw() {

  image(creeper, 255, 952);  
  if (mousePressed) {
     println(mouseX, mouseY);
    if (isNear(mouseX, 255)==true & isNear(mouseY, 952)==true){
       
      System.out.println("this method is working");
      fill(0, 255, 0);
    } else {
      fill(255, 0, 0);
    }
    ellipse(mouseX, mouseY, 10, 10);
  }
}