/**
 * @author Andrés Segura.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Ventana a mostrar: ");

        Scanner entrada = new Scanner(System.in);
        int numVentana = Integer.parseInt(entrada.nextLine());

        entrada.close();



        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                // Invocar una ventana:2

                // Usar switch

                switch (numVentana) {
                    case 1:
                        new VentanaA();
                        break;

                    case 2:
                        new VentanaB().setVisible(true);
                        break;
                
                    default:
                        new VentanaC().setVisible(true);
                        break;
                }

            }
        }); 
    }
}