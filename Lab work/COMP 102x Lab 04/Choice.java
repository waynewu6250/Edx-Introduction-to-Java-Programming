import comp102x.ColorImage;
import comp102x.Canvas; 

/**
 * The Choice class represents a choice made by the player or the computer.
 * It can be either "rock", "paper", or "scissors".
 */
public class Choice
{
    private int type; //stores the choice type: 0=rock, 1=paper, 2=scissors
    
    /**
     * The constructor
     * 
     * @param   type   the choice type to be represented by this Choice object
     */
    public Choice(int type)
    {
        //initialize the "type" instance varialble
        this.type = type;
    }
    
    /**
     * Get a number that represents the choice type
     * 
     * @return  a number that represents the choice type: 0=rock, 1=paper, 2=scissors
     */
    public int getType()
    {
        return type;
    }
    
    /**
     * Compare "this" with anotherChoice
     * 
     * @param   anotherChoice   the choice to be compared
     * @return  either 1, -1, or 0 which indicates the comparison result: 1 means "this" wins anotherChoice; -1 means "this" loses to anotherChoice; 0 means "this" and anotherChoice are the same
     */
    public int compareWith(Choice anotherChoice)
    {
        // write your code after this line
        int result=0;
        switch(this.type-anotherChoice.type){
            case -2: result = 1;
                     break;
            case -1: result = -1;
                     break;
            case 0:  result = 0;
                     break;
            case 1:  result = 1;
                     break;
            case 2:  result = -1;
                     break;
                    }
           
        return result; // this line should be modified/removed upon finishing the implementation of this method
    }
    
    /**
     * Draw the choice image (rock/paper/scissors) on the given canvas
     * 
     * @param   canvas      the canvas to draw on
     * @param   x           the x-position of the choice image to be drawn
     * @param   y           the y-position of the choice image to be drawn
     * @param   rotation    the rotation of the choice image to be drawn
     */ 
    public void draw(Canvas canvas, int x, int y, int rotation)
    {
        // write your code after this line
        ColorImage choiceImage = new ColorImage("rock.png");
        if(this.type == 0) choiceImage = new ColorImage("rock.png");
        else if(this.type == 1) choiceImage = new ColorImage("paper.png");
        else if(this.type == 2) choiceImage = new ColorImage("scissors.png");
        
        choiceImage.setX(x);
        choiceImage.setY(y);
        choiceImage.setRotation(rotation);
        
        canvas.add(choiceImage);
         
        
        
        
        
    }
}
