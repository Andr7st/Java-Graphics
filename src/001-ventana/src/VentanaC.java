/**
 * @author Andrés Segura.
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaC extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -5716426823708589006L;

    private int ALTO  = 480;
    private int ANCHO = 720;


    public VentanaC() {

        this.setTitle("Andr7st | Ventana C");
        this.setSize(ANCHO, ALTO);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Instanciar panel principal
        PanelPrincipal panel = new PanelPrincipal();
        this.add(panel);
    }


    //// Clase con un panel
    public class PanelPrincipal extends JPanel {

        PanelPrincipal() {
            this.setBackground(Color.GRAY);
        }
    }
    
}
