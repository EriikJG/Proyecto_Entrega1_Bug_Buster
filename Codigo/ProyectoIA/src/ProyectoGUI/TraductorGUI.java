package ProyectoGUI;

import Traductor.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat; 
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;

public class TraductorGUI extends javax.swing.JFrame {

    private Traductor traductor;

    public TraductorGUI() {
        initComponents();
        traductor = new Traductor();
    }

    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton espToBraButton = new JButton("Español a Braille");
        espToBraButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(espToBraButton);

        JButton braToEspButton = new JButton("Braille a Español");
        braToEspButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(braToEspButton);

        JButton exitButton = new JButton("Cerrar Programa");
        exitButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(exitButton);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);

        espToBraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazEspToBra();
            }
        });

        braToEspButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirInterfazBraToEsp();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void abrirInterfazEspToBra() {
        JFrame espToBraFrame = new JFrame("Español a Braille");
        espToBraFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        espToBraFrame.setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(12, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextArea inputArea = new JTextArea(5, 20);
        inputArea.setLineWrap(true);
        panel.add(new JScrollPane(inputArea));

        JButton translateButton = new JButton("Traducir a Braille");
        panel.add(translateButton);

        panel.add(new JLabel("Texto en Braille:"));
        JTextArea outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        panel.add(new JScrollPane(outputArea));

        JButton clearButton = new JButton("Limpiar Pantalla");
        panel.add(clearButton);

        JButton returnButton = new JButton("Volver al Menú");
        panel.add(returnButton);

        JButton saveImageButton = new JButton("Guardar Imagen");
        panel.add(saveImageButton); // añadido botón de guardar imagen

        espToBraFrame.getContentPane().add(panel);
        espToBraFrame.setVisible(true);

        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoEspanol = inputArea.getText();
                String textoBraille = traductor.traducirTexto(textoEspanol);
                outputArea.setText(textoBraille);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputArea.setText("");
                outputArea.setText("");
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                espToBraFrame.dispose();
            }
        });

        saveImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarImagenComoPNG(outputArea.getText());
            }
        });
    }

    private void abrirInterfazBraToEsp() {
        JFrame frameBrailleAEspanol = new JFrame("Traducir de Braille a Español");
        frameBrailleAEspanol.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameBrailleAEspanol.setSize(400, 400);
        frameBrailleAEspanol.setLayout(new BorderLayout());

        JPanel panelBrailleAEspanol = new JPanel();
        panelBrailleAEspanol.setLayout(new GridLayout(4, 1, 10, 10));
        panelBrailleAEspanol.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea textoBraille = new JTextArea(5, 20);
        textoBraille.setLineWrap(true);
        textoBraille.setWrapStyleWord(true);
        panelBrailleAEspanol.add(new JScrollPane(textoBraille));

        JTextArea textoEspanol = new JTextArea(5, 20);
        textoEspanol.setLineWrap(true);
        textoEspanol.setWrapStyleWord(true);
        textoEspanol.setEditable(false);
        panelBrailleAEspanol.add(new JScrollPane(textoEspanol));

        JButton btnTraducir = new JButton("Traducir");
        btnTraducir.setFont(new Font("Arial", Font.BOLD, 16));
        panelBrailleAEspanol.add(btnTraducir);

        JButton btnTecladoBraille = new JButton("Abrir Teclado Braille");
        btnTecladoBraille.setFont(new Font("Arial", Font.BOLD, 16));
        panelBrailleAEspanol.add(btnTecladoBraille);

        JButton btnRegresarMenu = new JButton("Regresar");
        btnRegresarMenu.setFont(new Font("Arial", Font.PLAIN, 14));
        panelBrailleAEspanol.add(btnRegresarMenu);

        JButton saveImageButton = new JButton("Guardar Imagen");
        panelBrailleAEspanol.add(saveImageButton); // añadido botón de guardar imagen

        frameBrailleAEspanol.add(panelBrailleAEspanol, BorderLayout.CENTER);
        frameBrailleAEspanol.setVisible(true);

        btnTraducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textoBraille.getText();
                if (!texto.isEmpty()) {
                    String textoTraducido = traductor.traducirTexto(texto);
                    textoEspanol.setText(textoTraducido);
                }
            }
        });

        btnTecladoBraille.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTecladoBraille(textoBraille);
            }
        });

        btnRegresarMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameBrailleAEspanol.dispose();
                new TraductorGUI().setVisible(true);
            }
       
        });

        saveImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarImagenComoPNG(textoEspanol.getText());
            }
        });
    }

    private void abrirTecladoBraille(JTextArea textoBraille) {
        JPanel panelTeclado = new JPanel();
        panelTeclado.setLayout(new GridLayout(4, 7));  // Ajustado para 28 caracteres

        String[] brailleChars = {"⠁", "⠃", "⠉", "⠙", "⠑", "⠋", "⠛", "⠓", "⠊", "⠚", "⠅", "⠇", "⠍", "⠝", "⠕", "⠏", "⠟", "⠗", "⠎", "⠞", "⠥", "⠧", "⠺", "⠭", "⠽", "⠵", ".", ","};  // Caracteres Braille y signos de puntuación

        for (String brailleChar : brailleChars) {
            JButton btn = new JButton(brailleChar);
            btn.setFont(new Font("Braille", Font.PLAIN, 24));
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textoBraille.append(brailleChar);
                }
            });
            panelTeclado.add(btn);
        }

        JOptionPane.showMessageDialog(null, panelTeclado, "Teclado Braille", JOptionPane.PLAIN_MESSAGE);
    }

    private void guardarImagenComoPNG(String texto) {
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        Font font = new Font("Arial", Font.PLAIN, 24);
        g2d.setFont(font);
        FontMetrics fm = g2d.getFontMetrics();
        int width = fm.stringWidth(texto);
        int height = fm.getHeight();
        g2d.dispose();

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g2d = image.createGraphics();
        g2d.setColor(java.awt.Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.setColor(java.awt.Color.BLACK);
        g2d.setFont(font);
        g2d.drawString(texto, 0, fm.getAscent());
        g2d.dispose();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Imagen");
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                ImageIO.write(image, "png", fileToSave);
                JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraductorGUI().setVisible(true);
            }
        });
    }
}
