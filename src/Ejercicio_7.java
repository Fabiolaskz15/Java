import javax.swing.JOptionPane;
public class Ejercicio_7 {
    public static void main(String[] args){
        short NuevaNota;
        NuevaNota= Short.parseShort(JOptionPane.showInputDialog("ingresa el registro de la nota"));
        if (NuevaNota>=19 && NuevaNota<=20){
        JOptionPane.showMessageDialog(null,"Tu nota es=A");
    }else if (NuevaNota>=16 && NuevaNota<=18){
        JOptionPane.showMessageDialog(null,"Tu nota es=B");
    } else if (NuevaNota>=13 && NuevaNota<=15){
        JOptionPane.showMessageDialog(null,"Tu nota es=C");
    }else if (NuevaNota>=10 && NuevaNota<=12){
        JOptionPane.showMessageDialog(null,"Tu nota es=D");
    }else if(NuevaNota>=1 && NuevaNota<=9){
        JOptionPane.showMessageDialog(null,"Tu nota es=E");
    }
    
    
    }
    
}
