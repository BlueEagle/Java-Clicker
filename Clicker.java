import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Clicker {

    public static void main(String[] args) {
        try{
            // make robot object
            Robot bobTheClicker = new Robot();

            // gather & print screen data
            System.out.println("Gathering screen dimensions");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;
            System.out.println("Screen width: " + screenWidth + ", height: " + screenHeight + "\n\n");
            int[] centerPoint = {screenWidth/2, screenHeight/2};
            

            System.out.println("Circle mode activate!");
            bobTheClicker.mouseMove(centerPoint[0], centerPoint[1]);

            for(int i=0; i<100;i++){
            double radius = 200;
            double theta = 0;
            double h = centerPoint[0];
            double k = centerPoint[1];
            double step = 1;

            System.out.println("About to do the thing!");
            while(theta++ <= 360) {
                int[] circleCoord = {
                    (int)(h + radius*Math.cos(theta)),
                    (int)(k + radius*Math.sin(theta))
                };
                System.out.println(circleCoord[0] + "   " + circleCoord[1]);
                bobTheClicker.mouseMove(circleCoord[0], circleCoord[1]);
            }
            }




        } catch (Exception e) { System.out.print(e); }
    }

}