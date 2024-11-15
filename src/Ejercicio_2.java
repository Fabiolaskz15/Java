import javax.swing.JOptionPane;
public class Ejercicio_2 {
     public static void main(String[] args) {
          short A, B, C;
         A= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a A"));
         B= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a B"));
         C= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a c"));
         if (A > B & B > C){
             JOptionPane.showMessageDialog(null,""+ A + "Es mayor");
         }else if(B>A & B>C){
             JOptionPane.showMessageDialog(null,""+ B + "Es el mayor");
         }else{
             JOptionPane.showMessageDialog(null,""+ C + "Es mayor");
             
         }
             
     }
}