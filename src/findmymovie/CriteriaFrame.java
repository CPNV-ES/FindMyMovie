package findmymovie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


/**
 *
 * @author Sebastien.MARTIN
 */
public class CriteriaFrame extends javax.swing.JFrame {

     List<Film> allFilms = new ArrayList<Film>();
     List<Film> selectedFilms = new ArrayList<Film>();
    private Object frame;
    public CriteriaFrame(List<Film> films, List<String> filmfails) {
        
        initComponents();
        
        scrollPanel.getViewport().setBackground(new Color(25,25,25));
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        List<String> types = new ArrayList<String>();
        List<String> actors = new ArrayList<String>();
        actors.add("De Funes");
        actors.add("Jim Carrey");
        actors.add("Christian Clavier");
        
        List<String> actors2 = new ArrayList<String>();
        actors2.add("Jim Carrey");
        
        List<String> typeFilms = new ArrayList<String>();
        typeFilms.add("Action");
        
        List<String> typeFilms2 = new ArrayList<String>();
        typeFilms2.add("Humour");
        typeFilms2.add("Aventure");
        typeFilms2.add("Action");
        
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("Le Seigneur des anneaux: Les deux tours de la mort", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("matrix", actors, 2000, "Helmut", typeFilms));
        allFilms.add(new Film("ace ventura", actors2, 2007, "Bernardo", typeFilms2));
        
        List<String> actorsToPutInCb = new ArrayList<>();
        
        int y = 0;
        for (Film film : allFilms){
            /*for (String actor : film.getActors()){
                if (!actorsToPutInCb.contains(actor)){
                    actorsToPutInCb.add(actor);
                }
            }*/
            JCheckBox cb = null;
            for (String type : film.getTypes()){
                if (!types.contains(type)){
                    types.add(type);
                    System.out.println(type);
                    cb = new JCheckBox(type);
                    cb.setLocation(0,y);
                    y+= 20;
                    cb.setSize(200,20);
                    //cb.setEnabled(false);
                    cb.setBackground(new Color(25,25,25));
                    cb.setFont(Font.decode("Raleway"));
                    cb.setForeground(new Color(242,242,242));
                    panelType.add(cb);
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
        pnlType = new javax.swing.JPanel();
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
        scrollPanel = new javax.swing.JScrollPane();
        panelFilms = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 625));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sebastien.martin@cpnv.ch\\Documents\\NetBeansProjects\\Test Java\\findmymovies2.png")); // NOI18N

        pnlType.setBackground(new java.awt.Color(25, 25, 25));

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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sebastien.martin@cpnv.ch\\Documents\\6) Projet\\interro.png")); // NOI18N

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

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\sebastien.martin@cpnv.ch\\Documents\\6) Projet\\interro.png")); // NOI18N

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTypeLayout.setVerticalGroup(
            panelTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlTypeLayout = new javax.swing.GroupLayout(pnlType);
        pnlType.setLayout(pnlTypeLayout);
        pnlTypeLayout.setHorizontalGroup(
            pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTypeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTypeLayout.createSequentialGroup()
                        .addComponent(txtYearBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtActors)
                    .addComponent(txtRealisator)
                    .addGroup(pnlTypeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTypeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchByName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlTypeLayout.setVerticalGroup(
            pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTypeLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtActors, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTypeLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRealisator, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addGap(0, 561, Short.MAX_VALUE)
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
                .addComponent(pnlType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(pnlType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        JLabel lbl = null;
        int y = 0;
        int x = 0;
        int JPanelStartHeight = 561;
        
        for (Film film : allFilms){
            Boolean isConform = true;
            System.out.println(film.getTitle());
            
            // test Begin Year
            if (!txtYearBegin.getText().trim().isEmpty()){
                int beginYear = Integer.parseInt(txtYearBegin.getText());
                if (film.getReleaseYear() < beginYear){
                    isConform = false;
                }
            }
            
            
            // test End year
            if (!txtYearEnd.getText().trim().isEmpty()){
                int endYear = Integer.parseInt(txtYearEnd.getText());
                if (film.getReleaseYear() > endYear){
                    isConform = false;
                }
            }
            
            // test acteur
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
                        
            // test réalisateur
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
            // test recherche nom
            if (!searchByName.getText().isEmpty() && !searchByName.getText().equals(film.getTitle())){
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
                b2.setSize(336, 40);
                b2.setLocation(x,y);
                y +=45;
                if (y >= 540){
                    JPanelStartHeight += 45;
                    panelFilms.setSize(new Dimension(342, JPanelStartHeight));  
                    scrollPanel.revalidate();
                }
                panelFilms.add(b2);
                panelFilms.validate();
                panelFilms.repaint();
                System.out.println(film.getTitle());
            }
            
        }
       
    }//GEN-LAST:event_btnSearchActionPerformed

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
    private javax.swing.JPanel pnlType;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextField searchByName;
    private javax.swing.JTextField txtActors;
    private javax.swing.JTextField txtRealisator;
    private javax.swing.JTextField txtYearBegin;
    private javax.swing.JTextField txtYearEnd;
    // End of variables declaration//GEN-END:variables
}

