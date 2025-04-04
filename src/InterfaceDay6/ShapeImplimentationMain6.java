//package InterfaceDay6;
//
//import java.awt.Graphics;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//interface Drawable{
//	
//	public void draw();
//}
//
//
//
//class Circle implements Drawable{
//
//	protected static final int X = 200;
//	protected static final int Y = 200;
//
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		
//		 JFrame frame = new JFrame("Circle Drawing");
//		
//		JPanel panelBgImg = new JPanel() {
//		    public void paintComponent(Graphics g) {
//		        int r = 5;
//				g.drawOval(X, Y, r, r);
//		    }
//		};
//		
//		 frame.add(panelBgImg);
//	        frame.setSize(300, 300);
//	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	        frame.setVisible(true);
//	}
//	
//}
//
//public class ShapeImplimentationMain6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Circle objCir = new Circle();
//		objCir.draw();
//
//	}
//
//}















//package InterfaceDay6;
//
//import java.awt.Graphics;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//interface Drawable {
//    public void draw();
//}
//
//class Circle implements Drawable {
//    private int radius;
//    private static final int FRAME_SIZE = 300;
//
//    public Circle() {
//        this.radius = 100; // Actual radius (not diameter)
//    }
//
//    @Override
//    public void draw() {
//        JFrame frame = new JFrame("Circle Drawing");
//        
//        JPanel panelBgImg = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                // Fix: Use diameter instead of radius for oval dimensions
//                int diameter = 2 * radius;
//                // Center the circle in the frame
//                int x = (FRAME_SIZE - diameter) / 2;
//                int y = (FRAME_SIZE - diameter) / 2;
//                g.drawOval(x, y, diameter, diameter);
//            }
//        };
//
//        frame.add(panelBgImg);
//        frame.setSize(FRAME_SIZE, FRAME_SIZE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//
//public class ShapeImplimentationMain6 {
//    public static void main(String[] args) {
//        Circle objCir = new Circle();
//        objCir.draw();
//    }
//}










import java.awt.*;
import javax.swing.*;

// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable
class Circle implements Drawable {

    public void draw() {
        // Create a new JFrame for displaying the circle
        JFrame frame = new JFrame("Circle Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a JPanel for custom drawing
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the drawing color to red and fill an oval
                g.setColor(Color.RED);
                g.fillOval(100, 100, 200, 200);
            }
        };

        // Add panel and make frame visible
        frame.add(panel);
        frame.setVisible(true);
    }
}

// Main class to run the program
public class ShapeImplimentationMain6 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }
}
