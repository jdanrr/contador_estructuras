package conteopalabraslibro;

import java.util.Scanner;
import Modelo.EstructuraConteo;

/**
 * Clase principal del proyecto.
 * Permite ingresar la ruta del archivo y ejecutar el análisis
 * de palabras usando la estructura de conteo.
 */
public class PruebaLibro {

    /**
     * Método principal (punto de entrada) del programa.
     *
     * @param args argumentos de línea de comandos (no usados).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CONTEO DE PALABRAS DE UN LIBRO");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Ingrese la ruta del archivo .txt: ");
        String ruta = sc.nextLine();

        EstructuraConteo analizador = new EstructuraConteo();
        analizador.procesarArchivo(ruta);
        analizador.mostrarEstadisticas();
    }
}
