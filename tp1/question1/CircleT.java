package question1;
import question1.Circle;

/**
 * D�crivez votre classe TestCircle ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class  CircleT
{

       public static void main(final String[] args) { 
        Circle c;                              
        c = new Circle();
        c.makeVisible();
        c.slowMoveHorizontal(20);
        c.slowMoveVertical(40);
        c.changeColor("yellow");
        
    } 
}
