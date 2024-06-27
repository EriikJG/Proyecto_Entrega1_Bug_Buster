/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProyectoGUI;

import Traductor.Traductor;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author pilco
 */
public class FormBraEsp extends javax.swing.JPanel {

    private boolean[] puntosPresionados;
    JButton[] puntos;
    private Traductor traductor;
    
    public FormBraEsp() {
        initComponents();
        puntosPresionados = new boolean[6];
        traductor = new Traductor();
        crearArregloPuntos(); // Llama al método para inicializar el arreglo puntos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB66 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTABraille = new javax.swing.JTextArea();
        jBTraducir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAEsp = new javax.swing.JTextArea();
        jBLimpiar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBGenCar = new javax.swing.JButton();
        jBEspacio = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(490, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        // Establecer el color de fondo del panel a blanco
        jPanel.setBackground(java.awt.Color.WHITE);
        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel.setToolTipText("Este es el cuadratin que te permitirá ingresar tus caracteres.");

        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB66ActionPerformed(evt);
            }
        });

        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB66, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTABraille.setEditable(false);
        jTABraille.setBackground(new java.awt.Color(255, 255, 255));
        jTABraille.setColumns(20);
        jTABraille.setRows(5);
        jTABraille.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto en Braille"));
        jScrollPane1.setViewportView(jTABraille);

        jBTraducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/language_translator_icon_150921.png"))); // NOI18N
        jBTraducir.setText("Traducir");
        jBTraducir.setToolTipText("Con este botón podrás traducir tus caracteres a Español.");
        jBTraducir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTraducirActionPerformed(evt);
            }
        });

        jTAEsp.setEditable(false);
        jTAEsp.setBackground(new java.awt.Color(255, 255, 255));
        jTAEsp.setColumns(20);
        jTAEsp.setRows(5);
        jTAEsp.setToolTipText("Aquí puedes observar todos tus caracteres traducidos!");
        jTAEsp.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto traducido"));
        jScrollPane2.setViewportView(jTAEsp);

        jBLimpiar.setText("Limpiar Pantalla");
        jBLimpiar.setToolTipText("Con este botón puedes limpiar los cuadros de texto.");
        jBLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {
                {"⠁", "a", "⠃", "b"},
                {"⠉", "c", "⠙", "d"},
                {"⠑", "e", "⠋", "f"},
                {"⠛", "g", "⠓", "h"},
                {"⠊", "i", "⠚", "j"},
                {"⠅", "k", "⠇", "l"},
                {"⠍", "m", "⠝", "n"},
                {"⠻", "ñ", "⠕", "o"},
                {"⠏", "p", "⠟", "q"},
                {"⠗", "r", "⠎", "s"},
                {"⠞", "t", "⠥", "u"},
                {"⠧", "v", "⠺", "w"},
                {"⠭", "x", "⠽", "y"},
                {"⠵", "z", "⠲", "."},
                {"⠂", ",", "⠦", "?"},
                {"⠖", "!", "⠆", ";"},
                {"⠒", ":", "⠤", "-"},
                {" ", " ", "⠷", "á"},
                {"⠿", "é", "⠽", "í"},
                {"⠾", "ó", "⠷", "ú"},
                {"⠳", "ü", "⠈", "@"},
                {"⠨⠁", "A", "⠨⠃", "B"},
                {"⠨⠉", "C", "⠨⠙", "D"},
                {"⠨⠑", "E", "⠨⠋", "F"},
                {"⠨⠛", "G", "⠨⠓", "H"},
                {"⠨⠊", "I", "⠨⠚", "J"},
                {"⠨⠅", "K", "⠨⠇", "L"},
                {"⠨⠍", "M", "⠨⠝", "N"},
                {"⠨⠻", "Ñ", "⠨⠕", "O"},
                {"⠨⠏", "P", "⠨⠟", "Q"},
                {"⠨⠗", "R", "⠨⠎", "S"},
                {"⠨⠞", "T", "⠨⠥", "U"},
                {"⠨⠧", "V", "⠨⠺", "W"},
                {"⠨⠭", "X", "⠨⠽", "Y"},
                {"⠨⠵", "Z"},
                {"⠼⠁", "1", "⠼⠃", "2"},
                {"⠼⠉", "3", "⠼⠙", "4"},
                {"⠼⠑", "5", "⠼⠋", "6"},
                {"⠼⠛", "7", "⠼⠓", "8"},
                {"⠼⠊", "9", "⠼⠚", "0"}
            },
            new String [] {
                "Símbolo Braille", "Letra", "Símbolo Braille", "Letra"
            }
        ));
        jTable1.setToolTipText("Este es una tablita con todos los caracteres Braille para tu uso!");
        jScrollPane4.setViewportView(jTable1);
        // Desactivar el ajuste automático del tamaño de las columnas
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel1.setText("Diccionario para recordar :)");

        jBGenCar.setText("Generar caracter");
        jBGenCar.setToolTipText("Con este botón puedes generar el caracter Braille que desees!");
        jBGenCar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jBGenCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenCarActionPerformed(evt);
            }
        });

        jBEspacio.setBackground(new java.awt.Color(0, 0, 0));
        jBEspacio.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jBEspacio.setForeground(new java.awt.Color(255, 255, 255));
        jBEspacio.setText("SPACE");
        jBEspacio.setToolTipText("Botón de espacio para separar tus caracteres.");
        jBEspacio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jBEspacio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEspacioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBGenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jBTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jBTraducir))
                    .addComponent(jBEspacio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBGenCar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed

    }//GEN-LAST:event_jB1ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed

    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed

    }//GEN-LAST:event_jB5ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed

    }//GEN-LAST:event_jB2ActionPerformed

    private void jB66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB66ActionPerformed

    }//GEN-LAST:event_jB66ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed

    }//GEN-LAST:event_jB3ActionPerformed

    private void jBTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTraducirActionPerformed
        // Traducir el texto al Español
        String textoBraille = jTABraille.getText();
        String textoEsp = traductor.traducirTexto(textoBraille);
        jTAEsp.setText(textoEsp);
        reiniciarBotones();
    }//GEN-LAST:event_jBTraducirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTAEsp.setText("");
        jTABraille.setText("");
        reiniciarBotones();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBGenCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenCarActionPerformed
        Character brailleChar = convertirABraille(puntosPresionados);
        if (brailleChar != null) {
            jTABraille.append(Character.toString(brailleChar));

        } else {
            // Mostrar mensaje de advertencia si el carácter no es válido
            JOptionPane.showMessageDialog(null, "Caracter no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        reiniciarBotones();
    }//GEN-LAST:event_jBGenCarActionPerformed

    private void jBEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEspacioActionPerformed
        // Agregar un espacio al área de texto de Braille
        jTABraille.append(" ");
    }//GEN-LAST:event_jBEspacioActionPerformed

        private void crearArregloPuntos() {
        puntos = new JButton[]{jB1, jB4, jB2, jB5, jB3, jB66};

        for (int i = 0; i < puntos.length; i++) {
            int finalI = i;
            puntos[i].addActionListener(e -> {
                puntosPresionados[finalI] = !puntosPresionados[finalI];
                puntos[finalI].setBackground(puntosPresionados[finalI] ? Color.BLACK : Color.WHITE);
                char brailleChar = convertirABraille(puntosPresionados);
                System.out.println(brailleChar); // Imprimir el caracter Braille
            });
        }
    }

    
    private void reiniciarBotones() {
        for (int i = 0; i < puntos.length; i++) {
            puntosPresionados[i] = false;
            puntos[i].setBackground(Color.WHITE);
        }
    }

    
    private Character convertirABraille(boolean[] puntosPresionados) {
        // Mapea la representación binaria a caracteres Braille
        StringBuilder braillePattern = new StringBuilder();
        // La representación del patrón Braille sigue el orden: 1, 4, 2, 5, 3, 6
        for (int i = 0; i < puntosPresionados.length; i++) {
            braillePattern.append(puntosPresionados[i] ? "1" : "0");
        }

        // Mapa de algunos patrones Braille comunes
        Map<String, Character> brailleMap = new HashMap<>();
        // Indicador de mayúscula
        brailleMap.put("010001", '⠨'); // Indicador de mayúscula
        //Letras 
        brailleMap.put("100000", '⠁'); // a
        brailleMap.put("101000", '⠃'); // b
        brailleMap.put("110000", '⠉'); // c
        brailleMap.put("110100", '⠙'); // d
        brailleMap.put("100100", '⠑'); // e
        brailleMap.put("111000", '⠋'); // f
        brailleMap.put("111100", '⠛'); // g
        brailleMap.put("101100", '⠓'); // h
        brailleMap.put("011000", '⠊'); // i
        brailleMap.put("011100", '⠚'); // j
        brailleMap.put("100010", '⠅'); // k
        brailleMap.put("101010", '⠇'); // l
        brailleMap.put("110010", '⠍'); // m
        brailleMap.put("110110", '⠝'); // n
        brailleMap.put("100110", '⠕'); // o
        brailleMap.put("111010", '⠏'); // p
        brailleMap.put("111110", '⠟'); // q
        brailleMap.put("101110", '⠗'); // r
        brailleMap.put("011010", '⠎'); // s
        brailleMap.put("011110", '⠞'); // t
        brailleMap.put("100011", '⠥'); // u
        brailleMap.put("101011", '⠧'); // v
        brailleMap.put("011101", '⠺'); // w
        brailleMap.put("110011", '⠭'); // x
        brailleMap.put("110111", '⠽'); // y
        brailleMap.put("100111", '⠵'); // z
        // Números (requieren el prefijo de número ⠼ que es 3456)
        brailleMap.put("010111", '⠼'); // Prefijo número
        brailleMap.put("100000", '⠁'); // 1
        brailleMap.put("101000", '⠃'); // 2
        brailleMap.put("110000", '⠉'); // 3
        brailleMap.put("110100", '⠙'); // 4
        brailleMap.put("100100", '⠑'); // 5
        brailleMap.put("111000", '⠋'); // 6
        brailleMap.put("111100", '⠛'); // 7
        brailleMap.put("101100", '⠓'); // 8
        brailleMap.put("011000", '⠊'); // 9
        brailleMap.put("011100", '⠚'); // 0
        // Signos de puntuación
        brailleMap.put("001000", '⠂'); // Coma
        brailleMap.put("001010", '⠆'); // Punto y coma
        brailleMap.put("001101", '⠲'); // Punto
        brailleMap.put("001110", '⠖'); // Signo de exclamación
        brailleMap.put("001011", '⠦'); // Signo de interrogación
        brailleMap.put("001100", '⠒'); // Signo de 2 puntos
        
        // Otros símbolos
        brailleMap.put("010110", '⠤'); // Guion medio
        brailleMap.put("010000", '⠈'); // @ (arroba)
        //Otros símbolos
        brailleMap.put("101111", '⠷'); // á
        brailleMap.put("111111", '⠿'); // é
        brailleMap.put("010010", '⠌'); // í
        brailleMap.put("011111", '⠾'); // ó
        brailleMap.put("010110", '⠜'); // ú
        brailleMap.put("101101", '⠳'); // ü
        
        // Obtener el carácter Braille correspondiente al patrón
        return brailleMap.getOrDefault(braillePattern.toString(), null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB66;
    private javax.swing.JButton jBEspacio;
    private javax.swing.JButton jBGenCar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBTraducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTABraille;
    private javax.swing.JTextArea jTAEsp;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
