void setup() {
  PImage waldo = loadImage("waldo.jpg");
  size(600, 300);
  image(waldo, 0, 0);
  doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
  woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}
void draw() {
  // 6. Use this print statement to find out the coordinates of Waldo
  println("X: " + mouseX + " Y: " + mouseY); 
  if(mousePressed){
  if (mouseX > 504 && mouseX < 515 && mouseY < 185 && mouseY > 146 ) { 
    print("Waldo found");
    playWoohoo();
  } else if(mouseX < 504 || mouseX > 515 || mouseY > 185 || mouseY < 146 ){
    print("not Waldo");
    playDoh();
  }
  }
  // 8. If Waldo is found, also use the method below to play “Woohoo”
  // Change the name of the sound file if you need to 
  // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
  // Change the name of the sound file if you need to
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;