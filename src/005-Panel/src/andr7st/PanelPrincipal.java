package andr7st;
import andr7st.paneles.*;

import javax.swing.*;
import java.awt.Color;

public class PanelPrincipal extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PanelPrincipal() {
        this.setBackground(new Color(245,21,99));

        this.setLayout(null);


        this.add(new PanelSecundarioA());
        this.add(new PanelSecundarioB());
    }
    
}
