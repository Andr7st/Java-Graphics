import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 2341236124294704410L;

    
    ImageIcon image = new ImageIcon("img/icono.png");
    Border borde = BorderFactory.createLineBorder(Color.BLACK, 4);

    public Main() {

        this.setTitle("Andr7st");
        this.setSize(720,480);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new PanelPrincipal());
        //this.pack(); // Acopla al tamaño de lo que tiene dentro
    }

    private class PanelPrincipal extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        private PanelPrincipal() {

            this.setBackground(Color.MAGENTA.darker().darker().darker());
            this.setBorder(borde);
        }
    }

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new Main().setVisible(true);
            }
        });

    }
}