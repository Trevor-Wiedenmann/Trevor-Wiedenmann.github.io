import java.util.ArrayList;
import java.util.Random;

/**
 * Use an ArrayList to store a collection of objects and use a for-each loop to process the objects.
 * 
 * @author amit
 *
 */
public class ArrayListExercise {

    public static void main(String[] args)
    {
        Random rand = new Random();
        final int RADIUS_MAX = 100;
        //TODO: declare a constant for the number of spheres NUM_SPHERES and 
        //      initialize it appropriately
        final int NUM_SPHERES = 4;
        //TODO: Declare the ArrayList to hold the Sphere objects
        ArrayList<Sphere> spheres = new ArrayList<Sphere>();
        //TODO: Create the spheres using a normal for loop and add them to an ArrayList<Sphere>
        for(int i = 0; i < NUM_SPHERES; i++){
        Sphere s = new Sphere(rand.nextInt(RADIUS_MAX));
        spheres.add(s);
        }
       
        int counter = 1;
        //TODO: Convert to a for-each loop to print out the spheres
        for (Sphere s: spheres) {
        System.out.println("Sphere" + counter++ + ": \t" + s + "\n");
        }
        
        double min = Integer.MAX_VALUE;
        //TODO: Convert to a for-each loop to find the volume of the smallest sphere
        for (Sphere s: spheres) {
            if(s.getVolume() < min)
            {
            	min = s.getVolume();
            }
        }
        System.out.printf("Volume of the smallest sphere: %.2f\n", min);

        
    }
}