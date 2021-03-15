package andr7st;
/**
 * @author Andrés Segura.
 */

public class Main {
    public static void main(String[] args) {
        
        // Invocar la ventana:
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new andr7st.interfaz.Ventana().setVisible(true);;

            }
        }); 
    }
}