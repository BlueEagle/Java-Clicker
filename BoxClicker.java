import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.InputEvent;

public class BoxClicker {

    public static void main(final String[] args) {
        try {
            // make robot object
            final Robot bobTheClicker = new Robot();

            // gather & print screen data
            System.out.println("Gathering screen dimensions");
            final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            final int screenHeight = screenSize.height;
            final int screenWidth = screenSize.width;
            System.out.println("Screen width: " + screenWidth + ", height: " + screenHeight + "\n\n");
            final int[] centerPoint = { screenWidth / 2, screenHeight / 2 };

            System.out.println("Circle mode activate!");
            bobTheClicker.mouseMove(centerPoint[0], centerPoint[1]);

            for (int i = 0; i < 100; i++) {
                final double radius = 100;
                double theta = 0;
                final double h = centerPoint[0];
                final double k = centerPoint[1];
                double step = (double) ((int) (Math.random() * 50 + 1));
                ;

                System.out.println("About to do the thing!");
                while (theta <= 360) {
                    final int[] circleCoord = { (int) (h + radius * Math.cos(theta)),
                            (int) (k + radius * Math.sin(theta)) };
                    System.out.println(circleCoord[0] + "   " + circleCoord[1]);
                    bobTheClicker.mouseMove(circleCoord[0], circleCoord[1]);
                    Thread.sleep((int) (Math.random() * 70 + 31));

                    // sprinkle in some randomness
                    step = (double) ((int) (Math.random() * 50 + 1));

                    // click
                    bobTheClicker.mousePress(InputEvent.BUTTON1_MASK);
                    bobTheClicker.mouseRelease(InputEvent.BUTTON1_MASK);

                    theta += step;
                }
            }

        } catch (final Exception e) {
            System.out.print(e);
        }
    }

}