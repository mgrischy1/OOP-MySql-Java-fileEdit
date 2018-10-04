/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.finder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.in;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toMap;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikeg
 */
public class AdminGUI extends javax.swing.JFrame {

    private String info1;
    private int partNumInt;

    /**
     * Creates new form Parts
     */
    public AdminGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        partNumTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        versionTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        station_stepTxt = new javax.swing.JTextField();
        mpiTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mpi1Txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mpi2Txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        station_step1Txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        station_step2xt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        searchWordTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        partAttributesTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        readFileTxt = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        locateLineLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        fileTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        partNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partNumTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Version");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("partNumber");

        jLabel4.setText("MPI_Number");

        jLabel5.setText("MPI_Number1");

        mpiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpiTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Station_Step2");

        jLabel7.setText("Station_Step1");

        jLabel8.setText("MPI_Number2");

        jLabel9.setText("Station_Step");

        jLabel10.setText("Enter part number");

        searchWordTxt.setText("[98-321]");
        searchWordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWordTxtActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        partAttributesTxt.setColumns(20);
        partAttributesTxt.setRows(5);
        jScrollPane2.setViewportView(partAttributesTxt);

        jTabbedPane1.addTab("Part", jScrollPane2);

        readFileTxt.setColumns(20);
        readFileTxt.setRows(5);
        jScrollPane3.setViewportView(readFileTxt);

        jTabbedPane1.addTab("File", jScrollPane3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "partNumber", "Name", "Version", "Station Step", "MPI #", "Station step1", "Station Step2", "MPI1", "MPI2"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTabbedPane1.addTab("Database", jScrollPane4);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        locateLineLabel.setText("Line number");

        jButton5.setText("Database");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        fileTxt.setText("C:\\Users\\mikeg\\OneDrive\\Desktop\\testDB.txt");
        fileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTxtActionPerformed(evt);
            }
        });

        jLabel12.setText("Enter file");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(station_step2xt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partNumTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mpiTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(mpi1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(versionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addComponent(jLabel9)
                            .addComponent(station_stepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(locateLineLabel))
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(station_step1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mpi2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchWordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(fileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(partNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(versionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(station_stepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mpiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mpi1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(station_step1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mpi2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(station_step2xt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addComponent(locateLineLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchWordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            fileFunction();

        } catch (IOException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchWordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchWordTxtActionPerformed

    private void partNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partNumTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partNumTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void mpiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpiTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String partNumber = partNumTxt.getText();

        // System.out.println(g);
        partNumInt = Integer.parseInt(partNumber);

        PartsSql sql = new PartsSql();

        sql.delete(partNumInt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String partNumber = partNumTxt.getText();
        partNumInt = Integer.parseInt(partNumber);
        String name = nameTxt.getText();
        String version = versionTxt.getText();
        String Ss = station_stepTxt.getText();
        String mpi = mpiTxt.getText();
        String mpi1 = mpi1Txt.getText();
        String mpi2 = mpi2Txt.getText();
        String ss1 = station_step1Txt.getText();
        String ss2 = station_step2xt.getText();

        PartObj p = new PartObj(partNumInt, name, version, Ss, mpi, mpi1, mpi2, ss1, ss2);

        PartsSql sql = new PartsSql();

        try {
            sql.save(p);
        } catch (SQLException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String partNumber = partNumTxt.getText();
        partNumInt = Integer.parseInt(partNumber);
        String name = nameTxt.getText();
        String version = versionTxt.getText();
        String Ss = station_stepTxt.getText();
        String mpi = mpiTxt.getText();
        String mpi1 = mpi1Txt.getText();
        String mpi2 = mpi2Txt.getText();
        String ss1 = station_step1Txt.getText();
        String ss2 = station_step2xt.getText();
        PartObj p = new PartObj(partNumInt, name, version, Ss, mpi, mpi1, mpi2, ss1, ss2);

        PartsSql sql = new PartsSql();
        sql.update(p);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        PartsSql sql = new PartsSql();
        List<PartObj> eList = sql.show();
        Object data[] = new Object[9];
        for (int i = 0; i < eList.size(); i++) {
            data[0] = eList.get(i).getPartNumber();
            data[1] = eList.get(i).getName();
            data[2] = eList.get(i).getVersion();
            data[3] = eList.get(i).getStation_Step();
            data[4] = eList.get(i).getMPI_Number();
            data[5] = eList.get(i).getMPI_Number1();
            data[6] = eList.get(i).getMPI_Number2();
            data[7] = eList.get(i).getStation_Step1();
            data[8] = eList.get(i).getStation_Step2();
            model.addRow(data);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void fileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    public void fileFunction() throws FileNotFoundException, IOException, SQLException {
        
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        PartsSql sql = new PartsSql();
        List<PartObj> eList = sql.show();
        Object data[] = new Object[9];
        for (int i = 0; i < eList.size(); i++) {
            data[0] = eList.get(i).getPartNumber();
            data[1] = eList.get(i).getName();
            data[2] = eList.get(i).getVersion();
            data[3] = eList.get(i).getStation_Step();
            data[4] = eList.get(i).getMPI_Number();
            data[5] = eList.get(i).getMPI_Number1();
            data[6] = eList.get(i).getMPI_Number2();
            data[7] = eList.get(i).getStation_Step1();
            data[8] = eList.get(i).getStation_Step2();
            model.addRow(data);
        }
        
        BufferedReader in1 = new BufferedReader(new FileReader(fileTxt.getText()));
        String name = null;
        String Version = null;
        String Station_Step2 = null;
        String Station_Step1 = null;
        String Station_Step = null;
        String MPI_Number2 = null;
        String MPI_Number1 = null;
        String MPI_Number = null;

        int partNum = 0;

        String read = null;
        
        int count = 1;

       
        List<String> partNumList = new ArrayList<>();
        List<Integer> lineNumber = new ArrayList<>();

        while ((read = in1.readLine()) != null) {
           
            readFileTxt.append(count++ + " " + read + "\n");

           
            if (read.startsWith("[")) {
                
                partNumList.add(read);
                lineNumber.add(count);
            }

        }

        System.out.println(lineNumber);
        System.out.println(partNumList);

        BufferedReader in2 = new BufferedReader(new FileReader(fileTxt.getText()));

        int startLine;
        int endLine;
        String searchedWord = searchWordTxt.getText().trim();
       
        Matcher m = Pattern.compile("\\[(.*?)\\]").matcher(searchedWord);
        while (m.find()) {
            String c = m.group(1);
            String[] s = c.split("-");
            String g = s[0] + s[1];
            System.out.println(g);
            partNum = Integer.parseInt(g);

        }

        String info = "";

        startLine = lineNumber.get(partNumList.indexOf(searchedWord)) - 2;
        String g = String.valueOf(startLine + 1);
        locateLineLabel.setText("Located on line " + g );

        endLine = lineNumber.get(partNumList.indexOf(searchedWord) + 1) - 3;

        for (int i = 0; i < startLine; i++) {
            info = in2.readLine();
        }

        for (int i = startLine; i < endLine +1; i++) {

            info = in2.readLine();
            String[] splited = info.split("[=]");
            partAttributesTxt.append(info + "\n");
            if (info.startsWith("Name")) {

                if (splited.length >= 2) {

                    String nameU = splited[1];

                    name = pattern(nameU);

                }
            }
            if (info.startsWith("Version")) {

                if (splited.length >= 2) {

                    String VersionU = splited[1];

                    Version = pattern(VersionU);
                }
            }
            if (info.startsWith("Station_Step2")) {

                if (splited.length >= 2) {

                    String Station_Step2U = splited[1];

                    Station_Step2 = pattern(Station_Step2U);

                }
            }
            if (info.startsWith("Station_Step1")) {

                if (splited.length >= 2) {

                    String Station_Step1U = splited[1];

                    Station_Step1 = pattern(Station_Step1U);

                }
            }
            if (info.startsWith("Station_Step=")) {

                if (splited.length >= 2) {

                    String Station_StepU = splited[1];

                    Station_Step = pattern(Station_StepU);
                }

            }
            if (info.startsWith("MPI_Number2")) {

                if (splited.length >= 2) {

                    String MPI_Number2U = splited[1];

                    MPI_Number2 = pattern(MPI_Number2U);
                }

            }
            if (info.startsWith("MPI_Number1")) {

                if (splited.length >= 2) {

                    String MPI_Number1U = splited[1];

                    MPI_Number1 = pattern(MPI_Number1U);
                }

            }
            if (info.startsWith("MPI_Number=")) {

                if (splited.length >= 2) {

                    String MPI_NumberU = splited[1];

                    MPI_Number = pattern(MPI_NumberU);
                }

            }

        }
        PartObj p = new PartObj(partNum, name, Version, Station_Step, MPI_Number, MPI_Number1, MPI_Number2, Station_Step1, Station_Step2);
        System.out.println(p.toString());
        PartsSql psql = new PartsSql();
        partNumTxt.setText(String.valueOf(p.getPartNumber()));
        nameTxt.setText(p.getName());
        versionTxt.setText(p.getVersion());
        station_stepTxt.setText(p.getStation_Step());
        mpiTxt.setText(p.getMPI_Number());
        mpi1Txt.setText(p.getMPI_Number1());
        mpi2Txt.setText(p.getMPI_Number2());
        station_step1Txt.setText(p.getStation_Step1());
        station_step2xt.setText(p.getStation_Step2());

        in.close();

    }

    public String pattern(String s) {
        String s2 = null;
        Pattern pattern = Pattern.compile(".*\\\"(.*)\\\".*");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            s2 = matcher.group(1);
        }
        return s2;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fileTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel locateLineLabel;
    private javax.swing.JTextField mpi1Txt;
    private javax.swing.JTextField mpi2Txt;
    private javax.swing.JTextField mpiTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextArea partAttributesTxt;
    private javax.swing.JTextField partNumTxt;
    private javax.swing.JTextArea readFileTxt;
    private javax.swing.JTextField searchWordTxt;
    private javax.swing.JTextField station_step1Txt;
    private javax.swing.JTextField station_step2xt;
    private javax.swing.JTextField station_stepTxt;
    private javax.swing.JTextField versionTxt;
    // End of variables declaration//GEN-END:variables
}