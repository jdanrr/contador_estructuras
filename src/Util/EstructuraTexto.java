package Util;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase de apoyo para normalizar líneas de texto.
 * Convierte a minúsculas, elimina acentos y separa palabras.
 */
public class EstructuraTexto {

    /**
     * Convierte una línea de texto en una lista de palabras limpias.
     *
     * @param linea línea original
     * @return lista de palabras normalizadas
     */
    public List<String> obtenerPalabras(String linea) {

        if (linea == null) {
            return Collections.emptyList();
        }

        String limpio = Normalizer.normalize(linea, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase()
                .replaceAll("[^a-zA-Z ]", " ");

        limpio = limpio.trim();
        if (limpio.isEmpty()) {
            return Collections.emptyList();
        }

        String[] partes = limpio.split("\\s+");
        return Arrays.asList(partes);
    }
}
