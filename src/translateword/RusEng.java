
package translateword;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Locale;

public class RusEng extends javax.swing.JFrame {
  private static final String Username =    "root";
   private static final String Password =    "root";
   private static final String Conn_String = "jdbc:mysql://localhost/wordsworld?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   Connection conn=null;
   String idr=null;
   String ide=null;
   String idrec=null;
   String rec=null;
   int score=0;
    public RusEng() {
        initComponents();
         check.setEnabled(false);
    
         try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id, record from wordsworld.recordsofrus ORDER BY id DESC LIMIT 1;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        rec = rs.getString("record");
        idrec = rs.getString("id");
        System.out.println(idrec + "\n");
        record.setText("Record: "+rec);
        }
    }catch(SQLException e){
        System.err.print(e);
    }  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        record = new java.awt.Label();
        t3 = new java.awt.TextField();
        t2 = new java.awt.TextField();
        correctAn = new java.awt.Label();
        answer = new java.awt.Label();
        start = new java.awt.Button();
        check = new java.awt.Button();
        mm = new javax.swing.JButton();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Русский");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("English");

        record.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        record.setForeground(new java.awt.Color(0, 0, 204));

        t3.setEnabled(false);
        t3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        t2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        correctAn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        answer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 255, 0));

        start.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        start.setLabel("Старт");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        check.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        check.setLabel("Проверить");
        check.setName(""); // NOI18N
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        mm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
        });

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about.png"))); // NOI18N
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(record, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(correctAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mm)
                    .addComponent(about))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(correctAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
      check.setEnabled(true);
   t2.getInputContext().selectInputMethod( new Locale ("en","US"));
    try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id, rus from wordsworld.vocabulary order by rand() limit 1;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String rus = rs.getString("rus");
        idr = rs.getString("id");
        System.out.println(idr + "\n");
        t3.setText(rus);
        }
    }catch(SQLException e){
        System.err.print(e);
    }  
    start.setEnabled(false);            // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
 
     String second=t2.getText();
     System.out.println(second);
     
    try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id from wordsworld.vocabulary where en='"+second+"' ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       
        ide = rs.getString("id");
        System.out.println(ide + "\n");
        
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     
     
     if (idr.equals(ide)){
            t2.setText("");
         score+=1;
         answer.setText("Your score "+score);
         try{
             conn = DriverManager.getConnection(Conn_String,Username,Password);
             System.out.println("Connection is working for second time");
             Statement stmt = (Statement) conn.createStatement();   
             String newWord="select rus,id from wordsworld.vocabulary where norepeat=0 order by rand() limit 1;";
              ResultSet rs=stmt.executeQuery(newWord);
         while (rs.next())
             {
                String rus = rs.getString("rus");
                idr = rs.getString("id");
                System.out.println(idr + "\n");
                t3.setText(rus);
                correctAn.setText("");
         }
         int iden=Integer.parseInt(idr);
         newWord="update wordsworld.vocabulary set norepeat= "+1+" where id="+iden +";";
         stmt.executeUpdate(newWord);
         }catch (SQLException e){
            System.err.println(e); 
         }
        
     }
     else{
            t2.setText("");
         score+=0;
          answer.setText("Your score "+score);
          try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String select="select en from wordsworld.vocabulary where id="+idr+" ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String en = rs.getString("en");
        System.out.println(ide + "\n");
        correctAn.setText("Correct answer: "+en);
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     }
     int ider =Integer.parseInt(rec);
     
     if(score>ider){
         java.util.Date dt = new java.util.Date();
         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String currentTime = sdf.format(dt);
         System.out.println(currentTime);
            try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String insert="insert into wordsworld.recordsofrus (record,dtOfrecord) values("+score+",'"+currentTime+"');";
       stmt.executeUpdate(insert);
        
        record.setText("Record: "+score);
        
    }catch(SQLException e){
        System.err.print(e);
    }
     }        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
 if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
          String second=t2.getText();
     System.out.println(second);
     
    try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id from wordsworld.vocabulary where en='"+second+"' ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       
        ide = rs.getString("id");
        System.out.println(ide + "\n");
        
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     
     
     if (idr.equals(ide)){
            t2.setText("");
         score+=1;
         answer.setText("Your score "+score);
         try{
             conn = DriverManager.getConnection(Conn_String,Username,Password);
             System.out.println("Connection is working for second time");
             Statement stmt = (Statement) conn.createStatement();   
             String newWord="select rus,id from wordsworld.vocabulary where norepeat=0 order by rand() limit 1;";
              ResultSet rs=stmt.executeQuery(newWord);
         while (rs.next())
             {
                String rus = rs.getString("rus");
                idr = rs.getString("id");
                System.out.println(idr + "\n");
                t3.setText(rus);
                correctAn.setText("");
         }
         int iden=Integer.parseInt(idr);
         newWord="update wordsworld.vocabulary set norepeat= "+1+" where id="+iden +";";
         stmt.executeUpdate(newWord);
         }catch (SQLException e){
            System.err.println(e); 
         }
        
     }
     else{
            t2.setText("");
         score+=0;
          answer.setText("Your score "+score);
          try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String select="select en from wordsworld.vocabulary where id="+idr+" ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String en = rs.getString("en");
        System.out.println(ide + "\n");
        correctAn.setText("Correct answer: "+en);
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     }
     int ider =Integer.parseInt(rec);
     
     if(score>ider){
         java.util.Date dt = new java.util.Date();
         java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String currentTime = sdf.format(dt);
         System.out.println(currentTime);
            try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String insert="insert into wordsworld.recordsofrus (record,dtOfrecord) values("+score+",'"+currentTime+"');";
       stmt.executeUpdate(insert);
        
        record.setText("Record: "+score);
        
    }catch(SQLException e){
        System.err.print(e);
    }
     }  
        }             // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
        setVisible(false);
        new MainMenu().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_mmMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
 AboutTW dialog = new AboutTW(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);      // TODO add your handling code here:
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
    private java.awt.Label answer;
    private java.awt.Button check;
    private java.awt.Label correctAn;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton mm;
    private java.awt.Label record;
    private java.awt.Button start;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    // End of variables declaration//GEN-END:variables
}
