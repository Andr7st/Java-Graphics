/**
 * @author Andrés Segura.
 */
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaA {

    public VentanaA() {

        JFrame v = new JFrame();

        v.setTitle("Andr7st | Ventana A");  // Titulo Ventana

        v.setSize(720, 480);    // Ancho - Alto

        v.setLocation(100,100); // Posicion

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar

        v.getContentPane().setBackground(Color.DARK_GRAY); // un color al frame

        v.setVisible(true);
    }
}