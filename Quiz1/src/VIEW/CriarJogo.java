/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.MetodosDAO;
import java.util.Vector;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author luanc
 */
public class CriarJogo extends javax.swing.JFrame {

    /**
     * Creates new form CriarJogo
     */
    public CriarJogo() {
        initComponents();
        restaurarDadosComboBoxDificuldade();
        restaurarDadosComboBoxTema();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        dificuldade = new javax.swing.JLabel();
        cbxDificuldade = new javax.swing.JComboBox<>();
        tema = new javax.swing.JLabel();
        questao = new javax.swing.JLabel();
        criarJogo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cbxTema = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cria��o de Jogos");
        setResizable(false);

        titulo.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        titulo.setText("P�gina de Cria��o de Jogos");

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });

        nome.setText("Nome jogo:");

        dificuldade.setText("Dificuldade:");

        cbxDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDificuldadeActionPerformed(evt);
            }
        });

        tema.setText("Tema:");

        questao.setText("Quest�es:");

        criarJogo.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        criarJogo.setText("Salvar e Jogar ");
        criarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarJogoActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Footlight MT Light", 0, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cbxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTemaActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                            .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxTema, javax.swing.GroupLayout.Alignment.LEADING, 0, 102, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(criarJogo)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(criarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(voltar)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaDoUsuarioADM objtelaadm = new TelaDoUsuarioADM();
        objtelaadm.setVisible(true);        
                
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void cbxDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDificuldadeActionPerformed
        
    }//GEN-LAST:event_cbxDificuldadeActionPerformed

    private void cbxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTemaActionPerformed

    private void criarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarJogoActionPerformed
        
        try {
            if (nomeField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha os campos vazios!", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                String nome, dificuldade = null, tema = null, quantidade_de_questoes;
                ResultSet setQuestao;
                
                nome = nomeField.getText();
                quantidade_de_questoes = jTextField1.getText();
                
                MetodosDAO metodosDAO = new MetodosDAO();
                setQuestao = metodosDAO.selectQuestoes(dificuldade, tema);
                
                if (setQuestao.next()) {
                    if (setQuestao <= quantidade_de_questoes) {
                        
                        
                        JOptionPane.showMessageDialog(null, "Jogo criado");
                        frmJogo objtelajogo = new frmJogo();
                        objtelajogo.setVisible(true);

                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "O n�mero de quest�es ultrapassa o n�mero permitido. Por favor insira uma valor v�lido!!!");
                    }
                } 
            } 
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroPergunta: " + erro);   
        }
    }//GEN-LAST:event_criarJogoActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxDificuldade;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JButton criarJogo;
    private javax.swing.JLabel dificuldade;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel questao;
    private javax.swing.JLabel tema;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
    
    Vector<Integer> id_dificuldade = new Vector<Integer>();
    Vector<Integer> id_tema = new Vector<Integer>();
    
    public void restaurarDadosComboBoxDificuldade(){
        
        try {
            
            MetodosDAO objcriarjogo = new MetodosDAO();
            ResultSet rs = objcriarjogo.listarDificuldade();
            
            while (rs.next()) {
                id_dificuldade.addElement(rs.getInt(1));
                cbxDificuldade.addItem(rs.getString(2));
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Carregar Dificuldade View" + erro);
        } 
    }
    
    public void restaurarDadosComboBoxTema(){
        
        try {
            
            MetodosDAO objcriarjogo = new MetodosDAO();
            ResultSet rs = objcriarjogo.listarTema();
            
            while (rs.next()) {
                id_tema.addElement(rs.getInt(1));
                cbxTema.addItem(rs.getString(2));
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Carregar Tema View" + erro);
        } 
    }
}