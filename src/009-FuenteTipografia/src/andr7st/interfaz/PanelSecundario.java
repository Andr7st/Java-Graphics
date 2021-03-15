package andr7st.interfaz;

import java.awt.Color;
import javax.swing.*;


public class PanelSecundario extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public PanelSecundario() {

        this.setBackground(Color.GRAY);
        this.setBounds(0, 240, 720, 240);
        setLayout(null);


        String mensaje = "Soy Andr7st y estoy aprendiendo programación con java.";

        JLabel lbl = new JLabel(mensaje);
        lbl.setForeground(new Color(74,26,18));
        lbl.setFont(new andr7st.tipografia.Fuentes().MyFont(1, 24));
        lbl.setBounds(10, 50, 720, 52);


        this.add(lbl);


    }
    
}
