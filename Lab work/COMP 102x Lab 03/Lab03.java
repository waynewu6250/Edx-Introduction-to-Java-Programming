import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image = new ColorImage();
        
        int width = image.getWidth();
        int height = image.getHeight();
        Canvas canvas = new Canvas(width,height);
        
        canvas.add(image);
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage leftimage = new ColorImage();
        ColorImage rightimage = new ColorImage();
        int width = leftimage.getWidth();
        int height = leftimage.getHeight();
        Canvas canvas = new Canvas(2*width,height);
        
        canvas.add(leftimage);
        canvas.add(rightimage,width,0);
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image = image1.add(image2);
        
        int width = image1.getWidth();
        int height = image1.getHeight();
        Canvas canvas = new Canvas(3*width+20,height);
        
        canvas.add(image1);
        canvas.add(image2,width+10,0);
        canvas.add(image,2*width+20,0);
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image = image1.multiply(image2);
        
        int width = image1.getWidth();
        int height = image1.getHeight();
        Canvas canvas = new Canvas(3*width+20,height);
        
        canvas.add(image1);
        canvas.add(image2,width+10,0);
        canvas.add(image,2*width+20,0);
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
