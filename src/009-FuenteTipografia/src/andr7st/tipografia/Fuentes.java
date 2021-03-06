package andr7st.tipografia;

import java.awt.Font;
import java.io.InputStream;

public class Fuentes {

    private Font font = null;

    public Fuentes() {
        
        String fontName = "Stick-Regular.ttf" ;

        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
    }

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
    public Font MyFont( int estilo, float tamanio) {
        Font fuente = font.deriveFont(estilo, tamanio);
        return fuente;
    }

}

      /*   File file = new File(fontName);
        if(file.exists()) {
            System.out.println("si existe");
        }
        else{
            System.out.println("No existe");
        }
        fontName = file.getAbsolutePath(); */
