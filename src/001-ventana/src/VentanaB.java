
/**
 * @author Andrés Segura.
 */

import java.awt.Color;
import javax.swing.JFrame;

public class VentanaB extends JFrame {

    public VentanaB() {

        setTitle("Andr7st | Ventana B");
        setSize(720,480);
        setLocationRelativeTo(null); // Centrar a la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar
        setResizable(false); //impedir modificar tamaño
        getContentPane().setBackground(Color.GRAY); // un color al frame

        //setVisible(true); // Poner al llamarlo
    }
    
}
