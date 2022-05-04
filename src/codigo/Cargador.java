package codigo;

import java.io.File;

/**
 * Clase que carga los datos que contiene el archivo flex
 * 
 * @author Ricardo
 */
public class Cargador {


    /**
     * Metodo principal de ejecucion del programa
     */
    public static void main(String[] args) {
        String ruta = "./src/codigo/Lexer.flex";
        generarLexer(ruta);
    }


    /**
     * Este metodo carga los datos del archivo flex
     * 
     * @param ruta String Recibe la ruta de donde se encuentra el archivo flex
     */
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }


}
