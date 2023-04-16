import java.util.Scanner;
public class latihan18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String m;
        boolean run = true;
        while(run){
        System.out.println("");
        System.out.println("Selamat Datang Di Program Latihan Array :");
        System.out.println("1. Program Array 1 Dimensi");
        System.out.println("2. Program Array 2 Dimensi");
        System.out.println("3. Program Array Bubble Sort");
        System.out.println("");
        int pilih;
        System.out.print("Input pilihan :");
        pilih = scan.nextInt();
        System.out.println("");
        switch(pilih){
            case 1:
            System.out.println("1. Selamat Datang Di Program Array Nilai Siswa 1 Dimensi");
            System.out.println("");
            int a,s,g = 0;
            float rata, total = 0;
            int bil[] = new int[99];
            System.out.print("Berapa jumlah siswa? ");
            a = scan.nextInt();
            for(s = 0; s < a; s++){
                System.out.print("Nilai ujian siswa ke " + (s + 1) + " : ");
                bil[s] = scan.nextInt();
                total = total + bil[s];
            }
            System.out.println("");
            rata = total / a;
            System.out.println("Nilai rata-rata hasil ujian siswa adalah : " + rata);
            for(int d = 0; d < a; d++){
                if(bil[d] > rata){
                    g = g + 1;
                }
            }
            System.out.println("Siswa dengan nilai di atas rata - rata " + g + " orang");
            System.out.println("");
            System.out.print("Mulai ulang aplikasi? (y/n) ");
            m = scan.next();
            if(m.equalsIgnoreCase("y")){
                run = true;
            }else{
                run = false;
            System.out.println("");
            System.out.println("Program Selesai Terima kasih");
            }
            break;
            case 2:
            System.out.println("2. Selamat Datang Di Program Matrix Array 2 Dimensi");
            System.out.println("");
            int [][] x = {{1, 2}, {5, 6}};
	     	int [][] y = {{3, 4}, {7, 8}};
		    int baris = 2;
	     	int kolom = 2;
		    int [][] z = new int [baris][kolom];
		    System.out.println("matrix A");
		    for (int b = 0;b < baris ;b++ ) {
		    	for (int j = 0;j < kolom ;j++ ) {
		    		System.out.print(x [b][j] + " ");
		    	}
		    	System.out.println();
	    	}
	        System.out.println("matrix B");
		    for (int b = 0;b < baris ;b++ ) {
			for (int j = 0;j < kolom ;j++ ) {
				System.out.print(y[b][j] + " ");
			}
			System.out.println();
	    	}
	    	System.out.println("proses penjumlahan Martix A dan Martix B");
	    	for (int b = 0;b < baris ;b++ ) {
			for (int j = 0;j < kolom ;j++ ) {
				z[b][j] = x[b][j] + y[b][j];
				System.out.print(x[b][j] + " + " + y [b][j] + " = " + z[b][j] + "     " );
			}
			System.out.println();
	    	}
	     	System.out.println("hasil penjumlahan Martix A dan Martix B");
     		for (int b = 0;b < baris ;b++ ) {
			for (int j = 0;j < kolom ;j++ ) {
				z[b][j] = x[b][j] + y[b][j];
				System.out.print(z[b][j] + "   ");
			}
			System.out.println();
	    	}
            System.out.println();
            System.out.print("Mulai ulang aplikasi? (y/n) ");
            m = scan.next();
            if(m.equalsIgnoreCase("y")){
                run = true;
            }else{
                run = false;
                System.out.println("");
                System.out.println("Program Selesai Terima kasih");
            }
            break;
            case 3:
            System.out.println("3. Selamat Datang Di Program Array Bubble Sort");
            System.out.println("");
            int i, j, temp;
            int b[] = {29, 13, 10, 7, 34, 21, 4, 54, 30};
            System.out.println("PROGRAM PENGURUTAN SECARA ASCENDING");
            System.out.println("===================================");
            System.out.println("");
            System.out.println("Data sebelum diurutkan :");
             for (i = 0; i < 9; i++){
            System.out.print(b[i] + " ");
             }
            System.out.println("");
            System.out.println("");
            System.out.println("Setelah data diurutkan :");
            for(i = 0; i < 8; i++){
                for(j = 0; j < 8; j++){
                    if (b[j + 1] < b[j]){
                   temp = b[j];
                   b[j] = b[j + 1];
                   b[j + 1] = temp;
                  }
                }
            }
                for(i = 0;i < 9; i++){
                    System.out.print(b[i] + " ");
                }
            System.out.println();
            System.out.println();
            System.out.println("PROGRAM PENGURUTAN SECARA DESCENDING");
            System.out.println("====================================");
            System.out.println();
            System.out.println("Data sebelum diurutkan :");
            for(i = 0;i < 9; i++){
                System.out.print(b[i] + " ");
            }    
            System.out.println("");
            System.out.println("");
            System.out.println("Setelah data diurutkan :");
             for(i = 0; i < 8; i++){
                for(j = 0; j < 8; j++){
                    if (b[j + 1] > b[j]){
                   temp = b[j];
                   b[j] = b[j + 1];
                   b[j + 1] = temp;
                }
               }
            }
            for(i = 0; i < 9;i++){
                System.out.print(b[i] + " ");
            }
            System.out.println("");
            System.out.println("");
            System.out.print("Mulai ulang aplikasi? (y/n) ");
            m = scan.next();
            if(m.equalsIgnoreCase("y")){
                run = true;
            }else{
                run = false;
            System.out.println("");
            System.out.println("Program Selesai Terima kasih");
            }
            break;
            default:
            System.out.println("MAAF PILIHAN YANG ANDA MASUKAN TIDAK ADA!");
            System.out.println("SILAHKAN PILIH KEMBALI");
            System.out.println();
            System.out.print("Mulai ulang aplikasi? (y/n) ");
            m = scan.next();
            if(m.equalsIgnoreCase("y")){
                run = true;
            }else{
                run = false;
               System.out.println("");
               System.out.println("Program Selesai Terima kasih");
            }
            break;
          } 
       }       
    }   
}