void setup() {
  size(1000, 1000);
}
void draw() {
  fill(255, 255, 255);
  ellipse(400, 500, 150, 100);
  ellipse(600, 500, 150, 100);
  fill(0, 0, 0);
  ellipse(mouseX, mouseY, 75, 50);
  ellipse(mouseX+200, mouseY, 75, 50);
}