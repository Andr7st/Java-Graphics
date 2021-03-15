package andr7st;

import java.awt.Color;

/**
 * BorderLayout
 * 
 * Expandir paneles con resecto al tamaño de la ventaa
 */

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void Ventana(){

        JFrame ventana = new JFrame("Andr7st");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(220,200,620,480);
        //ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout(10,10)); // Entre () las margenes
        ventana.setVisible(true);

        /// Instanciar lospaneles:
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Poner colores:
        panel1.setBackground(Color.YELLOW);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.RED);
        panel4.setBackground(Color.CYAN);
        panel5.setBackground(Color.GREEN);

        //// 
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //// Agregando los paneles a cada punto cardinal
        ventana.add(panel1, BorderLayout.NORTH);
        ventana.add(panel2, BorderLayout.WEST);
        ventana.add(panel3, BorderLayout.EAST);
        ventana.add(panel4, BorderLayout.SOUTH);
        ventana.add(panel5, BorderLayout.CENTER);





        //// SubPanel: solo es un panel normal que irá dentro de otro panel

        JPanel subPanel = new JPanel();
        subPanel.setBackground(Color.LIGHT_GRAY);
        subPanel.setPreferredSize(new Dimension(50,50));
        subPanel.add(new JLabel("Andrés Segura"));

        panel5.setLayout(new BorderLayout());
        panel5.add(subPanel, BorderLayout.SOUTH);



    }
    public static void main(String[] args) {

        Ventana();
        
    }
}