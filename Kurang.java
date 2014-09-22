import java.util.Scanner;
public class Kurang {
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Pengurangan");
        System.out.print("Masukkan Angka Pertama :");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua :");
        int angka2 = input.nextInt();
        int hasil = angka1-angka2;
        System.out.print("Hasil Pengurangannya adalah :" + hasil);
    }
    
}