void setup () {
  size(800, 200);
  fill(#0E1AE8);
  
}
int x = 25;
void draw(){
 if(mousePressed){
  x = x + 2;
 }
  clear();
  ellipse(x, 100, 100, 100);
  if(x == 775){
   playSound();
    }

  
  
  
}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("quack.wav");
        sound.trigger();
        soundPlayed = true;
    }
}