/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alisson Jaques
 */
public class TelaLogin extends javax.swing.JDialog {
    
    private TelaPrincipal tp;
    private String usuarioFix = "admin";
    private String senhaFix = "admin";
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tp = (TelaPrincipal) parent;
    }
    
    /**
     * @return the btnCancelar
     */
    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * @param btnCancelar the btnCancelar to set
     */
    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    /**
     * @return the btnConfirmar
     */
    public javax.swing.JButton getBtnConfirmar() {
        return btnConfirmar;
    }

    /**
     * @param btnConfirmar the btnConfirmar to set
     */
    public void setBtnConfirmar(javax.swing.JButton btnConfirmar) {
        this.btnConfirmar = btnConfirmar;
    }

    /**
     * @return the lSenha
     */
    public javax.swing.JLabel getlSenha() {
        return lSenha;
    }

    /**
     * @param lSenha the lSenha to set
     */
    public void setlSenha(javax.swing.JLabel lSenha) {
        this.lSenha = lSenha;
    }

    /**
     * @return the lTitulo
     */
    public javax.swing.JLabel getlTitulo() {
        return lTitulo;
    }

    /**
     * @param lTitulo the lTitulo to set
     */
    public void setlTitulo(javax.swing.JLabel lTitulo) {
        this.lTitulo = lTitulo;
    }

    /**
     * @return the lUsuario
     */
    public javax.swing.JLabel getlUsuario() {
        return lUsuario;
    }

    /**
     * @param lUsuario the lUsuario to set
     */
    public void setlUsuario(javax.swing.JLabel lUsuario) {
        this.lUsuario = lUsuario;
    }

    /**
     * @return the pLogin
     */
    public javax.swing.JPanel getpLogin() {
        return pLogin;
    }

    /**
     * @param pLogin the pLogin to set
     */
    public void setpLogin(javax.swing.JPanel pLogin) {
        this.pLogin = pLogin;
    }

    /**
     * @return the pfSenha
     */
    public javax.swing.JPasswordField getPfSenha() {
        return pfSenha;
    }

    /**
     * @param pfSenha the pfSenha to set
     */
    public void setPfSenha(javax.swing.JPasswordField pfSenha) {
        this.pfSenha = pfSenha;
    }

    
    /**
     * @param tfUsuario the tfUsuario to set
     */
    public void setTfUsuario(javax.swing.JTextPane tfUsuario) {
        this.setTfUsuario(tfUsuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogin = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lTitulo.setText("Tela de Login");

        lUsuario.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lUsuario.setText("Usuário:");

        lSenha.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lSenha.setText("Senha:");

        pfSenha.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfUsuario.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginLayout.createSequentialGroup()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTitulo))
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lUsuario)
                            .addComponent(lSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addGap(5, 5, 5))
                            .addComponent(tfUsuario)
                            .addComponent(pfSenha))))
                .addGap(103, 103, 103))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String usuario = getTfUsuario().getText();
        String senha = String.valueOf(getPfSenha().getPassword());
        if(usuario.equals(getUsuarioFix()) && senha.equals(getSenhaFix())){
            getTp().getmCadastro().setEnabled(true);
            getTp().getMiSair().setEnabled(true);
            getTp().getMiLogin().setEnabled(false);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro ao Logar no sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tp
     */
    public TelaPrincipal getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(TelaPrincipal tp) {
        this.tp = tp;
    }

    /**
     * @return the usuarioFix
     */
    public String getUsuarioFix() {
        return usuarioFix;
    }

    /**
     * @param usuarioFix the usuarioFix to set
     */
    public void setUsuarioFix(String usuarioFix) {
        this.usuarioFix = usuarioFix;
    }

    /**
     * @return the senhaFix
     */
    public String getSenhaFix() {
        return senhaFix;
    }

    /**
     * @param senhaFix the senhaFix to set
     */
    public void setSenhaFix(String senhaFix) {
        this.senhaFix = senhaFix;
    }

    /**
     * @param tfUsuario the tfUsuario to set
     */
    public void setTfUsuario(javax.swing.JTextField tfUsuario) {
        this.tfUsuario = tfUsuario;
    }

    /**
     * @return the tfUsuario
     */
    public javax.swing.JTextField getTfUsuario() {
        return tfUsuario;
    }
}
