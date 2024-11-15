import javax.swing.JOptionPane;
public class Ejercicio_6 {
     public static void main(String[] args){
         short N;
         N= Short.parseShort(JOptionPane.showInputDialog("Asigna un valor a N"));
         if (N % 2 ==0.){
             JOptionPane.showMessageDialog(null,"es par");
         }else{
             JOptionPane.showMessageDialog(null,"es impar");
         }
     }
    
}