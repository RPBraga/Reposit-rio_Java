/*
 * Cálcula quantas polegadas cúbicas há em uma milha cúbica.
 */
/*
@author Rodrigo Braga
 */
public class Main {
    public static void main(String[] args) {
       long ci;
       long im;
       im = 5280 * 12;
       ci = im * im * im;
        System.out.println("São " + ci + " polegas cúbicas em uma milha cúbica.");
    }
}