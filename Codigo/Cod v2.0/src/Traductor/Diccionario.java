/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

import java.util.Map;

/**
 *
 * @author alejo
 */
public abstract class Diccionario {

    protected static final String CARACTER_NUMERO = "⠼";
    protected static final String CARACTER_SIMBOLO = "⠸";
    protected static final String CARACTER_MAYUSCULAS = "⠨";
    protected static final String CARACTER_LETRA = "⠰";

    protected ControladorTexto controladorTexto;

    public Diccionario() {
        this.controladorTexto = new ControladorTexto();
    }

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
    public String procesarTexto(String textoATraducir) {
        StringBuilder resultado = new StringBuilder();
        String[] lineas = controladorTexto.dividirPorLineas(textoATraducir);

        for (String linea : lineas) {
            String[] palabras = controladorTexto.extraerPalabras(linea);
            resultado.append(traducirPalabras(palabras));
            controladorTexto.limpiarUltimoEspacio(resultado);
            resultado.append("\n");
        }

        controladorTexto.limpiarUltimoSaltoDeLinea(resultado);

        return resultado.toString();
    }

    protected abstract void traducir(String palabra, StringBuilder resultado);
    
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
