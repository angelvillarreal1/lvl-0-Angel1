void setup() {
  size(1000, 1000);
  int x = 10;
} 

void draw() {
  noFill();
   for (int y = 700; y >= 10; y-=10) { 
    for (int i = 500; i >= 10; i-=10) { 
    ellipse(y, 400, i, i);
  }
 }
   for (int x = 300; x >= 10; x+=10) { 
    for (int i = 500; i >= 10; i-=10) { 
    ellipse(x, 400, i, i);
    }
  }
}