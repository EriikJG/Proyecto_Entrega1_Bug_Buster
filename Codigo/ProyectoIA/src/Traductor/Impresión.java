package Traductor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Clase para imprimir texto en una imagen y en la consola.
 */
public class Impresión {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final String OUTPUT_IMAGE_PATH = "imagen_con_texto.png";
    private static final String OUTPUT_MIRRORED_IMAGE_PATH = "imagen_espejo.png";

    public void imprimirTexto(String texto) {
        // Imprimir en la consola
        System.out.println(texto);

        // Generar la imagen con el texto
        BufferedImage imagen = generarImagenConTexto(texto);

        // Guardar la imagen
        guardarImagen(imagen, OUTPUT_IMAGE_PATH);

        // Generar la imagen espejo
        BufferedImage imagenEspejo = generarImagenEspejo(imagen);

        // Guardar la imagen espejo
        guardarImagen(imagenEspejo, OUTPUT_MIRRORED_IMAGE_PATH);
    }

    private BufferedImage generarImagenConTexto(String texto) {
        BufferedImage imagen = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagen.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);
        g2d.setColor(Color.BLACK);
        // Usar una fuente compatible con braille
        Font font = new Font("Braille", Font.PLAIN, 48);
        g2d.setFont(font);
        g2d.drawString(texto, 10, 100); // Ajustar la posición según sea necesario
        g2d.dispose();
        return imagen;
    }

    private BufferedImage generarImagenEspejo(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        BufferedImage imagenEspejo = new BufferedImage(width, height, imagen.getType());
        Graphics2D g = imagenEspejo.createGraphics();
        g.drawImage(imagen, width, 0, -width, height, null);
        g.dispose();
        return imagenEspejo;
    }

    private void guardarImagen(BufferedImage imagen, String outputPath) {
        try {
            File outputImageFile = new File(outputPath);
            ImageIO.write(imagen, "png", outputImageFile);
            System.out.println("La imagen se ha guardado correctamente en: " + outputImageFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
