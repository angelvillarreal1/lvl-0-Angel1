int xPos = 100;
int Posx = 1000;
void setup() {
  size(1000, 1000);
} 

void draw() {
  background(160, 160, 160);
  noFill();

  xPos++;
  Posx--;

  for (int i = 300; i >= 100; i-=10) { 
    ellipse(xPos, 500, 10+i,10+i);

    //  drawCircle( i, 400);
    //   xPos=xPos-1/2;
  }
  for (int i = 300; i >= 100; i-=10) {
    ellipse(Posx, 500, 10+i, 10+i);
  }
  //drawCircle(xPos, 400);
  //xPos=xPos-1;
  //for (int j = 700; j >= 500; j-=10) { 
  // earaseCircle( j,400);
  //}
} 

/*void drawCircle(int x, int y) {
 for (int m = 500; m <= 10; m+=10) {
 ellipse( 700, 400, m, m);
 xPos=xPos-1;
 }
 }
 
 void earaseCircle(int x, int y) {
 for (int i = 500; i >= 10; i-=10) { 
 ellipse( x, y, i, i);
 }
 }*/