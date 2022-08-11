/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogo;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class TelaJogo extends javax.swing.JFrame {

    Jogo jogo2 = new Jogo();
    private int contJogadas = 0;
    private boolean ganhou = false;//para identificar se ganhou
    
    private int contPlacar1 = 0;
    private int contPlacar2 = 0;
    
    private final String [] jogada = new String[9];
    
    //private  String [] jogada = {"nada0", "nada1", "nada2", "nada3", "nada4", "nada5", "nada6", "nada7", "nada8"};
    
    public TelaJogo(String nomeJogador1TelaJogo, String nomeJogador2TelaJogo) {
        initComponents();
        
        initStringArrayJogada();
        
        jogo2.setNomeJogador1(nomeJogador1TelaJogo);
        jogo2.setNomeJogador2(nomeJogador2TelaJogo);
        
        lblNomeJogadorTelaJogo.setText(jogo2.getNomeJogador1());
        
        lblPlacarJogador1.setText(jogo2.getNomeJogador1());
        lblPlacarJogador2.setText(jogo2.getNomeJogador2());
        lblPlacar1.setText(jogo2.getPlacar1()+"");
        lblPlacar2.setText(jogo2.getPlacar2()+"");
    }
    
    private void initStringArrayJogada() {
        String nada = "nada";
        for (int i = 0 ; i < jogada.length ; i++) {
            jogada[i] = nada + String.valueOf(i);
            System.out.println(jogada[i]);
        }
    }
    
    public void vezJogada(){
        if(jogo2.getVezJogada().equals("j1")){
            lblNomeJogadorTelaJogo.setText(jogo2.getNomeJogador1());
        }else{
            lblNomeJogadorTelaJogo.setText(jogo2.getNomeJogador2());
        }
    }
        
    public void verificarJogada(){
        //Verificando horizontais X
        
        if(jogada[0].equals("x") && jogada[3].equals("x") && jogada[6].equals("x")){//primeira linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }
        else if(jogada[1].equals("x") && jogada[4].equals("x") && jogada[7].equals("x")){//segunda linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }else if(jogada[2].equals("x") && jogada[5].equals("x") && jogada[8].equals("x")){//terceira linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }
        
        //verificando verticais X
        
        else if(jogada[0].equals("x") && jogada[1].equals("x") && jogada[2].equals("x")){//primeira coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }else if(jogada[3].equals("x") && jogada[4].equals("x") && jogada[5].equals("x")){//segunda coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }else if(jogada[6].equals("x") && jogada[7].equals("x") && jogada[8].equals("x")){//terceira coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }
        
        //Verificando diagonais X
        
        else if(jogada[0].equals("x") && jogada[4].equals("x") && jogada[8].equals("x")){//primeira diagonal
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");//da esquerda para direita
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }else if(jogada[6].equals("x") && jogada[4].equals("x") && jogada[2].equals("x")){//segunda diagonal
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador1()+" ganhou!");//da direita para esquerda
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar1++;
            jogo2.setPlacar1(contPlacar1);
            lblPlacar1.setText(""+jogo2.getPlacar1());
        }
        
        //Verificando O
        
        //Verificando horizontais O
        if(jogada[0].equals("o") && jogada[3].equals("o") && jogada[6].equals("o")){//primeira linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }else if(jogada[1].equals("o") && jogada[4].equals("o") && jogada[7].equals("o")){//segunda linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }else if(jogada[2].equals("o") && jogada[5].equals("o") && jogada[8].equals("o")){//terceira linha
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }
        
        //verificando verticais O
        
        else if(jogada[0].equals("o") && jogada[1].equals("o") && jogada[2].equals("o")){//primeira coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }else if(jogada[3].equals("o") && jogada[4].equals("o") && jogada[5].equals("o")){//segunda coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }else if(jogada[6].equals("o") && jogada[7].equals("o") && jogada[8].equals("o")){//terceira coluna
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }
        
        //Verificando diagonais O
        
        else if(jogada[0].equals("o") && jogada[4].equals("o") && jogada[8].equals("o")){//primeira diagonal
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");//da esquerda para direita
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }else if(jogada[6].equals("o") && jogada[4].equals("o") && jogada[2].equals("o")){//segunda diagonal
            JOptionPane.showMessageDialog(rootPane, jogo2.getNomeJogador2()+" ganhou!");//da direita para esquerda
            btnJogo1.setEnabled(false);
            btnJogo2.setEnabled(false);
            btnJogo3.setEnabled(false);
            btnJogo4.setEnabled(false);
            btnJogo5.setEnabled(false);
            btnJogo6.setEnabled(false);
            btnJogo7.setEnabled(false);
            btnJogo8.setEnabled(false);
            btnJogo9.setEnabled(false);
            
            ganhou = true;
            contPlacar2++;
            jogo2.setPlacar2(contPlacar2);
            lblPlacar2.setText(""+jogo2.getPlacar2());
        }
        
        else if(contJogadas == 9 && ganhou == false){
            JOptionPane.showMessageDialog(rootPane, "Deu Velha!", "Inane error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            vezJogada();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNomeJogadorTelaJogo = new javax.swing.JLabel();
        btnJogo1 = new javax.swing.JButton();
        btnJogo2 = new javax.swing.JButton();
        btnJogo3 = new javax.swing.JButton();
        btnJogo4 = new javax.swing.JButton();
        btnJogo5 = new javax.swing.JButton();
        btnJogo6 = new javax.swing.JButton();
        btnJogo7 = new javax.swing.JButton();
        btnJogo8 = new javax.swing.JButton();
        btnJogo9 = new javax.swing.JButton();
        btnNovoJogo = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        lblPlacarJogador1 = new javax.swing.JLabel();
        lblPlacarJogador2 = new javax.swing.JLabel();
        lblPlacar1 = new javax.swing.JLabel();
        lblPlacar2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Vez de:");

        lblNomeJogadorTelaJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeJogadorTelaJogo.setText("Nome do Jogador");

        btnJogo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo1ActionPerformed(evt);
            }
        });

        btnJogo2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo2ActionPerformed(evt);
            }
        });

        btnJogo3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo3ActionPerformed(evt);
            }
        });

        btnJogo4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo4ActionPerformed(evt);
            }
        });

        btnJogo5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo5ActionPerformed(evt);
            }
        });

        btnJogo6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo6ActionPerformed(evt);
            }
        });

        btnJogo7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo7ActionPerformed(evt);
            }
        });

        btnJogo8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo8ActionPerformed(evt);
            }
        });

        btnJogo9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnJogo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogo9ActionPerformed(evt);
            }
        });

        btnNovoJogo.setBackground(new java.awt.Color(51, 102, 255));
        btnNovoJogo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoJogo.setText("Novo Jogo!");
        btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoJogoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Placar:");

        lblPlacarJogador1.setText("jogador1");

        lblPlacarJogador2.setText("jogador2");

        lblPlacar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlacar1.setText("placar1");

        lblPlacar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlacar2.setText("placar2");

        btnReiniciar.setBackground(new java.awt.Color(255, 51, 51));
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnJogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJogo6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJogo9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJogo8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJogo7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovoJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNomeJogadorTelaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPlacarJogador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPlacarJogador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlacar1)
                                    .addComponent(lblPlacar2))))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNomeJogadorTelaJogo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJogo7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJogo8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlacarJogador1)
                            .addComponent(lblPlacar1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlacarJogador2)
                            .addComponent(lblPlacar2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJogo6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo1ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo1.setText("X");
            jogada[0] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo1.setText("O");
            jogada[0] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo1.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo1ActionPerformed

    private void btnJogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo4ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo4.setText("X");
            jogada[3] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo4.setText("O");
            jogada[3] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo4.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo4ActionPerformed

    private void btnJogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo2ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo2.setText("X");
            jogada[1] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo2.setText("O");
            jogada[1] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo2.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo2ActionPerformed

    private void btnJogo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo3ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo3.setText("X");
            jogada[2] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo3.setText("O");
            jogada[2] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo3.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo3ActionPerformed

    private void btnJogo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo5ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo5.setText("X");
            jogada[4] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo5.setText("O");
            jogada[4] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo5.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo5ActionPerformed

    private void btnJogo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo6ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo6.setText("X");
            jogada[5] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo6.setText("O");
            jogada[5] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo6.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo6ActionPerformed

    private void btnJogo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo7ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo7.setText("X");
            jogada[6] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo7.setText("O");
            jogada[6] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo7.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo7ActionPerformed

    private void btnJogo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo8ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo8.setText("X");
            jogada[7] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo8.setText("O");
            jogada[7] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo8.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo8ActionPerformed

    private void btnJogo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogo9ActionPerformed
        if(jogo2.getVezJogada().equals("j1")){
            btnJogo9.setText("X");
            jogada[8] = "x";
            jogo2.setVezJogada("j2");
        }else{
            btnJogo9.setText("O");
            jogada[8] = "o";
            jogo2.setVezJogada("j1");
        }
        
        btnJogo9.setEnabled(false);
        contJogadas++;
        
        verificarJogada();
        vezJogada();
    }//GEN-LAST:event_btnJogo9ActionPerformed

    private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoJogoActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        jogo2.setVezJogada("j1");
        contJogadas = 0;
        
        ganhou = false;
        
        initStringArrayJogada();
        
        btnJogo1.setEnabled(true);
        btnJogo2.setEnabled(true);
        btnJogo3.setEnabled(true);
        btnJogo4.setEnabled(true);
        btnJogo5.setEnabled(true);
        btnJogo6.setEnabled(true);
        btnJogo7.setEnabled(true);
        btnJogo8.setEnabled(true);
        btnJogo9.setEnabled(true);
        
        btnJogo1.setText("");
        btnJogo2.setText("");
        btnJogo3.setText("");
        btnJogo4.setText("");
        btnJogo5.setText("");
        btnJogo6.setText("");
        btnJogo7.setText("");
        btnJogo8.setText("");
        btnJogo9.setText("");
        
//        
//        jogada[0] = "nada0";
//        jogada[1] = "nada1";
//        jogada[2] = "nada2";
//        jogada[3] = "nada3";
//        jogada[4] = "nada4";
//        jogada[5] = "nada5";
//        jogada[6] = "nada6";
//        jogada[7] = "nada7";
//        jogada[8] = "nada8";
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogo1;
    private javax.swing.JButton btnJogo2;
    private javax.swing.JButton btnJogo3;
    private javax.swing.JButton btnJogo4;
    private javax.swing.JButton btnJogo5;
    private javax.swing.JButton btnJogo6;
    private javax.swing.JButton btnJogo7;
    private javax.swing.JButton btnJogo8;
    private javax.swing.JButton btnJogo9;
    private javax.swing.JToggleButton btnNovoJogo;
    private javax.swing.JToggleButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNomeJogadorTelaJogo;
    private javax.swing.JLabel lblPlacar1;
    private javax.swing.JLabel lblPlacar2;
    private javax.swing.JLabel lblPlacarJogador1;
    private javax.swing.JLabel lblPlacarJogador2;
    // End of variables declaration//GEN-END:variables
}
