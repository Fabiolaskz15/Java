
import javax.swing.JOptionPane;
public class Ejercicio1{
 public static void main(String[] args) {
      short anio;
      byte edad;
      int anioAct=2024;
      
      anio= Short.parseShort(JOptionPane.showInputDialog("ingrese su año de nacimiento"));
      edad = (byte) (anioAct-anio);
      
      JOptionPane.showMessageDialog(null,"tu edad es:"+ edad);
    }
    
}


  