
/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asdf
{
    public static void main(String[] args)
    {
        int score=89;    //initialize value according to question
        char grade;

    switch(score/10) {

    case 10: grade = 'S'; 
    case  9: grade = 'A'; break;
    case  8: grade = 'B'; 
    case  7: grade = 'C'; 
    case  6: grade = 'D'; break;
    case  5: grade = 'E'; 
    default: grade = 'F';
    }
    
    System.out.println(grade);
    }
}
