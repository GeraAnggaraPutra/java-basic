import java.util.Scanner;
public class array{
	public static void main(String[] args) {
		int a,b;
		Scanner jay = new Scanner(System.in);
		int kolom;
        int baris;
        
        System.out.print("Masukan jumlah baris matrix : ");
        baris = jay.nextInt();
        System.out.print("Masukan jumlah kolom matrix : ");
        kolom = jay.nextInt();

        int [][] x = new int [100][100];
        int [][] y = new int [100][100];
        int [][] z = new int [100][100];
        
        System.out.println("Masukan data : ");
        System.out.println("matrix 1 ");
        for (int c = 0;c < baris ;c++ ) {
        	for (int d = 0;d < kolom ;d++ ) {
        		System.out.print("bil baris ke - "+(c+0)+" kolom ke - "+d+" : ");
        		x[c][d] = jay.nextInt();
        	}
        }
        System.out.println();
        System.out.println("Matrix 2");
        for (int c = 0;c < baris ;c++ ) {
        	for (int d = 0;d < kolom ;d++ ) {
        		System.out.print("bil baris ke - "+c+" kolom ke - "+d+" : ");
        		y[c][d] = jay.nextInt();
        	}
        }
        System.out.println("Matrix 1");
        for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				System.out.print( x[c][d]+ " ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2");
		  for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				System.out.print( y[c][d]+ " ");
			}
			System.out.println();
		}
		System.out.println("penjumlahan matrix");
		for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				z[c][d] = x[c][d] + y[c][d];
				System.out.print(x[c][c]+" + "+y[c][d]+" = "+z[c][d]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("pengurangan matrix");
		for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				z[c][d] = x[c][d] - y[c][d];
				System.out.print(x[c][c]+" - "+y[c][d]+" = "+z[c][d]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("Perkalian Matrix");
		for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				z[c][d] = x[c][d] * y[c][d];
				System.out.print(x[c][c]+" x "+y[c][d]+" = "+z[c][d]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("Pembagian Matrix");
        for (int c = 0;c < baris ;c++ ) {
			for (int d = 0;d < kolom ;d++ ) {
				z[c][d] = x[c][d] / y[c][d];
				System.out.print(x[c][c]+" % "+y[c][d]+" = "+z[c][d]);
				System.out.print("\t");
			}
			System.out.println();
		}		
	}
}