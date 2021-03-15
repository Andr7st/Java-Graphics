package andr7st.interfaz;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import andr7st.tipografia.FuenteLetras;


public class Ventana extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -807345371278715318L;
    

    public Ventana() {
        this.setTitle("Andr7st");
        this.setSize(720,480);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new PanelPrincipal());
    }

    private class PanelPrincipal extends JPanel {

        /**
         *
         */
        private static final long serialVersionUID = 1L;


        Font miFuente = new FuenteLetras().getFuente(1, 1, 54);

        private PanelPrincipal() {

            this.setBackground(Color.DARK_GRAY);
            this.setLayout(null);

            JLabel lbl = new JLabel("Andr7st");
            lbl.setForeground(Color.WHITE);
            lbl.setFont(miFuente);
            lbl.setBounds(220, 80, 400, 52);
            
            this.add(lbl);
            this.add(new PanelSecundario());
            
        }
    }
}