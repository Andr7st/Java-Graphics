package andr7st;

import javax.swing.*;
import java.awt.EventQueue;
import java.awt.*;

public class Main extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -574811724436425960L;

    ////--------------------------------------------------------------------------
    private int VENTANA_ANCHO = 720;
    private int VENTANA_ALTO  = 480;
    private Dimension tamanoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
    int alturaPantalla  = tamanoPantalla.height;
    int anchuraPantalla = tamanoPantalla.width;
    int posicionarY = (alturaPantalla/2)  - (VENTANA_ALTO/2);
    int posicionarX = (anchuraPantalla/2) - (VENTANA_ANCHO/2); // -24
    //----------------------------------------------------------------------------


    public Main() {
        
        this.setBounds(posicionarX, posicionarY, VENTANA_ANCHO, VENTANA_ALTO);
        this.setTitle("Andr7st | Paneles");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.add(new PanelPrincipal());
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Main().setVisible(true);
            }
        });
    }

}