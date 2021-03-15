import java.awt.Color;

import javax.swing.*;

public class InterfazA extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -3263976421166348338L;

    
    private final int VENTANA_ALTO = 480;
    private final int VENTANA_ANCHO = 720;
    
    public InterfazA() {

        this.setTitle("Andr7st | Ventana Centrada automaticamente");
        this.setSize(VENTANA_ANCHO, VENTANA_ALTO);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.add(new PanelPrincipal());
    }

    /**
     *  La otra ionterfaz tambien tiene un panel llamado 'PanelPrincipal' pero el 
     * modificador es private, asi que no dará ningun error.
     */ 
    private class PanelPrincipal extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        private PanelPrincipal() {

            this.setBackground(Color.ORANGE.darker().darker().darker());
        }
    }
    
}
