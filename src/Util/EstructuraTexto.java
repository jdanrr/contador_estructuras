package Util;

import java.text.Normalizer;
import EstructurasDatos.Lista;

/**
 * Clase de apoyo para normalizar líneas de texto.
 * Convierte a minúsculas, elimina acentos y separa palabras.
 */
public class EstructuraTexto {

    /**
     * Convierte una línea de texto en una Lista de palabras limpias.
     *
     * @param linea línea original
     * @return Lista de palabras normalizadas
     */
    public Lista<String> obtenerPalabras(String linea) {

        // Si la línea es null, regresamos una lista vacía
        if (linea == null) {
            return new Lista<>();
        }

        // Normalizar: quitar tildes, pasar a minúsculas, limpiar símbolos
        String limpio = Normalizer.normalize(linea, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase()
                .replaceAll("[^a-zA-Z ]", " ");

        limpio = limpio.trim();

        // Si la línea termina vacía, retornamos una lista vacía
        if (limpio.isEmpty()) {
            return new Lista<>();
        }

        // Separar palabras
        String[] partes = limpio.split("\\s+");

        // Convertir el arreglo en tu Lista personalizada
        Lista<String> resultado = new Lista<>();

        for (String palabra : partes) {
            resultado.addLast(palabra);
        }

        return resultado;
    }
}
