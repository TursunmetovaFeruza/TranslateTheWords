package translateword;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Locale;
import javax.swing.JTextField;

 
public class EngRus extends javax.swing.JFrame {
  private static final String Username =    "root";
   private static final String Password =    "root";
   private static final String Conn_String = "jdbc:mysql://localhost/wordsworld?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   Connection conn=null;
   String idr=null;
   String ide=null;
   String idrec=null;
   String rec=null;
   int score=0;
  
    public EngRus() {
        initComponents();
        check.setEnabled(false);
        
        System.out.println(t2);
         try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id, record from wordsworld.recordsOfeng ORDER BY id DESC LIMIT 1;";
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

        t2 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        check = new java.awt.Button();
        t3 = new java.awt.TextField();
        start = new java.awt.Button();
        answer = new java.awt.Label();
        correctAn = new java.awt.Label();
        record = new java.awt.Label();
        mm = new javax.swing.JButton();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("English");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Русский");

        check.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        check.setLabel("Check");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        t3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t3.setEnabled(false);
        t3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        start.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        start.setLabel("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        answer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 255, 0));

        correctAn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        correctAn.setForeground(new java.awt.Color(255, 0, 0));

        record.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        record.setForeground(new java.awt.Color(0, 0, 204));

        mm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
        });
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(correctAn, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(record, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(record, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mm)
                    .addComponent(about))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(correctAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
      check.setEnabled(true);

t2.getInputContext().selectInputMethod( new Locale ("ru","RU"));//language and country
    try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id, en from wordsworld.vocabulary order by rand() limit 1;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String en = rs.getString("en");
        ide = rs.getString("id");
        System.out.println(ide + "\n");
        t3.setText(en);
        }
    }catch(SQLException e){
        System.err.print(e);
    }  
    start.setEnabled(false);    
    }//GEN-LAST:event_startActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
     String first=t3.getText();
     String second=t2.getText();
     System.out.println(second);
     
    try{
        conn = DriverManager.getConnection(Conn_String,Username,Password);
        System.out.println("Connection is working for second time");
        Statement stmt = (Statement) conn.createStatement();
        String select="select id from wordsworld.vocabulary where rus='"+second+"' ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       
        idr = rs.getString("id");
        System.out.println(idr + "\n");
        
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     
     
     if (ide.equals(idr)){
            t2.setText("");
         score+=1;
         answer.setText("Your score "+score);
         try{
             conn = DriverManager.getConnection(Conn_String,Username,Password);
             System.out.println("Connection is working for second time");
             Statement stmt = (Statement) conn.createStatement();   
             String newWord="select en,id from wordsworld.vocabulary where norepeat=0 order by rand() limit 1;";
              ResultSet rs=stmt.executeQuery(newWord);
         while (rs.next())
             {
                String en = rs.getString("en");
                ide = rs.getString("id");
                System.out.println(ide + "\n");
                t3.setText(en);
                correctAn.setText("");
         }
         int iden=Integer.parseInt(ide);
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
        String select="select rus from wordsworld.vocabulary where id="+ide+" ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String rus = rs.getString("rus");
        System.out.println(idr + "\n");
        correctAn.setText("Correct answer: "+rus);
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
        String insert="insert into wordsworld.recordsOfeng (record,dtOfrecord) values("+score+",'"+currentTime+"');";
       stmt.executeUpdate(insert);
        
        record.setText("Record: "+score);
        
    }catch(SQLException e){
        System.err.print(e);
    }
     }
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
        String select="select id from wordsworld.vocabulary where rus='"+second+"' ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
       
        idr = rs.getString("id");
        System.out.println(idr + "\n");
        
        }
    }catch(SQLException e){
        System.err.print(e);
    }
     
     
     if (ide.equals(idr)){
            t2.setText("");
         score+=1;
         answer.setText("Your score "+score);
         try{
             conn = DriverManager.getConnection(Conn_String,Username,Password);
             System.out.println("Connection is working for second time");
             Statement stmt = (Statement) conn.createStatement();   
             String newWord="select en,id from wordsworld.vocabulary where norepeat=0 order by rand() limit 1;";
              ResultSet rs=stmt.executeQuery(newWord);
         while (rs.next())
             {
                String en = rs.getString("en");
                ide = rs.getString("id");
                System.out.println(ide + "\n");
                t3.setText(en);
                correctAn.setText("");
         }
         int iden=Integer.parseInt(ide);
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
        String select="select rus from wordsworld.vocabulary where id="+ide+" ;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next())
        {
        String rus = rs.getString("rus");
        System.out.println(idr + "\n");
        correctAn.setText("Correct answer: "+rus);
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
        String insert="insert into wordsworld.records (record,dtOfrecord) values("+score+",'"+currentTime+"');";
       stmt.executeUpdate(insert);
        
        record.setText("Record: "+score);
        
    }catch(SQLException e){
        System.err.print(e);
    }
     }       
        }     // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

    private void mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmActionPerformed
    new EngRus().setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mmActionPerformed

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
       setVisible(false);
        new MainMenu().setVisible(true);
        // TODO add your handling code here:
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
                dialog.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
           
           public void run() {
                new MainMenu().setVisible(true);
   
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
