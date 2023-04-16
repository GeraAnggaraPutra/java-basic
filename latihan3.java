public class latihan3{
    public static void main(String args[]){
        //persegi
        int sisi = 12,persegi1,persegi2;
        persegi1 = sisi * sisi;
        persegi2 = 4 * sisi;
        //persegi panjang
        int panjang = 8, lebar = 6,luas,keliling;
        luas = panjang * lebar;
        keliling = 2*(panjang+lebar);
        //segitiga
        int alas = 20, tinggi = 30,s1 = 10,s2 = 20,s3 =30,keliling1;
        double luas1;
        luas1 = 0.5*alas * tinggi;
        keliling1 = s1 + s2 + s3;
        //lingkaran
        double phi = 3.14, luas2, keliling2;
        int r = 15, d = 87;
        luas2 = phi*r*r;
        keliling2 = phi * d;

        System.out.println("Program Dasar Menghitung Luas Dan Keliling Bangun");
        System.out.println("");
        System.out.println("Macam - Macam Bangun Datar : ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("");
        System.out.println("Bangun Datar 1 : Persegi");
        System.out.println("Diketahui sisi persegi : "+sisi);
        System.out.println("Mencari luas persegi = sisi * sisi");
        System.out.println("Mencari keliling persegi = 4 * sisi");
        System.out.println("Maka hasil luas persegi adalah : "+persegi1);
        System.out.println("Maka hasil keliling persegi adalah : "+persegi2);
        System.out.println("");
        System.out.println("Bangun Datar 2 : Persegi Panjang");
        System.out.println("Diketahui panjang persegi panjang : 8");
        System.out.println("Diketahui lebar persegi panjang : 6");
        System.out.println("Mencari luas persegi panjang = panjang * lebar");
        System.out.println("Mencari keliling persegi panjang = 2(p+l)");
        System.out.println("Maka hasil luas persegi panjang adalah : "+ luas);
        System.out.println("Maka hasil keliling persegi panjang adlah : "+ keliling);
        System.out.println("");
        System.out.println("Bangun Datar 3 : Segitiga");
        System.out.println("Diketahui alas = 20, tinggi = 30");
        System.out.println("Diketahui s1 = 10, s2 = 20, s3 = 30");
        System.out.println("Mencari luas segitiga = 1/2 * a * t");
        System.out.println("Mencari keliling segitiga = s1 + s2 + s3");
        System.out.println("Maka hasil luas segitiga adalah : "+ luas1);
        System.out.println("Maka hasil keliling segitiga adalah : "+ keliling1);
        System.out.println("");
        System.out.println("Bangun Datar 4 : Lingkaran");
        System.out.println("Diketahui phi = 3.14, r = 15, d = 87");
        System.out.println("Mencari luas lingkaran = phi*r*r");
        System.out.println("Mencari keliling lingkaran adalah = phi * d");
        System.out.println("Maka hasil luas lingkaran adalah : "+ luas2);
        System.out.println("Maka hasil keliling lingkaran adalah : "+ keliling2);
        System.out.println("");
        System.out.println("Program Selesai Terima Kasih");

    }
}