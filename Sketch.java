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
    background(3, 248, 252);

    // Return statement to output center of the house
    System.out.println("Center of the house 1 (x): " + houseReturnOutput(25, 50, 400));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Grass Rectangle
    grass(0, 300, 400, 100);

    // Sun 
    sun(50, 60, 80);

    // House 1
    house(150, 100, 200);

    // House 2 
    house(houseReturnOutput(25, 50, 400)+150, 200, 200);
    
  }
  /**
  * Draws a base rectangle for the grass on the drawing
  *
  * @param intGrassX x-coordinate for the grass
  * @param intGrassY y-coordinate for the grass
  * @param intGrassWidth width of grass
  * @param intGrassHeight height of grass
  * 
  */
  private void grass(int intGrassX, int intGrassY, int intGrassWidth, int intGrassHeight)
  { 
    // Draw the rectangle base for the grass
    stroke(0, 120, 0);
    fill(0, 120, 0);
    rect(intGrassX, intGrassY, intGrassWidth, intGrassHeight);
  }

   /**
  * Draws the circle 
  * 
  * @param intSunX x-coordinate of the sun
  * @param intSunY y-coordinate of the sun
  * @param intSunSize size of the sun
  * 
  */
  private void sun(int intSunX, int intSunY, int intSunSize)
  { 
    // Draw sun
    stroke(255, 167, 0);
    fill(255, 255, 0);
    ellipse(intSunX, intSunY, intSunSize, intSunSize);
  }

  /**
  * Depiction of a house at the coordinates and custom scaled
  *
  * @param intHouseX  The x coordinate of the house 
  * @param intHouseY  The y coordinate of the house 
  * @param intScale  The scale of the house (default: 400)
  *
  */
  private void house(int intHouseX, int intHouseY, int intScale) 
  {
     // Base square for house
    fill(255, 255, 255); // White
    rect(intHouseX, intHouseY+(intScale/8), (intScale/2), (intScale/2));

     // Triangle for roof
    fill(255, 77, 0); // Red
    triangle(intHouseX, intHouseY+(intScale/8), intHouseX+(intScale/4), intHouseY, intHouseX+(intScale/2), intHouseY+(intScale/8));

     // Rectangle for door
    fill(168, 81, 0); // Brown
    rect(intHouseX+(intScale/4), intHouseY+((intScale/4)+(intScale/8)), (intScale/8), (intScale/4));
  }

/**
  * Return function for the x coordinate of the center of the house
  *
  * @param intHouseX  The x coordinate of the house 
  * @param intHouseY  The y coordinate of the house 
  * @param intScale  The scale of the house 
  * @return Returns the center point of the house
  *
  */
  private int houseReturnOutput(int HouseX, int HouseY, int Scale) 
  {
    return HouseX+(Scale/4);
  }
  
  
}
