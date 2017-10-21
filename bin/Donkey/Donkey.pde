PImage tail;
PImage donkey;
void setup() { 
  size(1000, 669);
  donkey = loadImage("donkey.jpg");    
  background(donkey);
  tail = loadImage("tail.png");
  rect(0, 0, 66, 66);
  rect(700,400,100,100);
}
void draw() {
  if (mouseX < 66 & mouseX > 0 & mouseY < 66 & mouseY > 0) {
    background(donkey);
  } else {
    //fill(0, 0, 0);
    //rect(0, 0, 1000, 669);
  }
  System.out.println("x="+mouseX+",y="+mouseY);
}
void mouseClicked() {
  image(tail, mouseX-70, mouseY-10);
}

