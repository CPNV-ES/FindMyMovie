/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import classes.Film;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author marco.visalli
 */
public class FilmDetails extends javax.swing.JFrame {
    
    Film film;
    /**
     * Creates new form FilmDetails
     * @param film
     */
    public FilmDetails(Film film) {
        this.film = film;
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        try {
            
            // Set title
            lblTitle.setText(film.getTitle().trim());
            
            // Set actors
            StringBuilder actors = new StringBuilder();
            
            for (int i=0;i<film.getActors().size();i++){
                actors.append(film.getActors().get(i));
                if (i < film.getActors().size()-1){
                    actors.append(", ");
                }
                if (i%4 == 2){
                    actors.append("\n");
                }
                
            }
            txtpActors.setText(actors.toString());
            
            // Set released year
            lblReleasedYear.setText(Integer.toString(film.getReleaseYear()));
            
            // Set realisator
            lblRealisator.setText(film.getRealisator());
            
            // Set runtime
            lblLength.setText(film.getRuntime());
            
            // Set the film types
            StringBuilder types=new StringBuilder();
                        
             for (int i=0;i<film.getTypes().size();i++){
                types.append(film.getTypes().get(i));
                if (i < film.getTypes().size()-1){
                    types.append(", ");
                }
             }
           
            lblTypes.setText(types.toString());
            
            // Set image
            Icon icon;
            if (film.getImage() != null || !film.getImage().equals("N/A")){
                URL url = new URL(film.getImage());
                Image image = ImageIO.read(url);  
                icon= new ImageIcon(image);
                lblImage.setIcon(icon);
            }
            
            // Set description
            txtpDescription.setText(film.getDescription());

            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtpActors = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblKind = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblTypes = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        txtpDescription = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblReleasedYear = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRealisator = new javax.swing.JLabel();
        btnGO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 25, 25));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        mainPanel.setBackground(new java.awt.Color(25, 25, 25));
        mainPanel.setForeground(new java.awt.Color(240, 240, 240));
        mainPanel.setAutoscrolls(true);
        mainPanel.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 95, 95));
        jLabel1.setText("Titre :");

        lblTitle.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));

        lblYear.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        lblYear.setForeground(new java.awt.Color(95, 95, 95));
        lblYear.setText("Acteurs :");

        txtpActors.setBackground(new java.awt.Color(25, 25, 25));
        txtpActors.setBorder(null);
        txtpActors.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        txtpActors.setForeground(new java.awt.Color(255, 255, 255));
        txtpActors.setAutoscrolls(false);
        txtpActors.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtpActors.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 95, 95));
        jLabel2.setText("Durée :");

        lblLength.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        lblLength.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(95, 95, 95));
        jLabel4.setText("Genres :");

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(95, 95, 95));
        jLabel5.setText("Description :");

        lblTypes.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        lblTypes.setForeground(new java.awt.Color(240, 240, 240));
        lblTypes.setText("genre");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_not_found.jpg"))); // NOI18N

        txtpDescription.setBackground(new java.awt.Color(25, 25, 25));
        txtpDescription.setBorder(null);
        txtpDescription.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        txtpDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtpDescription.setAutoscrolls(false);
        txtpDescription.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtpDescription.setEnabled(false);

        jLabel6.setBackground(new java.awt.Color(25, 25, 25));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/top3.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 95, 95));
        jLabel3.setText("Année de sortie :");

        lblReleasedYear.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        lblReleasedYear.setForeground(new java.awt.Color(240, 240, 240));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(95, 95, 95));
        jLabel7.setText("Réalisateur :");

        lblRealisator.setFont(new java.awt.Font("Raleway", 1, 15)); // NOI18N
        lblRealisator.setForeground(new java.awt.Color(240, 240, 240));

        btnGO.setBackground(new java.awt.Color(255, 78, 0));
        btnGO.setFont(new java.awt.Font("Raleway", 1, 36)); // NOI18N
        btnGO.setForeground(new java.awt.Color(255, 255, 255));
        btnGO.setText("PLAY");
        btnGO.setBorderPainted(false);
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKind)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lblDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReleasedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRealisator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpActors)
                            .addComponent(lblTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblReleasedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lblRealisator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblYear)
                        .addGap(18, 18, 18)
                        .addComponent(txtpActors, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblTypes)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtpDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescription)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(lblKind)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(btnGO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGOActionPerformed
        
        System.out.println(film.getPath());
        try {
            Desktop.getDesktop().open(new File(film.getPath()));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGOActionPerformed

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
            java.util.logging.Logger.getLogger(FilmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblKind;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblRealisator;
    private javax.swing.JLabel lblReleasedYear;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTypes;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextPane txtpActors;
    private javax.swing.JTextPane txtpDescription;
    // End of variables declaration//GEN-END:variables
}
