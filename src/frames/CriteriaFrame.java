package frames;

import classes.Film;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;


/**
 *
 * @author Sebastien.MARTIN
 */
public class CriteriaFrame extends javax.swing.JFrame {

    // Create global variable
    
    List<Film> allFilms = new ArrayList<>();
    List<Film> selectedFilms = new ArrayList<>();
    List<JCheckBox> cbTypes = new ArrayList<>();
    private Dimension area;
    Dimension buttonArea;
    
    public CriteriaFrame(List<Film> allFilms, List<String> filmfails) {
        
        this.allFilms = allFilms;
        initComponents();
        addListeners();
        
        // The test content for testing the component 
        List<String> types = new ArrayList<>();

        
        int y = 0;
        int i = 0;
        // For each type of film, we create a categorie button.
        for (Film film : allFilms){
            JCheckBox cb;
            for (String type : film.getTypes()){
                // we test if the categorie has already been created we don't create a new button. Else we create a new button
                if (!types.contains(type)){
                    types.add(type);
                    System.out.println(type);
                    cb = new JCheckBox(type);
                    if (i == 7 || i == 0){
                        y = 0;
                    } else {
                        y += 20;
                    }
                    cb.setLocation(0,y);
                    cb.setSize(200,20);
                    cb.setBackground(new Color(25,25,25));
                    cb.setFont(Font.decode("Raleway"));
                    cb.setForeground(new Color(242,242,242));
                    cb.setHideActionText(true);
                    cb.addKeyListener(new KeyAdapter(){
                        @Override
                        public void keyPressed(KeyEvent e) {
                            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                search();
                            }
                        }
                    });
                    cbTypes.add(cb);
                    if (i < 7){
                        panelType.add(cb);
                    } else {
                        panelType2.add(cb);
                    }
                    i++;
                }
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
        jLabel2 = new javax.swing.JLabel();
        pnlCriteria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtYearBegin = new javax.swing.JTextField();
        txtYearEnd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtActors = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRealisator = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searchByName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        panelType = new javax.swing.JPanel();
        panelType2 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        panelFilms = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 625));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/top.png"))); // NOI18N

        pnlCriteria.setBackground(new java.awt.Color(25, 25, 25));

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Nom du film :");

        txtYearBegin.setBackground(new java.awt.Color(50, 50, 50));
        txtYearBegin.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        txtYearBegin.setForeground(new java.awt.Color(242, 242, 242));
        txtYearBegin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));
        txtYearBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearBeginActionPerformed(evt);
            }
        });

        txtYearEnd.setBackground(new java.awt.Color(50, 50, 50));
        txtYearEnd.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        txtYearEnd.setForeground(new java.awt.Color(242, 242, 242));
        txtYearEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));
        txtYearEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearEndActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Acteur :");

        txtActors.setBackground(new java.awt.Color(50, 50, 50));
        txtActors.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        txtActors.setForeground(new java.awt.Color(242, 242, 242));
        txtActors.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));
        txtActors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActorsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Réalisateur :");

        txtRealisator.setBackground(new java.awt.Color(50, 50, 50));
        txtRealisator.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        txtRealisator.setForeground(new java.awt.Color(242, 242, 242));
        txtRealisator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));
        txtRealisator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRealisatorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Genre :");

        searchByName.setBackground(new java.awt.Color(50, 50, 50));
        searchByName.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        searchByName.setForeground(new java.awt.Color(242, 242, 242));
        searchByName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(70, 70, 70)));
        searchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Année de sortie entre :");

        btnSearch.setBackground(new java.awt.Color(255, 78, 0));
        btnSearch.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(242, 242, 242));
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        panelType.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout panelTypeLayout = new javax.swing.GroupLayout(panelType);
        panelType.setLayout(panelTypeLayout);
        panelTypeLayout.setHorizontalGroup(
            panelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        panelTypeLayout.setVerticalGroup(
            panelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelType2.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout panelType2Layout = new javax.swing.GroupLayout(panelType2);
        panelType2.setLayout(panelType2Layout);
        panelType2Layout.setHorizontalGroup(
            panelType2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelType2Layout.setVerticalGroup(
            panelType2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCriteriaLayout = new javax.swing.GroupLayout(pnlCriteria);
        pnlCriteria.setLayout(pnlCriteriaLayout);
        pnlCriteriaLayout.setHorizontalGroup(
            pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCriteriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCriteriaLayout.createSequentialGroup()
                        .addComponent(txtYearBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtActors)
                    .addComponent(txtRealisator)
                    .addGroup(pnlCriteriaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCriteriaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchByName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCriteriaLayout.createSequentialGroup()
                        .addComponent(panelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelType2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCriteriaLayout.setVerticalGroup(
            pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriteriaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtActors, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCriteriaLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRealisator, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelType2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        scrollPanel.setBackground(new java.awt.Color(25, 25, 25));
        scrollPanel.setBorder(null);

        panelFilms.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout panelFilmsLayout = new javax.swing.GroupLayout(panelFilms);
        panelFilms.setLayout(panelFilmsLayout);
        panelFilmsLayout.setHorizontalGroup(
            panelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        panelFilmsLayout.setVerticalGroup(
            panelFilmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(panelFilms);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPanel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCriteria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        search();
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void search(){
        // Clear results from last search
        panelFilms.removeAll();
        
        // Initialize positions for the film's items
        int y = 0;
        int x = 0;
        
        // A boolean returning if the size of the area has been changed
        boolean changed = false;
        
        // We initialize the size of the abstract object Dimension. 
        // We will assign the size of this element to the JPanel containing each buttons film if the size has changed
        area = new Dimension(0,0);
        
        // We create a dimension pbject that will set the size of the film's buttons
        buttonArea = new Dimension (316,40);

        
        // Create an object film of type Film for each film fund in the Array allFilms and loop on it.
        for (Film film : allFilms){
            
            // We create a boolean that will define at the end of all the test if the current analyzed film match to the criteria.
            Boolean isConform = true;
            
            // We test if the Begin Year criteria is greater or equal to the creation date of the movie.
            if (!txtYearBegin.getText().trim().isEmpty()){
                int beginYear = Integer.parseInt(txtYearBegin.getText());
                if (film.getReleaseYear() < beginYear){
                    isConform = false;
                }
            }
            
            // We test if the film's creation date is lower or equal to the End Year criteria
            if (!txtYearEnd.getText().trim().isEmpty()){
                int endYear = Integer.parseInt(txtYearEnd.getText());
                if (film.getReleaseYear() > endYear){
                    isConform = false;
                }
            }
            
            // We test if the user tapped an actor's name and if the current movie match an actor tapped
            if (!txtActors.getText().trim().isEmpty()){
                List<String> actorsCriteria = Arrays.asList(txtActors.getText().split("\\,"));
                for (String actorCriteria : actorsCriteria){
                    Boolean isMatchActor = false;
                    for (String actorFilm : film.getActors()){
                        if (actorFilm.toLowerCase().matches(".*"+actorCriteria.trim().toLowerCase()+".*")){
                            isMatchActor = true;
                        }
                    }
                    if (!isMatchActor){
                        isConform = false;
                    }
                }
            }
            
            // Test if the the given realisator match to the current film
            if (!txtRealisator.getText().trim().isEmpty()){
                List<String> realisatorsCriteria = Arrays.asList(txtRealisator.getText().split("\\,"));
                Boolean isMatchRealisator = false;
                for (String realisatorCriteria : realisatorsCriteria){
                    if (film.getRealisator().toLowerCase().matches(".*"+realisatorCriteria.toLowerCase().trim()+".*")){
                        isMatchRealisator = true;
                    }
                }
            
                if(!isMatchRealisator){
                    isConform = false;
                }
            }             
            
            // Test if the String given match to the current film
            if (!searchByName.getText().isEmpty() && !film.getTitle().toUpperCase().contains(searchByName.getText().toUpperCase())){
                isConform = false;
            }
            
            // Test if the current film has those types
            Boolean isTypesMatch = true;
            List<String> cbTxtTypes = new ArrayList<>();
            for (JCheckBox cb : cbTypes){
                if (cb.isSelected()){
                    isTypesMatch = false;
                    cbTxtTypes.add(cb.getText());
                }
            }
            for (String cbTxtType : cbTxtTypes){
                if (film.getTypes().contains(cbTxtType)){
                    isTypesMatch = true;
                }
            }
            if (!isTypesMatch){
                isConform = false;
            }
            
            
            if (isConform){
                selectedFilms.add(film);
                JButton b2 = new JButton(film.getTitle().toUpperCase());
                Font fonte = new Font("Raleway",Font.BOLD,12);
                b2.setFont(fonte);
                b2.setForeground(new Color(230,230,230));
                b2.setBackground(new Color(40,40,40));
                b2.setHorizontalTextPosition(AbstractButton.LEADING);
                b2.setBorder(BorderFactory.createLineBorder(new Color(50,50,50)));
                b2.setSize(316, 40);
                b2.setLocation(x,y);
                b2.addActionListener((ActionEvent e) -> {
                    FilmDetails filmDetails = new FilmDetails(film);
                    filmDetails.setVisible(true);
                });
                panelFilms.add(b2);
                y += 45;
                int this_height = (y);
                if (this_height > area.height) {
                    area.height = this_height; 
                    changed=true;
                }
                if (changed) {
                    panelFilms.setPreferredSize(area);

                    panelFilms.revalidate();
                }
                panelFilms.repaint();
            }
        }
    }
    
    private void addListeners(){
        btnSearch.requestFocus();
        
        btnSearch.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
        
        searchByName.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
        
        txtYearBegin.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
        
        txtYearEnd.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
        
        txtActors.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
        
        txtRealisator.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    search();
                }
            }
        });
    }
    
    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByNameActionPerformed

    private void txtRealisatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRealisatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRealisatorActionPerformed

    private void txtActorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActorsActionPerformed

    private void txtYearEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearEndActionPerformed

    private void txtYearBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearBeginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearBeginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelFilms;
    private javax.swing.JPanel panelType;
    private javax.swing.JPanel panelType2;
    private javax.swing.JPanel pnlCriteria;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextField searchByName;
    private javax.swing.JTextField txtActors;
    private javax.swing.JTextField txtRealisator;
    private javax.swing.JTextField txtYearBegin;
    private javax.swing.JTextField txtYearEnd;
    // End of variables declaration//GEN-END:variables
}

