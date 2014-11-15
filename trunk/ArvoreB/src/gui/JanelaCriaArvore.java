package gui;

import bin.ArvoreB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * @author Eduardo Ott
 */
public class JanelaCriaArvore extends javax.swing.JFrame {

    public static void insereValor(ArvoreB arvore, int valMax) {
        Random rnd = new Random();
        arvore.insereChave(rnd.nextInt(valMax));

    }

    public static ArvoreB criaArvore(int ordem, int qtdRegistros, int valMax) {
        ArvoreB tree = new ArvoreB(2);
        for (int i = 0; i < qtdRegistros; i++) {
            insereValor(tree, valMax);
        }
        return tree;
    }

    public void gravar(String arvore) {

        try {
            String txt = arvore;
            File arquivo = new File("C:\\teste\\arvore.txt");
            PrintWriter arqTexto = new PrintWriter(arquivo);
             System.out.println(txt);
            arqTexto.print("Alguma coisa");

        } catch (FileNotFoundException zueira) {
            FileNotFoundException zueira2;

        } /*catch (IOException IOE) {
         IOException BIOS;
         }*/

    }

    public void carregar(String caminho) {

    }

    private ArvoreB arvore;

    public JanelaCriaArvore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Ordem = new javax.swing.JTextField();
        jTextField2QtdInicial = new javax.swing.JTextField();
        jTextField3ValMax = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4Chave = new javax.swing.JTextField();
        jButton1Criar = new javax.swing.JButton();
        jButton2Insere = new javax.swing.JButton();
        jButton3Remove = new javax.swing.JButton();
        jButton1Print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPrint = new javax.swing.JTextArea();
        jButton1Save = new javax.swing.JButton();
        jButton2Load = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Criar ÁrvoreB");

        jLabel2.setText("Ordem:");

        jLabel3.setText("Qtd Registros Inicial (Randômicos):");

        jLabel4.setText("Valor máximo do registro: ");

        jTextField1Ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1OrdemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Editar ArvoreB");

        jLabel6.setText("Chave:");

        jTextField4Chave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ChaveActionPerformed(evt);
            }
        });

        jButton1Criar.setText("Criar");
        jButton1Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CriarActionPerformed(evt);
            }
        });

        jButton2Insere.setText("Inserir");
        jButton2Insere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2InsereActionPerformed(evt);
            }
        });

        jButton3Remove.setText("Remover");

        jButton1Print.setText("IMPRIMIR ÀRVORE");
        jButton1Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PrintActionPerformed(evt);
            }
        });

        jTextAreaPrint.setColumns(20);
        jTextAreaPrint.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPrint);

        jButton1Save.setText("Salvar");
        jButton1Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SaveActionPerformed(evt);
            }
        });

        jButton2Load.setText("Carregar");
        jButton2Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3ValMax, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(jTextField2QtdInicial)
                                    .addComponent(jTextField1Ordem)))
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1Print, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4Chave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton2Insere)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3Remove))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1Criar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2Load)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2QtdInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3ValMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Criar)
                            .addComponent(jButton1Save)
                            .addComponent(jButton2Load)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4Chave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2Insere)
                            .addComponent(jButton3Remove))
                        .addGap(32, 32, 32)
                        .addComponent(jButton1Print, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1OrdemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1OrdemActionPerformed

    private void jTextField4ChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ChaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ChaveActionPerformed

    private void jButton2InsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2InsereActionPerformed
        arvore.insereChave(Integer.parseInt(jTextField4Chave.getText()));
        jTextField4Chave.setText(null);
    }//GEN-LAST:event_jButton2InsereActionPerformed

    private void jButton1CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CriarActionPerformed
        this.arvore
                = criaArvore(Integer.parseInt(jTextField1Ordem.getText()),
                        Integer.parseInt(jTextField2QtdInicial.getText()),
                        Integer.parseInt(jTextField3ValMax.getText()));
        jTextField1Ordem.setText(null);
        jTextField2QtdInicial.setText(null);
        jTextField3ValMax.setText(null);
    }//GEN-LAST:event_jButton1CriarActionPerformed

    private void jButton1PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PrintActionPerformed
        jTextAreaPrint.setText(arvore.imprimeChave());

    }//GEN-LAST:event_jButton1PrintActionPerformed

    private void jButton1SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SaveActionPerformed
        String save = arvore.imprimeChave();
        gravar(save);


    }//GEN-LAST:event_jButton1SaveActionPerformed

    private void jButton2LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LoadActionPerformed
        JFileChooser choose = new JFileChooser();
        choose.setVisible(true);

    }//GEN-LAST:event_jButton2LoadActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JanelaCriaArvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCriaArvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCriaArvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCriaArvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCriaArvore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Criar;
    private javax.swing.JButton jButton1Print;
    private javax.swing.JButton jButton1Save;
    private javax.swing.JButton jButton2Insere;
    private javax.swing.JButton jButton2Load;
    private javax.swing.JButton jButton3Remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaPrint;
    private javax.swing.JTextField jTextField1Ordem;
    private javax.swing.JTextField jTextField2QtdInicial;
    private javax.swing.JTextField jTextField3ValMax;
    private javax.swing.JTextField jTextField4Chave;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
