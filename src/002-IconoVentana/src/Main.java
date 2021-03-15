public class Main {

    public static void main(String[] args) {

        /*
            System.getProperty("os.name").toLowerCase().startsWith("windows")){ /// Si es Windows
        */


        init();
            
    }

    public static void init() {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Ventana().setVisible(true);

            }
        }); 
    }
}



//import java.io.IOException;;
/*
public class Main {

    public static void ejecutar() {

        Runtime rt = Runtime.getRuntime();
        Process proceso;


        try {
            //// Preguntar el sistema Operativo
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){ /// Si es Windows 
                
                proceso = rt.exec("notepad"); 
                
                
            }
            else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){ /// Si es Mac
                
                proceso = rt.exec("textedit"); /// ???? No conozco el comando apara Mac 
            }
            
            else{ /// Entonces si es linux

                
                /* 
                
if(System.getProperty("os.name").startsWith("Nux") || System.getProperty("os.name").startsWith("Nix")) {

    .contains()
                
                proceso = rt.exec("kate"); 
                
                
                *
                
                proceso = rt.exec("kate"); 
            }
            proceso.waitFor(); /// Esperando a que finalice la aplicasion
            
        } catch (Exception e) {
            
            
            System.err.println(e); // no puede ejecutar el comando.
            System.exit(1); //// 1 ,Error del sistema, no de este progranma
            
        }


        System.out.println("cerrado");
        
        
    }

    public static void main(String[] args) {
        ejecutar();
    }
}*/