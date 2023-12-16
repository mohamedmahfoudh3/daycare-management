/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.gestiongarderie.frame.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author nejib
 */
public class acc extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    static String test;
     public String sexee;

    /**
     * Creates new form acc
     */
    public acc() {
        initComponents();
        RemoveTitleBar();
               conn = ConexionBD.Conexion();

        Affichageanimateur();
        Affichageclasse();
        Affichageeleve();
    }
void RemoveTitleBar()
    {
        putClientProperty("acc.ispalette",Boolean.TRUE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }
public void Affichageanimateur() {
        try {
            String requete = "select COUNT(*) as tt from animateur";
            String requete1 = " select COUNT(*) as nbh from  animateur where sexe = '" + "Masculin" + "' ";
            String requete2 = " select COUNT(*) as nbf from  animateur where sexe = '" + "Feminin" + "' ";
            
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("tt");
            txtanimtot.setText(t);
             }
             
              ps = conn.prepareStatement(requete1);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("nbh");
            txtanimhom.setText(t);
             }
              ps = conn.prepareStatement(requete2);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("nbf");
            txtanimfemm.setText(t);
             }
             
            
ps.close();
                rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {

            try {
                ps.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }

    }


public void Affichageclasse() {
        try {
            String requete = "select COUNT(*) as tt from classe";
            
            
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("tt");
            txtclassetot.setText(t);
             }
             
            
            
            
ps.close();
                rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {

            try {
                ps.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }

    }



public void Affichageeleve() {
        try {
            String requete = "select COUNT(*) as tt from eleve";
            String requete1 = " select COUNT(*) as nbg from  eleve where sexe = '" + "Masculin" + "' ";
            String requete2 = " select COUNT(*) as nbf from  eleve where sexe = '" + "Feminin" + "' ";
            
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("tt");
            txteletot.setText(t);
             }
             ps = conn.prepareStatement(requete1);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("nbg");
            txtelegar.setText(t);
             }
              ps = conn.prepareStatement(requete2);
            rs = ps.executeQuery();
             if (rs.next()) 
             {
                 String t = rs.getString("nbf");
            txtelefil.setText(t);
             }
            
            
ps.close();
                rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {

            try {
                ps.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtanimtotal = new javax.swing.JLabel();
        txtanimhom = new javax.swing.JLabel();
        txtanimfemm = new javax.swing.JLabel();
        txtanimtot = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txteletot = new javax.swing.JLabel();
        txtelegar = new javax.swing.JLabel();
        txtelefil = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtclassetot = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistique Animateur", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(41, 24, 124))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre Totale :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Homme :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Femme :");

        txtanimhom.setText("jLabel10");

        txtanimfemm.setText("jLabel11");

        txtanimtot.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtanimfemm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtanimhom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtanimtot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtanimtotal)))
                .addContainerGap(767, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtanimtotal)
                    .addComponent(txtanimtot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtanimhom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtanimfemm))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1010, 140));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistique Eleves", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(41, 24, 124))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Total :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre Garçon :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre Fille :");

        txteletot.setText("jLabel12");

        txtelegar.setText("jLabel13");

        txtelefil.setText("jLabel14");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtelefil))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtelegar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txteletot)))
                .addContainerGap(774, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txteletot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtelegar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtelefil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1010, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistique Classes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(41, 24, 124))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre Total :");

        txtclassetot.setText("jLabel15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtclassetot)
                .addContainerGap(787, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtclassetot))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1010, 80));

        jPanel4.setBackground(new java.awt.Color(41, 75, 124));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Acceuil");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel9)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 50));

        setBounds(0, 0, 1050, 580);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtanimfemm;
    private javax.swing.JLabel txtanimhom;
    private javax.swing.JLabel txtanimtot;
    private javax.swing.JLabel txtanimtotal;
    private javax.swing.JLabel txtclassetot;
    private javax.swing.JLabel txtelefil;
    private javax.swing.JLabel txtelegar;
    private javax.swing.JLabel txteletot;
    // End of variables declaration//GEN-END:variables
}