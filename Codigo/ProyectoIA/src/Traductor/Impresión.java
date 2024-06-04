package Traductor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Clase para imprimir texto en una imagen y en la consola.
 */
public class Impresión {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;

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
    

    public static BufferedImage generarImagenConTexto(String texto) {
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
/*
    public static BufferedImage generarSenialetica(String texto) {
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
*/
    public static BufferedImage generarImagenEspejo(BufferedImage imagen) {
        int width = imagen.getWidth();
        int height = imagen.getHeight();
        BufferedImage imagenEspejo = new BufferedImage(width, height, imagen.getType());
        Graphics2D g = imagenEspejo.createGraphics();
        g.drawImage(imagen, width, 0, -width, height, null);
        g.dispose();
        return imagenEspejo;
    }

    public static void guardarImagen(BufferedImage imagen, String outputPath) {
        try {
            File outputImageFile = new File(outputPath);
            ImageIO.write(imagen, "png", outputImageFile);
            JOptionPane.showMessageDialog(null, "Señalización Braille guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public static void guardarImagen(BufferedImage imagen, String nombreBase, String mensajeExito) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Imagen");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File carpeta = fileChooser.getSelectedFile();
            try {
                String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                File archivo = new File(carpeta, nombreBase + "_" + timestamp + ".png");
                ImageIO.write(imagen, "png", archivo);
                JOptionPane.showMessageDialog(null, mensajeExito, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }*/
}
