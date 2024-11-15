import javax.swing.JOptionPane;
public class Ejercicio_3 {
    public static void main(String[] args){
        short catA=0,catB=0;
        byte Hipotenusa;
        catA= Short.parseShort(JOptionPane.showInputDialog("dale un valor a A"));
        catB= Short.parseShort(JOptionPane.showInputDialog("dale un valor a B"));
        Hipotenusa= (byte) Math.sqrt(catA+catB);
         JOptionPane.showMessageDialog(null,"el valor de Hipotenusa es"+ Hipotenusa);
        
        
    }
    
}
