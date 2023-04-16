import java.util.Scanner;
import javax.swing.JOptionPane;

public class contoh13{
    public static void main(String args[]){

        double alas, tinggi, sisimiring, keliling;

        alas = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Alas : "));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Tinggi : "));

        sisimiring = Math.sqrt(alas * alas + tinggi * tinggi);
        keliling = alas + tinggi + sisimiring;

        JOptionPane.showMessageDialog(null, "Alas : " + alas  + "\nTinggi : " + tinggi + "\nSisi Miring : " +
        sisimiring + "\nKeliling : " + keliling, "SEGITIGA", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Alas : " + alas + "\nTinggi : " + tinggi + "\nSisi miring : " + sisimiring + 
        "\nKeliling : " + keliling);
        
    }
}