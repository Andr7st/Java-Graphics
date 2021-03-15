/**
 * @author Andrés Segura
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class InterfazB extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -7745263239832367370L;

    
    private int VENTANA_ANCHO = 720;
    private int VENTANA_ALTO  = 480;
    

    /**
     * PARA CALCULAR EL CENTRO DE LA PANTALLA:
     * 
     * Crear un objeto de tipo 'Dimension' que captura el tamañio de la pantalla.
     * 
     * para calcular la posicion X se resta la mitad de la atura de la pantalla con
     * la mitad del tamaño de la ventana que se crea. Igualmente con la posicion Y
     * 
     */
    private Dimension tamanoPantalla = Toolkit.getDefaultToolkit().getScreenSize();

    int alturaPantalla  = tamanoPantalla.height;
    int anchuraPantalla = tamanoPantalla.width;

    int posicionarY = (alturaPantalla/2)  - (VENTANA_ALTO/2);
    int posicionarX = (anchuraPantalla/2) - (VENTANA_ANCHO/2); // -24

    // ----------------------------------------------------------------------------------



    public InterfazB() {

        setTitle("Andr7st | Ventana centrada manualmente");
        setSize(VENTANA_ANCHO, VENTANA_ALTO);
        setLocation(posicionarX, posicionarY - 24); // Le resto 24 para compensar con respecto a la barra de tareas.
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);

        //setLocationRelativeTo(null);

        add(new PanelPrincipal());
    }

    private class PanelPrincipal extends JPanel {
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        private PanelPrincipal() {
            setBackground(Color.CYAN.darker().darker());

            JLabel lbl = new JLabel();

            lbl.setText("Alto :" + String.valueOf(tamanoPantalla.height));

            add(lbl);
        }
    }
}