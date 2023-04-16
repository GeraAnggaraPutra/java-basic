import java.util.Scanner;
public class latihan12{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Program Ganjil Genap Dalam Java");
        System.out.println("");
        System.out.print("Silahkan masukan angka(x) : ");
        x = scan.nextInt();
        if(x%2==0){
            if(x > 0){
                System.out.println(x + " adalah bilangan genap positif");
           }else if(x == 0){
                System.out.println("x adalah bilangan 0");
           }else{
                System.out.println(x + " adalah bilangan genap negatif");
           }
        }else{
            if(x > 0){
                System.out.println(x + " adalah bilangan ganjil positif");
            }else{
                System.out.println(x + " adalah bilangan ganjil negatif");
            }
        }
    }
}