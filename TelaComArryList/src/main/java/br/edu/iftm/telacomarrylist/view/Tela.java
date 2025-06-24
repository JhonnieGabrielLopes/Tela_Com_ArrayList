package br.edu.iftm.telacomarrylist.view;

import br.edu.iftm.telacomarrylist.model.Compromisso;
import br.edu.iftm.telacomarrylist.model.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;


public class Tela extends javax.swing.JFrame {
    private CardLayout cardLayout;
    private ArrayList<Compromisso> compromissos;
    private ArrayList<Usuario> usuarios;
    
    public Tela(ArrayList<Compromisso> compromissos, ArrayList<Usuario> usuarios) {
        initComponents();
        this.compromissos = compromissos;
        this.usuarios = usuarios;
        cardLayout = (CardLayout) getContentPane().getLayout();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        panelInternoLogin = new javax.swing.JPanel();
        tituloLogin = new javax.swing.JLabel();
        tituloUsuario = new javax.swing.JLabel();
        entradaUsuario = new javax.swing.JTextField();
        tituloSenha = new javax.swing.JLabel();
        pfSenhaLogin = new javax.swing.JPasswordField();
        btEntrarLogin = new javax.swing.JButton();
        btRegistrarLogin = new javax.swing.JButton();
        panelRegistrar = new javax.swing.JPanel();
        panelInternoRegistre = new javax.swing.JPanel();
        tituloResgitre = new javax.swing.JLabel();
        tituloUsuarioRegistre = new javax.swing.JLabel();
        entradaUsuarioRegistre = new javax.swing.JTextField();
        tituloSenhaRegistre = new javax.swing.JLabel();
        pfEntradaSenhaRegistre = new javax.swing.JPasswordField();
        btRegistrarRegistre = new javax.swing.JButton();
        btCancelarRegistre = new javax.swing.JButton();
        pfSenhaConfRegistre = new javax.swing.JPasswordField();
        tituloSenhaConfRegistre = new javax.swing.JLabel();
        panelTela = new javax.swing.JPanel();
        panelInternoTela = new javax.swing.JPanel();
        tituloAcao = new javax.swing.JLabel();
        tituloDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(20, 20, 20));

        panelInternoLogin.setBackground(new java.awt.Color(31, 31, 31));

        tituloLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        tituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLogin.setText("Login");

        tituloUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tituloUsuario.setText("Usuário");

        entradaUsuario.setBackground(new java.awt.Color(41, 41, 41));
        entradaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        entradaUsuario.setCaretColor(new java.awt.Color(255, 255, 255));

        tituloSenha.setForeground(new java.awt.Color(255, 255, 255));
        tituloSenha.setText("Senha");

        pfSenhaLogin.setBackground(new java.awt.Color(41, 41, 41));
        pfSenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        pfSenhaLogin.setCaretColor(new java.awt.Color(255, 255, 255));

        btEntrarLogin.setBackground(new java.awt.Color(87, 87, 87));
        btEntrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        btEntrarLogin.setText("Entrar");
        btEntrarLogin.setBorderPainted(false);
        btEntrarLogin.setFocusPainted(false);
        btEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarLoginActionPerformed(evt);
            }
        });

        btRegistrarLogin.setBackground(new java.awt.Color(87, 87, 87));
        btRegistrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarLogin.setText("Registrar-se");
        btRegistrarLogin.setBorderPainted(false);
        btRegistrarLogin.setFocusPainted(false);
        btRegistrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInternoLoginLayout = new javax.swing.GroupLayout(panelInternoLogin);
        panelInternoLogin.setLayout(panelInternoLoginLayout);
        panelInternoLoginLayout.setHorizontalGroup(
            panelInternoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoLoginLayout.createSequentialGroup()
                .addGroup(panelInternoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInternoLoginLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(tituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(104, 104, 104))
                    .addGroup(panelInternoLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelInternoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInternoLoginLayout.createSequentialGroup()
                                .addComponent(tituloUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(228, 228, 228))
                            .addComponent(entradaUsuario)
                            .addGroup(panelInternoLoginLayout.createSequentialGroup()
                                .addComponent(tituloSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(231, 231, 231))
                            .addComponent(pfSenhaLogin)
                            .addComponent(btEntrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRegistrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(56, 56, 56))
        );
        panelInternoLoginLayout.setVerticalGroup(
            panelInternoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaUsuario)
                .addGap(18, 18, 18)
                .addComponent(tituloSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenhaLogin)
                .addGap(18, 18, 18)
                .addComponent(btEntrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRegistrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(panelInternoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(210, 210, 210))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelInternoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(panelLogin, "cardLogin");

        panelRegistrar.setBackground(new java.awt.Color(20, 20, 20));

        panelInternoRegistre.setBackground(new java.awt.Color(31, 31, 31));

        tituloResgitre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloResgitre.setForeground(new java.awt.Color(255, 255, 255));
        tituloResgitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloResgitre.setText("Registre-se");

        tituloUsuarioRegistre.setForeground(new java.awt.Color(255, 255, 255));
        tituloUsuarioRegistre.setText("Usuário");

        entradaUsuarioRegistre.setBackground(new java.awt.Color(41, 41, 41));
        entradaUsuarioRegistre.setForeground(new java.awt.Color(255, 255, 255));
        entradaUsuarioRegistre.setCaretColor(new java.awt.Color(255, 255, 255));

        tituloSenhaRegistre.setForeground(new java.awt.Color(255, 255, 255));
        tituloSenhaRegistre.setText("Senha");

        pfEntradaSenhaRegistre.setBackground(new java.awt.Color(41, 41, 41));
        pfEntradaSenhaRegistre.setForeground(new java.awt.Color(255, 255, 255));
        pfEntradaSenhaRegistre.setCaretColor(new java.awt.Color(255, 255, 255));

        btRegistrarRegistre.setBackground(new java.awt.Color(87, 87, 87));
        btRegistrarRegistre.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarRegistre.setText("Registrar-se");
        btRegistrarRegistre.setBorderPainted(false);
        btRegistrarRegistre.setFocusPainted(false);
        btRegistrarRegistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarRegistreActionPerformed(evt);
            }
        });

        btCancelarRegistre.setBackground(new java.awt.Color(87, 87, 87));
        btCancelarRegistre.setForeground(new java.awt.Color(255, 255, 255));
        btCancelarRegistre.setText("Cancelar");
        btCancelarRegistre.setBorderPainted(false);
        btCancelarRegistre.setFocusPainted(false);
        btCancelarRegistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRegistreActionPerformed(evt);
            }
        });

        pfSenhaConfRegistre.setBackground(new java.awt.Color(41, 41, 41));
        pfSenhaConfRegistre.setForeground(new java.awt.Color(255, 255, 255));
        pfSenhaConfRegistre.setCaretColor(new java.awt.Color(255, 255, 255));
        pfSenhaConfRegistre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfSenhaConfRegistreKeyReleased(evt);
            }
        });

        tituloSenhaConfRegistre.setForeground(new java.awt.Color(255, 255, 255));
        tituloSenhaConfRegistre.setText("Confirme sua senha");

        javax.swing.GroupLayout panelInternoRegistreLayout = new javax.swing.GroupLayout(panelInternoRegistre);
        panelInternoRegistre.setLayout(panelInternoRegistreLayout);
        panelInternoRegistreLayout.setHorizontalGroup(
            panelInternoRegistreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInternoRegistreLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(tituloResgitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(142, 142, 142))
            .addGroup(panelInternoRegistreLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelInternoRegistreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInternoRegistreLayout.createSequentialGroup()
                        .addComponent(tituloSenhaConfRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addGroup(panelInternoRegistreLayout.createSequentialGroup()
                        .addComponent(tituloUsuarioRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(228, 228, 228))
                    .addComponent(entradaUsuarioRegistre)
                    .addGroup(panelInternoRegistreLayout.createSequentialGroup()
                        .addComponent(tituloSenhaRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(231, 231, 231))
                    .addComponent(pfEntradaSenhaRegistre)
                    .addComponent(btRegistrarRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelarRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfSenhaConfRegistre))
                .addGap(56, 56, 56))
        );
        panelInternoRegistreLayout.setVerticalGroup(
            panelInternoRegistreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoRegistreLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloResgitre, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloUsuarioRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaUsuarioRegistre)
                .addGap(18, 18, 18)
                .addComponent(tituloSenhaRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfEntradaSenhaRegistre)
                .addGap(18, 18, 18)
                .addComponent(tituloSenhaConfRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenhaConfRegistre)
                .addGap(18, 18, 18)
                .addComponent(btRegistrarRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout panelRegistrarLayout = new javax.swing.GroupLayout(panelRegistrar);
        panelRegistrar.setLayout(panelRegistrarLayout);
        panelRegistrarLayout.setHorizontalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(panelInternoRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(210, 210, 210))
        );
        panelRegistrarLayout.setVerticalGroup(
            panelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panelInternoRegistre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(panelRegistrar, "cardRegistrar");

        panelTela.setBackground(new java.awt.Color(20, 20, 20));

        panelInternoTela.setBackground(new java.awt.Color(31, 31, 31));

        tituloAcao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloAcao.setForeground(new java.awt.Color(255, 255, 255));
        tituloAcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAcao.setText("Cadastrar Compromisso");

        tituloDescricao.setForeground(new java.awt.Color(255, 255, 255));
        tituloDescricao.setText("Descrição do Compromisso:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Data do Compromisso");

        jLabel3.setText("Horário");

        jLabel2.setText("Início");

        jLabel4.setText("Término");

        jLabel5.setText("Nome do Compromisso");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");

        jButton2.setText("Listar");

        jButton3.setText("Alterar");

        jButton4.setText("Remover");

        jButton5.setText("<");

        jButton6.setText(">");

        jLabel6.setText("Horário");

        javax.swing.GroupLayout panelInternoTelaLayout = new javax.swing.GroupLayout(panelInternoTela);
        panelInternoTela.setLayout(panelInternoTelaLayout);
        panelInternoTelaLayout.setHorizontalGroup(
            panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInternoTelaLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInternoTelaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(tituloDescricao)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1)
                        .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInternoTelaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
        );
        panelInternoTelaLayout.setVerticalGroup(
            panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(tituloDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
        panelTela.setLayout(panelTelaLayout);
        panelTelaLayout.setHorizontalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(panelInternoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelTelaLayout.setVerticalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(panelInternoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(panelTela, "cardTela");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarLoginActionPerformed
        cardLayout.show(getContentPane(), "cardRegistrar");
    }//GEN-LAST:event_btRegistrarLoginActionPerformed

    private void btEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarLoginActionPerformed
        String nomeUsuario = entradaUsuario.getText();
        char[] senha = pfSenhaLogin.getPassword();
        if(!nomeUsuario.isEmpty() || senha.length == 0){
            for(Usuario user : usuarios){
                boolean validaSenha = Arrays.equals(senha, user.getSenha());
                boolean validaUsuario = nomeUsuario.equals(user.getNomeUsuario());
                if(validaSenha && validaUsuario){
                    cardLayout.show(getContentPane(), "cardTela");
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Usuario ou senha incorreto!", "Login Não Sucedido", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btEntrarLoginActionPerformed

    private void btRegistrarRegistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarRegistreActionPerformed
        String nomeUsuario = entradaUsuarioRegistre.getText();
        char[] senha = pfEntradaSenhaRegistre.getPassword();
        char[] confirmaSenha = pfSenhaConfRegistre.getPassword();
        boolean validaSenha = Arrays.equals(senha, confirmaSenha);
        if(validaSenha){
            usuarios.add(new Usuario(nomeUsuario, senha));
            JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!", "Cadastro Sucedido", JOptionPane.INFORMATION_MESSAGE);
            cardLayout.show(getContentPane(), "cardLogin");
            limparCampoRegitre();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuário não cadastrado!", "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            limparCampoRegitre();
        }
    }//GEN-LAST:event_btRegistrarRegistreActionPerformed

    private void pfSenhaConfRegistreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaConfRegistreKeyReleased
        char[] senha = pfEntradaSenhaRegistre.getPassword();
        char[] confirmaSenha = pfSenhaConfRegistre.getPassword();
        if(Arrays.equals(senha, confirmaSenha)){
            pfSenhaConfRegistre.setBorder(new LineBorder(Color.blue, 2));
        }else{
            pfSenhaConfRegistre.setBorder(new LineBorder(Color.red, 2));
        }
    }//GEN-LAST:event_pfSenhaConfRegistreKeyReleased

    private void btCancelarRegistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRegistreActionPerformed
        cardLayout.show(getContentPane(), "cardLogin");
    }//GEN-LAST:event_btCancelarRegistreActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public void limparCampoRegitre(){
        entradaUsuarioRegistre.setText("");
        pfEntradaSenhaRegistre.setText("");
        pfSenhaConfRegistre.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarRegistre;
    private javax.swing.JButton btEntrarLogin;
    private javax.swing.JButton btRegistrarLogin;
    private javax.swing.JButton btRegistrarRegistre;
    private javax.swing.JTextField entradaUsuario;
    private javax.swing.JTextField entradaUsuarioRegistre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelInternoLogin;
    private javax.swing.JPanel panelInternoRegistre;
    private javax.swing.JPanel panelInternoTela;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelTela;
    private javax.swing.JPasswordField pfEntradaSenhaRegistre;
    private javax.swing.JPasswordField pfSenhaConfRegistre;
    private javax.swing.JPasswordField pfSenhaLogin;
    private javax.swing.JLabel tituloAcao;
    private javax.swing.JLabel tituloDescricao;
    private javax.swing.JLabel tituloLogin;
    private javax.swing.JLabel tituloResgitre;
    private javax.swing.JLabel tituloSenha;
    private javax.swing.JLabel tituloSenhaConfRegistre;
    private javax.swing.JLabel tituloSenhaRegistre;
    private javax.swing.JLabel tituloUsuario;
    private javax.swing.JLabel tituloUsuarioRegistre;
    // End of variables declaration//GEN-END:variables
}
