import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	
    // Sun
    fill(246, 255, 0);
    ellipse(460, 50, 150, 150);

    // House
    fill(0, 0, 0);
    rect(120, 240, 220, 220);
    
    // Window 1
    fill(222, 222, 222);
    rect(130, 290, 50, 50);

    // Window 2
    fill(222, 222, 222);
    rect(200, 290, 50, 50);

    // Window 3
    fill(222, 222, 222);
    rect(270, 290, 50, 50);

    // Grass
    fill(8, 242, 0);
    rect(0, 450, 500, 80);

    // Pathway
    fill(216, 227, 148);
    rect(200, 450, 70, 80);

    // Roof
    fill(44, 101, 156);
    triangle(80, 240, 250, 140, 380, 240);
  
  // define other methods down here.
}