import java.util.Random; 
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Color; 
import org.bukkit.FireworkEffect; 
import org.bukkit.FireworkEffect.Type; 
import org.bukkit.Location; 
import org.bukkit.entity.Firework; 
import org.bukkit.inventory.meta.FireworkMeta; 
import org.bukkit.scheduler.BukkitRunnable; 
/*
It's not working(((
*/
public class NewJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public NewJInternalFrame() {
        initComponents();
       
    }
/*
 public static class Fireworks { 
 private static Fireworks instance = new Fireworks(); 
 private Random ran = new Random(); 
 
 
 public static Fireworks getInstance() { 
  return instance; 
 } 
 

 public void launchRandomFirework(Location loc) { 
  Firework item = loc.getWorld().spawn(loc, Firework.class); 
  FireworkMeta meta = item.getFireworkMeta(); 
 
  if (ran.nextBoolean()) { 
   meta.addEffect(FireworkEffect.builder().flicker(ran.nextBoolean()).trail(ran.nextBoolean()).with(randomType()).withColor(randomColor()).withFade(randomColor()).build()); 
  } else { 
   meta.addEffect(FireworkEffect.builder().flicker(ran.nextBoolean()).trail(ran.nextBoolean()).with(randomType()).withColor(randomColor()).build()); 
  } 
 
  meta.setPower(1); 
  item.setFireworkMeta(meta); 
 } 
  
 
 public void startFireworkShow() { 
     BukkitRunnable runTaskTimer; 
     runTaskTimer = new BukkitRunnable() { 
         int i = 0;
         
         public void run() {
             int x = ran.nextInt(50 * 2) - 50;
             int z = ran.nextInt(50 * 2) - 50;
             
             Location loc = null;
         /*    try {
                 loc = Main.getSpawn().clone().add(x, 0, z);
             } catch (CloneNotSupportedException ex) {
                 Logger.getLogger(NewJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
             Location Location;setY
             Location = loc.setY(LocationUtils.getHighestBlock(loc).getY());
             
             launchRandomFirework(loc.add(0, 1, 0));
             
             i++;
             
             if (i == 200) {
                 cancel();
             }
         }
     }.runTaskTimer(Main.plugin, 20, 5); 
 
         } 
  
 
 private Color randomColor() { 
  return Color.fromBGR(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)); 
 } 
 

 private Type randomType() { 
  return Type.values()[ran.nextInt(Type.values().length)]; 
 } 
}
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
