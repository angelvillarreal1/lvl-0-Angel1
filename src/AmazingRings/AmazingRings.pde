void setup() {
  size(1000, 1000);
  background(160, 160, 160);
} 

void draw() {
  fill(255,255,255); 
  for (int i = 700; i >= 500; i-=10) { 
  drawCircle( i, 400);
 
  }
  drawCircle(300, 400);
}
void drawCircle(int x, int y) {
  for (int i = 500; i >= 10; i-=10) { 
    ellipse( x, y, i, i);
  }
void earaseCircle(int x, int y) {
  for (int i = 500; i >= 10; i-=10) { 
    ellipse( x, y, i, i);
  }
    
}