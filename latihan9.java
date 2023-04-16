import java.util.Scanner;
public class latihan9{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int nilai;
        String ket;
        System.out.print("Masukan Nilai : ");
        nilai = in.nextInt();
        if(nilai >0 && nilai <=15){
            ket = "Nilai E";
        }else if(nilai >16 && nilai <=40){
            ket = "Nilai D";
        }else if(nilai >41 && nilai <=60){
            ket = "Nilai C";
        }else if(nilai >61 && nilai <=80){
            ket = "Nilai B";
        }else if(nilai >81 && nilai <=100){
            ket = "Nilai A";
        }else{
            ket = "Nilai error";
        }

        System.out.println(ket);
    }
}