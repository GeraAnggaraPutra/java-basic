import java.util.Scanner;
public class latihan17 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int pilih;
    String p;
    
    System.out.println("Latihan Nested For :");
    System.out.println("");
    System.out.println("level 1 :     level 2 :");
    System.out.println("1. Soal 1     4. Soal 4");
    System.out.println("2. Soal 2     5. Soal 5");
    System.out.println("3. Soal 3     6. Soal 6");
    System.out.println("");
    System.out.print("Input pilihan :"); 
    pilih = scan.nextInt();
    System.out.println("");
    switch(pilih){
    case 1:
    //mengulang kembali program
     for(p = "y";p.equals("y") || p.equals("Y");){
        System.out.println("Anda masuk latihan level 1 soal 1");
        System.out.println("");
        System.out.print("Masukan bilangan N : ");
        int baris = scan.nextInt(); //Menentukan Jumlah Baris
        //Menghitung Jumlah Baris (Outer for)
        for(int b=1; b<=baris; b++){
           
            //Mencetak Simbol * (Inner for)
            for(int s=1; s<=b; s++){
                System.out.print(s+" ");
            }
           //Membuat Baris Baru
            System.out.println();
          }
         
        System.out.println("");
        System.out.print("Ulangi program ini ? (y/n) ");
      p = scan.next();
      }
      System.out.println("");
        System.out.println("Program Selesai Terimakasih ^_^");
      break;
      case 2:
        for(p = "y";p.equals("y") || p.equals("Y");){
        System.out.println("Anda masuk latihan level 1 soal 2");
        System.out.println("");
        System.out.print("Masukan bilangan N : ");
        int baris2 = scan.nextInt();
        int a,b,u;
        for (a = baris2; a >= 1; a--) {
            for (b = baris2; b > a; b--) {

                System.out.print(" ");       
            } 
            for (u = 1; u < a+1; u++) {

                System.out.print(u+" ");
            }
            System.out.println();
        }
        System.out.print("Ulangi program ini ? (y/n) ");
      p = scan.next();
       
      }
      System.out.println("");
      System.out.println("Program Selesai Terimakasih ^_^");  
     break;
     case 3:
     for(p = "y";p.equals("y") || p.equals("Y");){
     System.out.println("Anda masuk latihan level 1 soal 3");
      System.out.println("");
      System.out.print("Masukan bilangan N : ");
      int baris3 = scan.nextInt();
      int c,c1;
      for(c = baris3;c >=0;c--){
        for(c1 = baris3;c1 > c;c1--){
              System.out.print(c1+" ");
          }
          
        System.out.println("");
      }
      System.out.print("Ulangi program ini ? (y/n) ");
      p = scan.next();  
      }
      System.out.println("");
      System.out.println("Program Selesai Terimakasih ^_^");
      break;
      case 4: 
      for(p = "y";p.equals("y") || p.equals("Y");){
      System.out.println("Anda masuk latihan level 2 soal 4");
      System.out.println("");
      System.out.print("Masukan bilangan x = ");
      int baris4 = scan.nextInt();
      
       for(int d=1; d<=baris4; d++){
           for(int d1=1; d1<=d; d1++){
                System.out.print("*");
            }
            System.out.println();
            }
         System.out.print("Ulangi program ini ? (y/n) ");
      p = scan.next();  
      }
      System.out.println("");
      System.out.println("Program Selesai Terimakasih ^_^");
     break;  
     case 5:
     for(p = "y";p.equals("y") || p.equals("Y");){
     System.out.println("Anda masuk latihan level 2 soal 5");
     System.out.println("");
     System.out.print("Masukan bilangan x = ");
     int baris5 = scan.nextInt();
     int d,s,f;
     for(d = 1;d <= baris5;d++){
       for(s= baris5;s >= d;s--){
         System.out.print(" ");
       }
       for(f=1;f<=d;f++){
         System.out.print("*");
         if(f < d){
           System.out.print("*");
         }
       }
       
       System.out.println();
     }
     System.out.print("Ulangi program ini ? (y/n) ");
      p = scan.next(); 
      }
      System.out.println("");
      System.out.println("Program Selesai Terimakasih ^_^");
     break;
    case 6:
    for(p = "y";p.equals("y") || p.equals("Y");){
    System.out.println("Anda masuk latihan level 2 soal 6");
     System.out.println("");
     System.out.print("Masukan bilangan x = ");
     int baris6 = scan.nextInt(); 
             int i, h, k;
        for (i=0; i<=baris6; i++){
             for (h=1; h<=baris6-i; h++){
                 System.out.print(" ");
             }
             for (k=1; k<=i; k++){
                 System.out.print("*");
             }
             System.out.println(); 
         }
         System.out.print("Ulangi program ini ? (y/n) ");
         p = scan.next();
      }
      System.out.println("");
      System.out.println("Program Selesai Terimakasih ^_^"); 
     break;
     default:
         System.out.println("Pilihan Tidak Ada!!"); 
        }
     }
  }