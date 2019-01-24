package translateword;


import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;


public class Vocabular extends javax.swing.JFrame {
 private static final String Username =    "root";
   private static final String Password =    "root";
   private static final String Conn_String = "jdbc:mysql://localhost/wordsworld?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   Connection conn=null;
   int state=0;
   int idup=0;
    public Vocabular() {
        
        initComponents();
        DefaultTableModel tableModel =(DefaultTableModel) tableOfdata.getModel();
        try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select en,rus from wordsworld.vocabulary order by en asc;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       String en =rs.getString("en");
       String rus =rs.getString("rus");
       tableModel.addRow(new Object[]{en,rus});
        }
    }catch(SQLException e){
        System.err.print(e);
    }  
    }

    public void enableB(){
    create.setEnabled(true);
    update.setEnabled(true);
    delete.setEnabled(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOfdata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        ref = new javax.swing.JButton();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        mm = new javax.swing.JButton();
        about = new javax.swing.JButton();
        eng = new java.awt.TextField();
        russ = new java.awt.TextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableOfdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "English", "Russian"
            }
        ));
        tableOfdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOfdataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableOfdata);

        jLabel1.setText("English");

        jLabel2.setText("Russian");

        create.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drop.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        ref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        ref.setLabel("Refresh");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        mm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
        });

        about.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about.png"))); // NOI18N
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        eng.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eng.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                engFocusGained(evt);
            }
        });

        russ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        russ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                russFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(russ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(create, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(about)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mm)
                    .addComponent(about))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(russ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        DefaultTableModel tableModel =(DefaultTableModel) tableOfdata.getModel();
        tableModel.setRowCount(0);
        try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select en,rus from wordsworld.vocabulary order by en asc;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       String en =rs.getString("en");
       String rus =rs.getString("rus");
       tableModel.addRow(new Object[]{en,rus});
        }
    }catch(SQLException e){
        System.err.print(e);
    } 
        enableB();
    }//GEN-LAST:event_refActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    String enT= eng.getText();
    String rusT= russ.getText();
    int search=0;
    int id=0;
    try{
            conn = DriverManager.getConnection(Conn_String,Username,Password);
            System.out.println("Connection is working");
            Statement stmt = (Statement) conn.createStatement();
            String select="select id,en,rus from wordsworld.vocabulary where (en='"+enT+"') OR (rus='"+rusT+"');";
            ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
             id=rs.getInt("id");
            String en =rs.getString("en");
            String rus =rs.getString("rus");
            if(en.equals(enT) || rus.equals(rusT)){
               search=1; 
            }else{search=0;}
        }
    }
    catch (SQLException e){System.out.println(e);  }
    if(state==1 && search==0 )
    { 
        try{  
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for create");
        Statement stmt = (Statement) conn.createStatement();
        String cr="insert into wordsworld.vocabulary (en,rus,norepeat) values('"+enT+"','"+rusT+"',0);";
        stmt.executeUpdate(cr);
        }
        catch(SQLException e){System.out.println(e);}
    }
    if(state==2 ){
    
        try{
            conn = DriverManager.getConnection(Conn_String,Username,Password);
            System.out.println("Connection is workingcfor update");
            Statement stmt = (Statement) conn.createStatement();
            String upd="update wordsworld.vocabulary set en='"+enT+"', rus='"+rusT+"'where id = "+idup+";";
            stmt.executeUpdate(upd);
        }catch(SQLException e){System.out.println(e);}
    }
     if(state==3 && search==1){
        try{
            conn = DriverManager.getConnection(Conn_String,Username,Password);
            System.out.println("Connection is working for delete");
            Statement stmt = (Statement) conn.createStatement();
            String del="delete from wordsworld.vocabulary where id="+id+";";
            stmt.executeUpdate(del);
        }catch(SQLException e){System.out.println(e);}
    }
     if(state==4){
         System.out.println("hehe");
     }
     enableB();
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      state =4;
      eng.setText("");
      russ.setText("");
      enableB();
    }//GEN-LAST:event_cancelActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

     eng.setText("");
       russ.setText("");
       
       state=1;
       update.setEnabled(false);
       delete.setEnabled(false);
    }//GEN-LAST:event_createActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        state=2;  
    String enT= eng.getText();
    String rusT= russ.getText();
    try{
            conn = DriverManager.getConnection(Conn_String,Username,Password);
            System.out.println("Connection is working");
            Statement stmt = (Statement) conn.createStatement();
            String select="select id,en,rus from wordsworld.vocabulary where (en='"+enT+"') OR (rus='"+rusT+"');";
            ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
             idup=rs.getInt("id");
  
        }
    }
    catch (SQLException e){System.out.println(e);  }
    create.setEnabled(false);
    delete.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        state=3;
        create.setEnabled(false);
        update.setEnabled(false);
    }//GEN-LAST:event_deleteActionPerformed

    private void tableOfdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOfdataMouseClicked
        int col1 = 0;
        int col2 = 1;
        int row = tableOfdata.getSelectedRow();
        String engl = tableOfdata.getModel().getValueAt(row, col1).toString();
        String rusn = tableOfdata.getModel().getValueAt(row, col2).toString();
        System.out.println(engl); 
        System.out.println(rusn); 
        eng.setText(engl);
        russ.setText(rusn);// TODO add your handling code here:
    }//GEN-LAST:event_tableOfdataMouseClicked

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
        setVisible(false);
        new MainMenu().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mmMouseClicked

    private void russFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_russFocusGained
     russ.getInputContext().selectInputMethod( new Locale ("ru","RU"));   // TODO add your handling code here:
    }//GEN-LAST:event_russFocusGained

    private void engFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_engFocusGained
        eng.getInputContext().selectInputMethod( new Locale ("en","US"));   // TODO add your handling code here:
    }//GEN-LAST:event_engFocusGained

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
//        setVisible(false);
         AboutTW dialog = new AboutTW(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new MainMenu().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton cancel;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private java.awt.TextField eng;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mm;
    private javax.swing.JButton ref;
    private java.awt.TextField russ;
    private javax.swing.JButton save;
    private javax.swing.JTable tableOfdata;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
