/**
 * @author Andrés Segura.
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class VentanaD extends JFrame {

    
    public VentanaD() {

        this.setTitle("Andr7st | Ventana D");
        this.setSize(720, 480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.add(new PanelPrincipal());
    }

    private class PanelPrincipal extends JPanel {

        private PanelPrincipal() {

            this.setBackground(Color.DARK_GRAY);
            this.setLayout(new FlowLayout());



            Dimension tamanoPantalla = Toolkit.getDefaultToolkit().getScreenSize();

            JLabel label = new JLabel();
            label.setText("Resolución: " + tamanoPantalla.width + " x " + tamanoPantalla.height);
            label.setForeground(Color.WHITE);

            this.add(label);

        }

    }
}