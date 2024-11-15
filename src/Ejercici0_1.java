import javax.swing.JOptionPane;
public class Ejercici0_1 { 
     public static void main(String[] args) {
         short A=0, B=0;
         A= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a A"));
         B= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a B"));
         
         if (A==B) {
             JOptionPane.showMessageDialog(null,""+ A+"es igual"+B);
         }else if (A>B){
             JOptionPane.showMessageDialog(null,""+ A+"es mayor"+B);
         } else{
             JOptionPane.showMessageDialog(null,""+ B+"es mayor que"+A);
         }
     }
}
