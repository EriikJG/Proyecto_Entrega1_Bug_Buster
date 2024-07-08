/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.Map;

/**
 * Clase abstracta que proporciona métodos para traducir texto entre español y Braille.
 * También maneja la visualización de caracteres en Braille y la conversión entre caracteres en español y Braille.
 */
public abstract class Diccionario {
    // Constantes para caracteres especiales en Braille
    protected static final String CARACTER_NUMERO = "⠼";
    protected static final String CARACTER_SIMBOLO = "⠸";
    protected static final String CARACTER_MAYUSCULAS = "⠨";
    protected static final String CARACTER_LETRA = "⠰";

    protected ControladorTexto controladorTexto = new ControladorTexto();

    /*
    MUESTRA PEQUEÑA PARA PREGUNTAR A CHATGPT
    private static final Map<Character, String> caracteresEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresBrailleEsp = new HashMap<>();
    private static final Map<String, Character> caracteresNumerosBrailleEsp = new HashMap<>();
    private static final Map<Character, String> caracteresNumerosEspBraille = new HashMap<>();
    private static final Map<String, Character> caracteresSimbolosBraileEsp = new HashMap<>();
    private static final Map<Character, String> caracteresSimbolosEspBraile = new HashMap<>();
    private static final String CARACTER_NUMERO = "⠼";
    private static final String CARACTER_SIMBOLO = "⠸";
    private static final String CARACTER_MAYUSCULAS = "⠨";
    private static final String CARACTER_LETRA = "⠰";

static {
        // Mapeo de caracteres en español a Braille
        caracteresEspBraille.put('a', "⠁");
        caracteresEspBraille.put('0', "⠚");
        caracteresEspBraille.put('A', CARACTER_MAYUSCULAS + "⠁");
        caracteresEspBraille.put('!', "⠖");

        // Mapeo de caracteres en español a Braille
        caracteresBrailleEsp.put("⠁", 'a');
        caracteresBrailleEsp.put("⠚", '0');
        caracteresBrailleEsp.put(CARACTER_MAYUSCULAS + "⠁", 'A');
        caracteresBrailleEsp.put("⠖", '!');
    }
     */
    /**
     * Procesa el texto a traducir, dividiéndolo en líneas y palabras, y traduciéndolo a Braille.
     *
     * @param textoATraducir El texto en español a traducir a Braille.
     * @return El texto traducido a Braille.
     */
    public String procesarTexto(String textoATraducir) {
        StringBuilder resultado = new StringBuilder();
        String[] lineas = controladorTexto.dividirEnLineas(textoATraducir);

        for (String linea : lineas) {
            String[] palabras = controladorTexto.dividirEnPalabras(linea);
            resultado.append(traducirPalabras(palabras));
            controladorTexto.limpiarUltimoEspacio(resultado);
            resultado.append("\n");
        }

        controladorTexto.limpiarUltimoSaltoDeLinea(resultado);

        return resultado.toString();
    }
    /**
     * Traduce una palabra específica a Braille y la agrega a un StringBuilder.
     * Este método debe ser implementado por las clases que extiendan Diccionario.
     *
     * @param palabra La palabra en español a traducir.
     * @param resultado El StringBuilder donde se almacenará la palabra traducida.
     */
    protected abstract void traducir(String palabra, StringBuilder resultado);
    /**
     * Traduce un array de palabras en español a Braille.
     *
     * @param palabras El array de palabras en español a traducir.
     * @return Un StringBuilder con las palabras traducidas a Braille.
     */
    private StringBuilder traducirPalabras(String[] palabras) {
        StringBuilder resultado = new StringBuilder();
        StringBuilder palabraTraducida = new StringBuilder();

        for (String palabra : palabras) {
            traducir(palabra, palabraTraducida);
            resultado.append(palabraTraducida);
            palabraTraducida.setLength(0);
            resultado.append(" ");
        }

        controladorTexto.limpiarUltimoEspacio(resultado);

        return resultado;
    }
}
