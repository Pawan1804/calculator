/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JFrame;

/**
 *
 * @author Pawan
 */
public class Calculator extends javax.swing.JFrame {

   double firstnum;
   double secondnum;
   double result;
   String operation;
   
    public Calculator() {
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

        jPanel1 = new javax.swing.JPanel();
        j9 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        j7 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        jc = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 0, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        j9.setBackground(new java.awt.Color(51, 204, 255));
        j9.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j9.setText("9");
        j9.setToolTipText("");
        j9.setAlignmentY(0.0F);
        j9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j9MouseClicked(evt);
            }
        });
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        j6.setBackground(new java.awt.Color(51, 204, 255));
        j6.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j6.setText("6");
        j6.setToolTipText("");
        j6.setAlignmentY(0.0F);
        j6.setName(""); // NOI18N
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j3.setBackground(new java.awt.Color(51, 204, 255));
        j3.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j3.setText("3");
        j3.setToolTipText("");
        j3.setAlignmentY(0.0F);
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(51, 204, 255));
        equal.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        equal.setText("=");
        equal.setToolTipText("");
        equal.setAlignmentY(0.0F);
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        division.setBackground(new java.awt.Color(51, 204, 255));
        division.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        division.setText("/");
        division.setToolTipText("");
        division.setAlignmentY(0.0F);
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        multiplication.setBackground(new java.awt.Color(51, 204, 255));
        multiplication.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        multiplication.setText("×");
        multiplication.setToolTipText("");
        multiplication.setAlignmentY(0.0F);
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(51, 204, 255));
        subtract.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        subtract.setText("-");
        subtract.setToolTipText("");
        subtract.setAlignmentY(0.0F);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(51, 204, 255));
        add.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        add.setText("+");
        add.setToolTipText("");
        add.setAlignmentY(0.0F);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        j7.setBackground(new java.awt.Color(51, 204, 255));
        j7.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j7.setText("7");
        j7.setToolTipText("");
        j7.setAlignmentY(0.0F);
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j4.setBackground(new java.awt.Color(51, 204, 255));
        j4.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j4.setText("4");
        j4.setToolTipText("");
        j4.setAlignmentY(0.0F);
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j1.setBackground(new java.awt.Color(51, 204, 255));
        j1.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j1.setText("1");
        j1.setToolTipText("");
        j1.setAlignmentY(0.0F);
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j1KeyTyped(evt);
            }
        });

        jc.setBackground(new java.awt.Color(51, 204, 255));
        jc.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jc.setText("C");
        jc.setToolTipText("");
        jc.setAlignmentY(0.0F);
        jc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcMouseEntered(evt);
            }
        });
        jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActionPerformed(evt);
            }
        });
        jc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcKeyPressed(evt);
            }
        });

        j8.setBackground(new java.awt.Color(51, 204, 255));
        j8.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j8.setText("8");
        j8.setToolTipText("");
        j8.setAlignmentY(0.0F);
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j5.setBackground(new java.awt.Color(51, 204, 255));
        j5.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j5.setText("5");
        j5.setToolTipText("");
        j5.setAlignmentY(0.0F);
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j2.setBackground(new java.awt.Color(51, 204, 255));
        j2.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j2.setText("2");
        j2.setToolTipText("");
        j2.setAlignmentY(0.0F);
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j0.setBackground(new java.awt.Color(51, 204, 255));
        j0.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        j0.setText("0");
        j0.setToolTipText("");
        j0.setAlignmentY(0.0F);
        j0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multiplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
       
        String Enternum = jTextField1.getText() + j7.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j7ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
       
        String Enternum = jTextField1.getText() + j1.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j1ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
     
        String Enternum = jTextField1.getText() + j3.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j3ActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "/";
        
    }//GEN-LAST:event_divisionActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        String answer;
        secondnum = Double.parseDouble(jTextField1.getText());
        if (operation == "+" )
        {
            result = firstnum + secondnum;
            answer = String.format("%.0f", result);
            jTextField1.setText(answer);
        }
        
        else if (operation == "-" )
        {
            result = firstnum - secondnum;
            answer = String.format("%.0f", result);
            jTextField1.setText(answer);
        }
        
        else if (operation == "*" )
        {
            result = firstnum * secondnum;
            answer = String.format("%.0f", result);
            jTextField1.setText(answer);
        }
        
        else if (operation == "/" )
        {
            result = firstnum / secondnum;
            answer = String.format("%.0f", result);
            jTextField1.setText(answer);
        }
        
    }//GEN-LAST:event_equalActionPerformed

    private void jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActionPerformed
       jTextField1.setText("");
    }//GEN-LAST:event_jcActionPerformed

    private void jcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcKeyPressed

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        
        
        
    }//GEN-LAST:event_j1KeyPressed

    private void j1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyTyped

    }//GEN-LAST:event_j1KeyTyped

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
    
        String Enternum = jTextField1.getText() + j2.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j2ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
       
        String Enternum = jTextField1.getText() + j4.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        
        String Enternum = jTextField1.getText() + j5.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
     
        String Enternum = jTextField1.getText() + j6.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j6ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
      
        String Enternum = jTextField1.getText() + j8.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
       
        String Enternum = jTextField1.getText() + j9.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j9ActionPerformed

    private void j0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0ActionPerformed
      
        String Enternum = jTextField1.getText() + j0.getText();
       jTextField1.setText(Enternum);
    }//GEN-LAST:event_j0ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "+";
        
        
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
       
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "-";
        
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        
        firstnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operation = "*";
        
    }//GEN-LAST:event_multiplicationActionPerformed

    private void j9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseClicked
      
    }//GEN-LAST:event_j9MouseClicked

    private void jcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcMouseEntered
       
        
        
    }//GEN-LAST:event_jcMouseEntered

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton division;
    private javax.swing.JButton equal;
    private javax.swing.JButton j0;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jc;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}
