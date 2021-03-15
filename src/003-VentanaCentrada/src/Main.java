/**
 * @author Andrés Segura.
 * 
 * Programa para ejercicio de programacion y posible revicion de código.
 */
public class Main {
    public static void main(String[] args) {
        
        // Introducir por consola en numero de la pantalla a la que invocar:
        System.out.print("Introduce el numero (1-2) de la ventana a mostrar '0' para cerrar: ");
    
        int numVentana;
        
        try {

            numVentana = Integer.parseInt(System.console().readLine());

            //// En caso de iongresar el número 0 ce cierra el programa.
            if (numVentana == 0) {
                // Forzar liberacion de RAM, Salir
                System.gc();
                System.exit(0);
            }
            
        } catch (Exception e) {
            //TODO: handle 
            numVentana = -1;

            main(args);

        }

        //// Se
        int invocarVentana = numVentana;
        

        //// Llamar la interfaz grafica:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                switch (invocarVentana) {

                    case 1:  new InterfazA().setVisible(true);  break;
                    default: new InterfazB().setVisible(true);  break;
                }
                
            }
        }); 


        //// No se cierra sinó que se vuelve a invocar la primera ´linea.
        main(args);
    }
}