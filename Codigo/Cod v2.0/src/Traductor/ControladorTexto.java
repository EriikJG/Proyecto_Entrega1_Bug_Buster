/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Traductor;

/**
 *
 * @author alejo
 */
public class ControladorTexto {

    protected String[] dividirPorLineas(String texto) {
        return texto.split("\n");
    }

    protected String[] extraerPalabras(String cadena) {
        return cadena.split("\\s+");
    }

    protected void limpiarUltimoEspacio(StringBuilder resultado) {
        if (resultado.charAt(resultado.length() - 1) == ' ') {
            resultado.setLength(resultado.length() - 1);
        }
    }

    protected void limpiarUltimoSaltoDeLinea(StringBuilder resultado) {
        if (resultado.length() > 0 && resultado.charAt(resultado.length() - 1) == '\n') {
            resultado.setLength(resultado.length() - 1);
        }
    }

}
