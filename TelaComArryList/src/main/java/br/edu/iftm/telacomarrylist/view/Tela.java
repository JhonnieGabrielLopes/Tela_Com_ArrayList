package br.edu.iftm.telacomarrylist.view;

import br.edu.iftm.telacomarrylist.controller.AgendaController;
import br.edu.iftm.telacomarrylist.model.Agenda;
import br.edu.iftm.telacomarrylist.model.Compromisso;
import br.edu.iftm.telacomarrylist.model.Usuario;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class Tela extends javax.swing.JFrame {
    private CardLayout cardLayout;
    private Agenda agenda;
    private AgendaController agendaController;
    private List<Compromisso> compromissos;
    private int indiceCompromisso = 0;
    
    public Tela(Agenda agenda) {
        this.agenda = agenda;
        agendaController = new AgendaController(agenda);
        compromissos = agenda.getCompromissos();
        initComponents();
        cardLayout = (CardLayout) getContentPane().getLayout();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
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
        entradaDescCompromisso = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        entradaDataFim = new javax.swing.JFormattedTextField();
        entradaDataInicio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        entradaHoraInicio = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entradaNomeCompromisso = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        entradaHoraFim = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

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
        entradaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entradaUsuarioKeyReleased(evt);
            }
        });

        tituloSenha.setForeground(new java.awt.Color(255, 255, 255));
        tituloSenha.setText("Senha");

        pfSenhaLogin.setBackground(new java.awt.Color(41, 41, 41));
        pfSenhaLogin.setForeground(new java.awt.Color(255, 255, 255));
        pfSenhaLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        pfSenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfSenhaLoginKeyReleased(evt);
            }
        });

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
                                .addComponent(tituloUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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

        entradaDescCompromisso.setBackground(new java.awt.Color(90, 90, 90));
        entradaDescCompromisso.setColumns(20);
        entradaDescCompromisso.setForeground(new java.awt.Color(255, 255, 255));
        entradaDescCompromisso.setRows(5);
        jScrollPane1.setViewportView(entradaDescCompromisso);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data do Compromisso");

        entradaDataFim.setBackground(new java.awt.Color(90, 90, 90));
        entradaDataFim.setForeground(new java.awt.Color(255, 255, 255));
        try {
            entradaDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        entradaDataInicio.setBackground(new java.awt.Color(90, 90, 90));
        entradaDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        try {
            entradaDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        entradaDataInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaDataInicioFocusLost(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horário");

        entradaHoraInicio.setBackground(new java.awt.Color(90, 90, 90));
        entradaHoraInicio.setForeground(new java.awt.Color(255, 255, 255));
        try {
            entradaHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Início");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Término");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome do Compromisso");

        entradaNomeCompromisso.setBackground(new java.awt.Color(90, 90, 90));
        entradaNomeCompromisso.setForeground(new java.awt.Color(255, 255, 255));

        btCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorderPainted(false);
        btCadastrar.setFocusPainted(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btListar.setBackground(new java.awt.Color(102, 102, 102));
        btListar.setForeground(new java.awt.Color(255, 255, 255));
        btListar.setText("Listar");
        btListar.setBorderPainted(false);
        btListar.setFocusPainted(false);
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(102, 102, 102));
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("Alterar");
        btAlterar.setBorderPainted(false);
        btAlterar.setFocusPainted(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(102, 102, 102));
        btRemover.setForeground(new java.awt.Color(255, 255, 255));
        btRemover.setText("Remover");
        btRemover.setBorderPainted(false);
        btRemover.setFocusPainted(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btAnterior.setBackground(new java.awt.Color(102, 102, 102));
        btAnterior.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow.png"))); // NOI18N
        btAnterior.setBorderPainted(false);
        btAnterior.setFocusPainted(false);
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setBackground(new java.awt.Color(102, 102, 102));
        btProximo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btProximo.setForeground(new java.awt.Color(255, 255, 255));
        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right-arrow.png"))); // NOI18N
        btProximo.setBorderPainted(false);
        btProximo.setFocusPainted(false);
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horário");

        entradaHoraFim.setBackground(new java.awt.Color(90, 90, 90));
        entradaHoraFim.setForeground(new java.awt.Color(255, 255, 255));
        try {
            entradaHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setBackground(new java.awt.Color(102, 102, 102));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.setBorderPainted(false);
        btSalvar.setFocusPainted(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("Limpar");
        btLimpar.setBorderPainted(false);
        btLimpar.setFocusPainted(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInternoTelaLayout = new javax.swing.GroupLayout(panelInternoTela);
        panelInternoTela.setLayout(panelInternoTelaLayout);
        panelInternoTelaLayout.setHorizontalGroup(
            panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInternoTelaLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(tituloDescricao)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(entradaNomeCompromisso)
                        .addGroup(panelInternoTelaLayout.createSequentialGroup()
                            .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(entradaDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(entradaDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelInternoTelaLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entradaHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelInternoTelaLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entradaHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelInternoTelaLayout.createSequentialGroup()
                        .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInternoTelaLayout.createSequentialGroup()
                                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar)))))
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
                .addComponent(entradaNomeCompromisso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(tituloDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btListar)
                    .addComponent(btAlterar)
                    .addComponent(btRemover)
                    .addComponent(btSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInternoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
        panelTela.setLayout(panelTelaLayout);
        panelTelaLayout.setHorizontalGroup(
            panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(panelInternoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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
//agenda.getUsuario().getNomeUsuario() != null &&
    private void btEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarLoginActionPerformed
        String nomeUsuario = entradaUsuario.getText();
        char[] senha = pfSenhaLogin.getPassword();
        if(!nomeUsuario.isEmpty() || senha.length != 0){
            if(agenda.getUsuario() != null){
                boolean validaSenha = Arrays.equals(senha, agenda.getUsuario().getSenha());
                boolean validaUsuario = nomeUsuario.equals(agenda.getUsuario().getNomeUsuario());
                if(validaSenha && validaUsuario){
                    cardLayout.show(getContentPane(), "cardTela");
                    botaoDefault();
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Usuario ou senha incorreto!", "Login Não Sucedido", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuario não cadastrado!", "Login Não Sucedido", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuario ou senha incorreto!", "Login Não Sucedido", JOptionPane.ERROR_MESSAGE);
            entradaUsuario.setBorder(new LineBorder(Color.red, 2));
            pfSenhaLogin.setBorder(new LineBorder(Color.red, 2));
        }
    }//GEN-LAST:event_btEntrarLoginActionPerformed

    private void btRegistrarRegistreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarRegistreActionPerformed
        String nomeUsuario = entradaUsuarioRegistre.getText();
        char[] senha = pfEntradaSenhaRegistre.getPassword();
        char[] confirmaSenha = pfSenhaConfRegistre.getPassword();
        boolean validaSenha = Arrays.equals(senha, confirmaSenha);
        if(validaSenha){
            agenda = new Agenda((new Usuario(nomeUsuario, senha)));
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        taLogado();
        boolean nomeValido = true;
        boolean dataInicioValido = true;
        boolean dataHorário = true;
        if(entradaNomeCompromisso.getText().isEmpty()){
            nomeValido = false;
            JOptionPane.showMessageDialog(rootPane, "Necessário nome para o compromisso", "Informe um nome", JOptionPane.INFORMATION_MESSAGE);
        }else
        if(entradaDataInicio.getText().replaceAll("[^\\d]", "").isEmpty()){
            dataInicioValido = false;
            JOptionPane.showMessageDialog(rootPane, "Necessário data de inicio para o compromisso", "Informe uma data inicial", JOptionPane.INFORMATION_MESSAGE);
        }else
        if(entradaHoraInicio.getText().replaceAll("[^\\d]", "").isEmpty()){
            dataHorário = false;
            JOptionPane.showMessageDialog(rootPane, "Necessário horario de inicio para o compromisso", "Informe um horario inicial", JOptionPane.INFORMATION_MESSAGE);
        }
        String descricao = entradaDescCompromisso.getText();
        if(descricao.isEmpty()){
            descricao = "";
        }
        boolean compromissoRegistrado = false;
        List<Object> campos;
        if(nomeValido && dataInicioValido && dataHorário){
            compromissoRegistrado = agendaController.cadastrarCompromisso(
                campos = Arrays.asList(
                entradaNomeCompromisso.getText(),
                descricao,
                entradaDataInicio.getText(),
                entradaHoraInicio.getText(),
                entradaDataFim.getText(),
                entradaHoraFim.getText()
                )
            );
        }
        if(compromissoRegistrado){
            JOptionPane.showMessageDialog(rootPane, "Compromisso adicionado na agenda", "Compromisso adicionado", JOptionPane.INFORMATION_MESSAGE);
            limparCamposTela();
            btListar.setEnabled(true);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void entradaDataInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaDataInicioFocusLost
        if(!entradaDataInicio.getText().replaceAll("[^\\d]", "").isEmpty()){
            entradaDataFim.setValue(entradaDataInicio.getText());
            entradaHoraFim.setValue("23:59");
        }
    }//GEN-LAST:event_entradaDataInicioFocusLost

    private void entradaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaUsuarioKeyReleased
        entradaUsuario.setBorder(UIManager.getBorder("TextField.border"));
    }//GEN-LAST:event_entradaUsuarioKeyReleased

    private void pfSenhaLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaLoginKeyReleased
        pfSenhaLogin.setBorder(UIManager.getBorder("TextField.border"));
    }//GEN-LAST:event_pfSenhaLoginKeyReleased

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        taLogado();
        emListaDesativaComponentes();
        habilitaBotoes();
        if(compromissos!=null && !compromissos.isEmpty()){
            indiceCompromisso = 0;
            preencheCompromissoListagem(compromissos.get(indiceCompromisso));
            controleBotaoLista();
        }
    }//GEN-LAST:event_btListarActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        emListaDesativaComponentes();
        if(compromissos!=null && indiceCompromisso > 0){
            indiceCompromisso--;
            preencheCompromissoListagem(compromissos.get(indiceCompromisso));
            controleBotaoLista();
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        emListaDesativaComponentes();
        if(compromissos!=null && indiceCompromisso < compromissos.size() -1){
            indiceCompromisso++;
            preencheCompromissoListagem(compromissos.get(indiceCompromisso));
            controleBotaoLista();
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        taLogado();
        btListar.setEnabled(false);
        ativaComponentes();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        List<Object> campos = Arrays.asList(
            entradaNomeCompromisso.getText(),
            entradaDescCompromisso.getText(),
            entradaDataInicio.getText(),
            entradaHoraInicio.getText(),
            entradaDataFim.getText(),
            entradaHoraFim.getText());
        agendaController.alterarCompromisso(indiceCompromisso, campos);
        btListar.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        taLogado();
        agendaController.deletarCompromisso(indiceCompromisso);
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        btCadastrar.setEnabled(true);
        limparCamposTela();
        botaoDefault();
        if(!agenda.getCompromissos().isEmpty()){
            btListar.setEnabled(true);
            btAnterior.setEnabled(true);
            btProximo.setEnabled(true);
        }
        ativaComponentes();
        btSalvar.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed
    
    public void controleBotaoLista(){
        btAnterior.setEnabled(indiceCompromisso > 0);
        btProximo.setEnabled(indiceCompromisso < compromissos.size() - 1);
    }
    public void preencheCompromissoListagem(Compromisso compromisso){
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm");
        entradaNomeCompromisso.setText(compromisso.getNome());
        entradaDescCompromisso.setText(compromisso.getDescricao());
        entradaDataInicio.setText(compromisso.getDataHoraInicio().toLocalDate().format(formatarData));
        entradaHoraInicio.setText(compromisso.getDataHoraInicio().toLocalTime().format(formatarHora));
        entradaDataFim.setText(compromisso.getDataHoraFim().toLocalDate().format(formatarData));
        entradaHoraFim.setText(compromisso.getDataHoraFim().toLocalTime().format(formatarHora));
    }
    
    public void limparCampoRegitre(){
        entradaUsuarioRegistre.setText("");
        pfEntradaSenhaRegistre.setText("");
        pfSenhaConfRegistre.setText("");
    }
    
    public void limparCamposTela(){
        entradaNomeCompromisso.setText("");
        entradaDescCompromisso.setText("");
        entradaDataInicio.setText("");
        entradaHoraInicio.setText("");
        entradaDataFim.setText("");
        entradaHoraFim.setText("");
    }
    
    public void botaoDefault(){
        btSalvar.setEnabled(false);
        btRemover.setEnabled(false);
        btAlterar.setEnabled(false);
        btListar.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
    }
    
    public void habilitaBotoes(){
        btRemover.setEnabled(true);
        btAlterar.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
    }
    
    public void emListaDesativaComponentes(){
        entradaNomeCompromisso.setEnabled(false);
        entradaDescCompromisso.setEnabled(false);
        entradaDataInicio.setEnabled(false);
        entradaHoraInicio.setEnabled(false);
        entradaDataFim.setEnabled(false);
        entradaHoraFim.setEnabled(false);
        btSalvar.setEnabled(false);
        btCadastrar.setEnabled(false);
    }
    
    public void ativaComponentes(){
        entradaNomeCompromisso.setEnabled(true);
        entradaDescCompromisso.setEnabled(true);
        entradaDataInicio.setEnabled(true);
        entradaHoraInicio.setEnabled(true);
        entradaDataFim.setEnabled(true);
        entradaHoraFim.setEnabled(true);
        btSalvar.setEnabled(true);
    }
    
    public void taLogado(){
        if(agenda.getUsuario().getNomeUsuario().isEmpty()||agenda.getUsuario().getNomeUsuario()==null){
            JOptionPane.showMessageDialog(rootPane, "Usuário não logado", "Login Necessário", JOptionPane.INFORMATION_MESSAGE);
            cardLayout.show(getContentPane(), "cardLogin");
            limparCamposTela();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelarRegistre;
    private javax.swing.JButton btEntrarLogin;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btRegistrarLogin;
    private javax.swing.JButton btRegistrarRegistre;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField entradaDataFim;
    private javax.swing.JFormattedTextField entradaDataInicio;
    private javax.swing.JTextArea entradaDescCompromisso;
    private javax.swing.JFormattedTextField entradaHoraFim;
    private javax.swing.JFormattedTextField entradaHoraInicio;
    private javax.swing.JTextField entradaNomeCompromisso;
    private javax.swing.JTextField entradaUsuario;
    private javax.swing.JTextField entradaUsuarioRegistre;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
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
