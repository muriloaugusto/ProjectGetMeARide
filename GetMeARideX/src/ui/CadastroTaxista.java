package ui;

import dao.ConnectBD;
import entity.Taxista;
import dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/*

 * Data: 09 de Setembro de 2015
 * Projeto: Get me a ride
 * Disciplina: Engenharia de Software
 * Sprint 1
 * Classe: Cadastro Taxista
 * 
 Integrantes do Grupo:
 * 
 * Murilo Augusto
 * Ricardo Corassa
 * Weslley Martins
 * Edmar

 */
public class CadastroTaxista extends javax.swing.JFrame {
    public String consulta;

    /**
     * Creates new form CadastroTaxista
     */
    public CadastroTaxista() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        nomeTexto = new javax.swing.JLabel();
        enderecoTexto = new javax.swing.JLabel();
        telefoneTexto = new javax.swing.JLabel();
        emailTexto = new javax.swing.JLabel();
        placaTexto = new javax.swing.JLabel();
        Criar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        nomeCampo = new javax.swing.JTextField();
        enderecoCampo = new javax.swing.JTextField();
        telefoneCampo = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter fone= new javax.swing.text.MaskFormatter("(##)#####-####"); 
            telefoneCampo = new javax.swing.JFormattedTextField(fone); 
        } 
        catch (Exception e){ 
        }
        emailCampo = new javax.swing.JTextField();
        placaCampo = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter placa= new javax.swing.text.MaskFormatter("UUU-####"); 
            placaCampo = new javax.swing.JFormattedTextField(placa); 
        } 
        catch (Exception e){ 
        }
        senhaTexto = new javax.swing.JLabel();
        confirmarSenhaTexto = new javax.swing.JLabel();
        observacao = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JPasswordField();
        confirmarSenhaCampo = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        cadastroTaxistaTexto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeTexto.setText("Nome:");

        enderecoTexto.setText("Endereço:");

        telefoneTexto.setText("Telefone:");

        emailTexto.setText("E-mail:");

        placaTexto.setText("Placa:");

        Criar.setText("Criar");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        telefoneCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneCampoActionPerformed(evt);
            }
        });

        senhaTexto.setText("Senha:");

        confirmarSenhaTexto.setText("Confirmar Senha:");

        observacao.setText("Obs: A placa do carro será usada como usuário");

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        cadastroTaxistaTexto.setBackground(new java.awt.Color(0, 102, 102));
        cadastroTaxistaTexto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cadastroTaxistaTexto.setText("Cadastro Taxista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(cadastroTaxistaTexto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(cadastroTaxistaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Programadores: Murilo Augusto, Ricardo Corassa, Weslley Martins e Edmar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneTexto)
                            .addComponent(emailTexto)
                            .addComponent(placaTexto)
                            .addComponent(enderecoTexto)
                            .addComponent(nomeTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(observacao)
                            .addComponent(telefoneCampo)
                            .addComponent(emailCampo)
                            .addComponent(placaCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(enderecoCampo)
                            .addComponent(nomeCampo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Criar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaTexto)
                            .addComponent(confirmarSenhaTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmarSenhaCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(senhaCampo))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTexto)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoTexto)
                    .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneTexto)
                    .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTexto)
                    .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaTexto)
                    .addComponent(placaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(observacao)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTexto)
                    .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarSenhaTexto)
                    .addComponent(confirmarSenhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Limpar)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
            
            TaxistaDAO taxi = new TaxistaDAO();
            Taxista taxista = new Taxista();
            taxista.setNome(nomeCampo.getText());
            taxista.setEndereco(enderecoCampo.getText());
            taxista.setTelefone(telefoneCampo.getText());
            taxista.setEmail(emailCampo.getText());
            taxista.setPlaca(placaCampo.getText());
            taxista.setSenha(senhaCampo.getText());
            taxista.setConfirmarSenha(confirmarSenhaCampo.getText());
            taxi.salvaBD(taxista);
    }//GEN-LAST:event_CriarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        nomeCampo.setText(null);
        enderecoCampo.setText(null);
        emailCampo.setText(null);
        telefoneCampo.setText(null);
        placaCampo.setText(null);
        senhaCampo.setText(null);
        confirmarSenhaCampo.setText(null);
    }//GEN-LAST:event_LimparActionPerformed

    private void telefoneCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneCampoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       ConsultaTaxistas x = new ConsultaTaxistas();
        x.setVisible(true);
       
    }//GEN-LAST:event_BuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastroTaxista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Criar;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel cadastroTaxistaTexto;
    private javax.swing.JPasswordField confirmarSenhaCampo;
    private javax.swing.JLabel confirmarSenhaTexto;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JLabel emailTexto;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JLabel enderecoTexto;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeTexto;
    private javax.swing.JLabel observacao;
    private javax.swing.JTextField placaCampo;
    private javax.swing.JLabel placaTexto;
    private javax.swing.JPasswordField senhaCampo;
    private javax.swing.JLabel senhaTexto;
    private javax.swing.JTextField telefoneCampo;
    private javax.swing.JLabel telefoneTexto;
    // End of variables declaration//GEN-END:variables
}
