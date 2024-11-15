import javax.swing.JOptionPane;
public class Ejercicio_5 {
    public static void main(String[] args){
        double R=0, H=0, area, volumen;
       
        R= Double.parseDouble(JOptionPane.showInputDialog("ingresa la longuitud del radio"));
        H= Double.parseDouble(JOptionPane.showInputDialog(" ingresa la altura"));
        volumen= ((3.1415926)*(R*R))*H;
        area= ((2)*(3.1415926)*((R*H)));
        
        JOptionPane.showMessageDialog(null,"el valor del area es"+ area+"centimetros cuadrados y el valor del volumen es"+ volumen+"centimetros cubicos");
    }
    
}
