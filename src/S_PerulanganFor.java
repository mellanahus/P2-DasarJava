// percobaan menggunakan perulangan for

import java.util.Scanner;
public class S_PerulanganFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan : ");
        int jml = input.nextInt();
        for(int i=0; i<jml; i++)
            System.out.println("Pemrograman Berorientasi Objek");
    }
}
