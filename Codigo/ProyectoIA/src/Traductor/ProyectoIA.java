package Traductor;

import ProyectoGUI.MENU;

public class ProyectoIA {

    public static void main(String[] args) {
        // MENU menu = new MENU();
        // menu.setVisible(true);

        Traductor t = new Traductor();

        // Ejemplos de texto en Braille para traducir
        String textoTraducido = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠕⠇⠸⠾"); // (Árbol)
        String textoTraducido1 = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠾⠇⠸⠾"); // (Ából)
        String textoTraducido2 = t.traducirTexto("⠸⠷⠷ ⠿ ⠽⠷⠾⠸⠾");  // (áéíúó)
        // String textoTraducido3 = t.traducirTexto("⠸⠷⠨⠁⠗⠃⠾⠇⠾ ⠸⠪⠒⠨⠙⠸⠻");

        // Imprime los resultados de las traducciones
        System.out.println(textoTraducido);
        System.out.println(textoTraducido1);
        System.out.println(textoTraducido2);
    }
}
