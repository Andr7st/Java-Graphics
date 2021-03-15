package andr7st;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Andr7st
 * @author Andrés Segura
 */

public class Main {
    public static void main(String[] args) {
        
        new Ventana();

    

    }
}

class Ventana extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    JPanel panelReloj = new JPanel();
    JLabel labelReloj = new JLabel();


    

    


    Ventana() {

        /// Poniendo panel y label

        label.setText("Capturar");
        label.setForeground(new Color(24,246,232));
        
        //// Label para poner un mensaje;
        label.setText(this.obtenerMensaje());
        
        labelReloj.setForeground(Color.BLACK);
        labelReloj.setFont(new Font("Fira Code", Font.BOLD, 32));

        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(Color.GRAY.darker());
       // panel.setLayout(new BorderLayout());
        panel.add(label);


        panelReloj.setBackground(Color.GRAY);


        this.setTitle("Andr7st");
        //this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout()); // java.awt.BorderLayout
        this.setSize(540, 360);
        this.setLocationRelativeTo(null); // Para centrar la ventana
        this.setResizable(false);
        this.add(panel, BorderLayout.NORTH);

        panelReloj.add(labelReloj);
        this.add(panelReloj);
        this.setVisible(true);
        //////////////////////////////////////////////////////////////

        correrReloj();

    }


    public void correrReloj() {

        Tiempo tiempo = new Tiempo();
        tiempo.HoraMeridiana();
        
        labelReloj.setText(tiempo.obtenerHora());
        
        do {
            //// Retraso de un segundo    
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            
            /// Ejecutar la obtención de la hora
            tiempo.HoraMeridiana();
            labelReloj.setText(tiempo.obtenerHora());
            
        } while (!false); 

    }


    private String mensaje;


    public String obtenerMensaje(){


        mensaje = "Andrés Segura ";
        

        return mensaje;
    }
}