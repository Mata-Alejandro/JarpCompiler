package Interface;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Home extends javax.swing.JFrame {

    private String fileName;
    private Clipboard clip = getToolkit().getSystemClipboard();

    public Home() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        checkButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorAreaReport = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        codeArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        archivoNuevoItem = new javax.swing.JMenuItem();
        abrirArchivoItem = new javax.swing.JMenuItem();
        guardarArchivoItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copiarTexto = new javax.swing.JMenuItem();
        cortarTexto = new javax.swing.JMenuItem();
        pegarTexto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(722, 750));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        checkButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/checkIcon.png"))); // NOI18N
        checkButton.setToolTipText("Verificar Gramatica");
        checkButton.setBorderPainted(false);
        checkButton.setContentAreaFilled(false);
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(checkButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkButton))
        );

        errorAreaReport.setColumns(20);
        errorAreaReport.setRows(5);
        jScrollPane1.setViewportView(errorAreaReport);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );

        codeArea.setColumns(20);
        codeArea.setRows(5);
        jScrollPane2.setViewportView(codeArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        archivoNuevoItem.setText("Archivo Nuevo ");
        archivoNuevoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoNuevoItemActionPerformed(evt);
            }
        });
        jMenu1.add(archivoNuevoItem);

        abrirArchivoItem.setText("Abrir Archivo");
        abrirArchivoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoItemActionPerformed(evt);
            }
        });
        jMenu1.add(abrirArchivoItem);

        guardarArchivoItem.setText("Guardar Archivo");
        guardarArchivoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoItemActionPerformed(evt);
            }
        });
        jMenu1.add(guardarArchivoItem);

        exitItem.setText("Salir");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        copiarTexto.setText("Copiar");
        copiarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(copiarTexto);

        cortarTexto.setText("Cortar");
        cortarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(cortarTexto);

        pegarTexto.setText("Pegar");
        pegarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(pegarTexto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivoNuevoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoNuevoItemActionPerformed
        codeArea.setText("");
        setTitle(fileName + " .jarp");
    }//GEN-LAST:event_archivoNuevoItemActionPerformed

    private void abrirArchivoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoItemActionPerformed
        FileDialog dialog = new FileDialog(this, "Abrir Archivo", FileDialog.LOAD);
        dialog.setVisible(true);

        if (dialog.getFile() != null) {
            fileName = dialog.getDirectory() + dialog.getFile();
            setTitle(fileName);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();

            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                codeArea.setText(sb.toString());
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Archivo no encontrado");
        }


    }//GEN-LAST:event_abrirArchivoItemActionPerformed

    private void guardarArchivoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoItemActionPerformed
        FileDialog dialog = new FileDialog(this, "Guardar ARchivo", FileDialog.SAVE);
        dialog.setVisible(true);
        if (dialog.getFile() != null) {
            fileName = dialog.getDirectory() + dialog.getFile();
            setTitle(fileName);

        }
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(codeArea.getText());
            setTitle(fileName);

        } catch (Exception e) {
            System.err.println("No se puede guarr");

        }


    }//GEN-LAST:event_guardarArchivoItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void copiarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarTextoActionPerformed
        String copyText;
        try {
            copyText = codeArea.getSelectedText();
            StringSelection copySelection = new StringSelection(copyText);
            clip.setContents(copySelection, copySelection);
        } catch (Exception e) {
            NullPointerException exception = new NullPointerException("Area no seleccionada");
            errorAreaReport.setText(exception.getMessage().toString());
        }


    }//GEN-LAST:event_copiarTextoActionPerformed

    private void cortarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarTextoActionPerformed

        try {
            String cutText = codeArea.getSelectedText();
            if (cutText.length() != 0) {
                StringSelection curSection = new StringSelection(cutText);
                clip.setContents(curSection, curSection);

                codeArea.replaceRange("", codeArea.getSelectionStart(), codeArea.getSelectionEnd());
            }else{
                NullPointerException ex= new NullPointerException("No hay nada seleccionado");    
                errorAreaReport.setText(ex.getLocalizedMessage().toString());
            }

        } catch (Exception e) {
            NullPointerException ex= new NullPointerException("No hay nada seleccionado");
        }
    }//GEN-LAST:event_cortarTextoActionPerformed

    private void pegarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarTextoActionPerformed
        try {
            Transferable pasteText = clip.getContents(Home.this);
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            codeArea.replaceRange(sel, codeArea.getSelectionStart(), codeArea.getSelectionEnd());
        } catch (Exception e) {
            throw new NullPointerException("No hay nada el clipboard");
        }
    }//GEN-LAST:event_pegarTextoActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

    
    Runtime test = new Runtime();
    String result=null;
    String code=codeArea.getText();
        if (code.length()!=0) {
            test.methodSysntax(code);
            result = test.methodSysntax(code);
            if (result.equals("Success")) {
                errorAreaReport.setForeground(Color.BLUE);
                errorAreaReport.setText(result);
            }else{
                errorAreaReport.setForeground(Color.RED);
                errorAreaReport.setText(result);
            }
        }else{
            NullPointerException error = new NullPointerException("No hay texto que evaluar");
            errorAreaReport.setForeground(Color.RED);
            errorAreaReport.setText(result);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirArchivoItem;
    private javax.swing.JMenuItem archivoNuevoItem;
    private javax.swing.JButton checkButton;
    private javax.swing.JTextArea codeArea;
    private javax.swing.JMenuItem copiarTexto;
    private javax.swing.JMenuItem cortarTexto;
    private javax.swing.JTextArea errorAreaReport;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenuItem guardarArchivoItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem pegarTexto;
    // End of variables declaration//GEN-END:variables
}
