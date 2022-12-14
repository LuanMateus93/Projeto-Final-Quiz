/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.MetodosDAO;
import DTO.Pergunta;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Diamond
 */
public class CriarQuestao extends javax.swing.JFrame {

    /**
     * Creates new form CriarQuestao
     */
    public CriarQuestao() {
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

        titulo = new javax.swing.JLabel();
        pergunta = new javax.swing.JLabel();
        perguntaField = new javax.swing.JTextField();
        opcaoA = new javax.swing.JLabel();
        opcaoB = new javax.swing.JLabel();
        opcaoc = new javax.swing.JLabel();
        opcaoD = new javax.swing.JLabel();
        opcaoAField = new javax.swing.JTextField();
        opcaoBField = new javax.swing.JTextField();
        opcaoCField = new javax.swing.JTextField();
        opcaoDField = new javax.swing.JTextField();
        opcaoCerta = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        dificuldade = new javax.swing.JLabel();
        criarQuestao = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        fieldOpcaoCerta = new javax.swing.JTextField();
        fieldTema = new javax.swing.JTextField();
        fieldDificuldade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Quest?o");
        setResizable(false);

        titulo.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        titulo.setText("     Criar Quest?o");

        pergunta.setText("Pergunta:");

        opcaoA.setText("Op??o A:");

        opcaoB.setText("Op??o B:");

        opcaoc.setText("Op??o C:");

        opcaoD.setText("Op??o D:");

        opcaoCerta.setText("Op??o Certa:");

        tema.setText("Tema:");

        dificuldade.setText("Dificuldade:");

        criarQuestao.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        criarQuestao.setText("Criar Quest?o");
        criarQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarQuestaoActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jButton1.setText("Editar Quest?o");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(pergunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(perguntaField))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(dificuldade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldDificuldade))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(opcaoCerta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldOpcaoCerta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(tema)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(opcaoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(opcaoAField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(opcaoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcaoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcaoD))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(opcaoBField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opcaoCField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opcaoDField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(criarQuestao)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pergunta)
                    .addComponent(perguntaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoA, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(opcaoAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcaoB)
                    .addComponent(opcaoBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcaoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcaoD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcaoCerta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(fieldOpcaoCerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tema)
                    .addComponent(fieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldade)
                    .addComponent(fieldDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criarQuestao)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(voltar)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarQuestaoActionPerformed

        try {
            String questao, a, b, c, d, opcaoCerta, tema, dificuldade;
            int codtema, coddificuldade;
            ResultSet dstema, dsdificuldade;

            questao = perguntaField.getText();
            a = opcaoAField.getText();
            b = opcaoBField.getText();
            c = opcaoCField.getText();
            d = opcaoDField.getText();
            opcaoCerta = fieldOpcaoCerta.getText();
            tema = fieldTema.getText();
            dificuldade = fieldDificuldade.getText();

            if (perguntaField.getText().equals("") && opcaoAField.getText().equals("") && opcaoBField.getText().equals("") && opcaoCField.getText().equals("") && opcaoDField.getText().equals("") && fieldOpcaoCerta.getText().equals("") && fieldTema.getText().equals("") && fieldDificuldade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Os campos est?o vazios, por favor preencha todos os campo!", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                
                MetodosDAO metodosDAO = new MetodosDAO();
                dstema = metodosDAO.buscaTema(tema);
                
                if (dstema.next()) {
                    codtema = dstema.getInt("id");
                } else {
                    metodosDAO.inserirTema(tema);
                    dstema = metodosDAO.buscaTema(tema);
                    dstema.next();
                    codtema = dstema.getInt("id");
                }
                
                dsdificuldade = metodosDAO.buscaDificuldade(dificuldade);
                
                if (dsdificuldade.next()) {
                    coddificuldade = dsdificuldade.getInt("id");
                } else {
                    metodosDAO.inserirDificuldade(dificuldade);
                    dsdificuldade = metodosDAO.buscaDificuldade(dificuldade);
                    dsdificuldade.next();
                    coddificuldade = dsdificuldade.getInt("id");
                }
                
                boolean criou = metodosDAO.criarPergunta(questao, a, b, c, d, opcaoCerta, codtema, coddificuldade);
                
                if (criou) {
                    JOptionPane.showMessageDialog(null, "Pergunta criada com sucesso");

                    perguntaField.setText("");
                    opcaoAField.setText("");
                    opcaoBField.setText("");
                    opcaoCField.setText("");
                    opcaoDField.setText("");
                    fieldOpcaoCerta.setText("");
                    fieldTema.setText("");
                    fieldDificuldade.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao criar pergunta");
                }
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroPergunta: " + erro);
        }
    }//GEN-LAST:event_criarQuestaoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaDoUsuarioADM objtelaadm = new TelaDoUsuarioADM();
        objtelaadm.setVisible(true);

        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmEditarQuestao objtelaeditar = new frmEditarQuestao();
        objtelaeditar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CriarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarQuestao;
    private javax.swing.JLabel dificuldade;
    private javax.swing.JTextField fieldDificuldade;
    private javax.swing.JTextField fieldOpcaoCerta;
    private javax.swing.JTextField fieldTema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel opcaoA;
    private javax.swing.JTextField opcaoAField;
    private javax.swing.JLabel opcaoB;
    private javax.swing.JTextField opcaoBField;
    private javax.swing.JTextField opcaoCField;
    private javax.swing.JLabel opcaoCerta;
    private javax.swing.JLabel opcaoD;
    private javax.swing.JTextField opcaoDField;
    private javax.swing.JLabel opcaoc;
    private javax.swing.JLabel pergunta;
    private javax.swing.JTextField perguntaField;
    private javax.swing.JLabel tema;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
