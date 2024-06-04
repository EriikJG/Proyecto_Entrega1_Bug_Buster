/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Traductor;

/**
 *
 * @author alejo
 */
public class ProyectoIA {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Traductor t = new Traductor();

        String textoTraducidoABraille = t.traducirTexto("hola");
        String textoTraducidoAEspañol = t.traducirTexto("⠤");
        //String textoTraducido1 = t.traducirTexto("⠃");
        System.out.println(textoTraducidoABraille);
        System.out.println(textoTraducidoAEspañol);
    }
}
