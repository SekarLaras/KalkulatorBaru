import java.util.Scanner;
public class Bagi {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Pembagian");
        System.out.print("Masukkan Angka Pertama :");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua :");
        int angka2 = input.nextInt();
        int hasil = angka1/angka2;
        System.out.print("Hasil Pembagiannya adalah :" + hasil);
    }
    
}