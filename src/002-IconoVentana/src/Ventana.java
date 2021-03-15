import java.awt.Color;
import javax.swing.*;
import javax.swing.ImageIcon;


public class Ventana extends JFrame {


    ImageIcon icono = new ImageIcon("image/bandera.gif");
    
    public Ventana() {
        
        this.setTitle("Andr7st");
        this.setIconImage(icono.getImage());
        this.setSize(720,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(new PanelPrincipal());
    }

    private class PanelPrincipal extends JPanel {

        private PanelPrincipal() {

            setBackground(Color.DARK_GRAY);
           // setLayout(null);

            String sistemaOperativo = System.getProperty("os.name");

            JLabel lbl = new JLabel("Run: " + sistemaOperativo);

            lbl.setForeground(new Color(174,189,142));
           // lbl.setFont("Arial", Font.BOLD, 22);


            this.add(lbl);

        }
    }
}