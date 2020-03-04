import java.awt.Robot;
import java.awt.AWTException;

public class Clicker {

    public static void main(String[] args) {
        System.out.println("This had better work....");
        try{
            System.out.println("making clicker");
            Robot bobTheClicker = new Robot();

            System.out.println("clicker formed!");
            bobTheClicker.mouseMove(1, 1);
            System.out.print("worked!");
        } catch (Exception e) { System.out.print(e); }
    }

}