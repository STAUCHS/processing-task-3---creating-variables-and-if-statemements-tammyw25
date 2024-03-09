import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
	// Declare your variables

  // body of the fish 
  int Height;
  int Width;
  int intRandom;
  int randomHeight;
  int intRandomX;
  int intRandomY;
  int intRandomEyeColour;
  int intRandomFishColour;


  // eye of the fish
 
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  // Time 
  int intHour = hour();
  int intMinute = minute();
  int intSecond = second();


  public void setup() {

    // Background through time
    if(intHour >= 5 && intHour < 10){
    background(129, 200, 247);
    }
    else {
    background(129, 200, 247);
    }


  // body of the fish
    fill(247,235,178);
    stroke(247,235,178);
    Random randomFishColour = new Random();
    int intRandomFishColour = randomFishColour.nextInt(247);
    Random randomWidth = new Random();
    int intRandomY = randomWidth.nextInt(400);
   
   
  // eye of the fish
    fill(0,5,5);
    stroke(0,5,5);
    Random randomEyeColour = new Random();
    int intRandomEyeColour = randomEyeColour.nextInt(5);
    Random randomHeight = new Random();
    int intRandomX = randomHeight.nextInt(500);
    
    
  }

  public void draw() {

    println(intHour + ":" + intMinute + intSecond); 
	  
      //tail
      fill(237,98,38);
      stroke(237,98,38);
      triangle((float) (width / (400.0/200.0)), (float) (height / (400.0/220.0)), (float) (width / (400.0/20.0)), (float) (height / (400.0/100.0)), (float) (width / (400.0/20.0)), (float) (height / (400.0/350.0)));

     
   
      //body of the fish
      fill(247,235,178);
      stroke(247,235,178);
      ellipse((float) (width / (400.0/240.0)), (float) (height / (400.0/180.0)), (float) (width / (400.0/280.0)), (float) (height / (400.0/235.0)));
     
      if(intRandomY > 250 && intRandomX > 250) {
        stroke(intRandomFishColour);
        fill(intRandomFishColour);
      } 
      else if(intRandomY < 250 && intRandomX < 250) {
        stroke(intRandomFishColour);
        fill(intRandomFishColour);
      }
      else 
      stroke (247,235,178);
      fill (247,235,178);

      //fins
      fill(237,98,38);
      stroke(237,98,38);
      beginShape();
      vertex((float) (width / (400.0/100.0)), (float) (height / (400.0/100.0)));
      vertex((float) (width / (400.0/200.0)), (float) (height / (400.0/100.0)));
      vertex((float) (width / (400.0/250.0)), (float) (height / (400.0/200.0)));
      vertex((float) (width / (400.0/200.0)), (float) (height / (400.0/250.0)));
      endShape(CLOSE);

     
       //eye of the fish
      fill(0,5,5);
      stroke(0,5,5);
      ellipse((float) (width / (400.0/282.0)), (float) (height / (400.0/150.0)), (float) (width / (400.0/20.0)), (float) (height / (400.0/20.0)));
   
      if(intRandomY > 0 && intRandomX > 0) {
        stroke(intRandomEyeColour);
        fill(intRandomEyeColour);
      } 
      else if(intRandomY < 0 && intRandomX < 0) {
        stroke(intRandomEyeColour);
        fill(intRandomEyeColour);
      }
      else 
      stroke (0,5,5);
      fill (0,5,5);
   



   
    


  }
  
  
}