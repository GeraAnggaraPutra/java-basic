public class contoh12{
    public static void main(String args[]){
        int i,j,temp;
        int bil[] = { 7,4,6,3,8,2,9,1,5,0};
        //menampilkan data sebelum di urutkan 
        System.out.println("Data sebelum diurutkan");
        for (i = 0; i < 10; i++)
            System.out.print(bil[i] + " ");
            //Bubble sort
            for (i = 0; i < 9; i++)
               for(j = 0; j < 9; j++)
               if (bil[j + 1] < bil[j]){
                   temp = bil[j];
                   bil[j] = bil[j + 1];
                   bil[j + 1] = temp;
               }
        
        //menampilkan data setelah diurutkan
        System.out.println("\nData setelah diurutkan:");
        for(i = 0;i < 10; i++)
           System.out.print(bil[i] + " ");
    }
}