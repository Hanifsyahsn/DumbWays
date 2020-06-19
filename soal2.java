//Created by Hanif
import java.util.Scanner;
public class soal2{
public static final int panjangPassword = 8;
public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Password Maksimal Mengandung 8 Karakter");
        System.out.println("Password Minimal Mengandung 1 Huruf Kecil");
        System.out.println("Password Minimal Mengandung 1 Huruf Besar");
        System.out.println("Password Minimal Mengandung 1 Angka");
        System.out.println("Dan Password Minimal Mengandung 1 Symbol");
        System.out.print("Buat Password :");
        String password = input.nextLine();
        if (isPassword(password)) {
            System.out.println("Password Berhasil Dibuat " + password + " Adalah Password Anda");
        } else {
            System.out.println("Password Tidak Berhasil Dibuat atau Salah");
        }
    }
    public static boolean isPassword(String passwordCheck) {
        if (passwordCheck.length() < panjangPassword) return false;
        int hurufKapital = 0;
        int hurufKecil = 0;
        int nomor = 0;
        int simbol = 0;
        for (int i = 0; i < passwordCheck.length(); i++) {
            char x = passwordCheck.charAt(i);
            if (kapital(x)) hurufKapital++;
            else if(kecil(x)) hurufKecil++;
            else if (number(x)) nomor++;
            else if(symbol(x)) simbol++;
            else return false;
        }
        return (hurufKapital >= 1 && hurufKecil >= 1 && nomor >= 1 && simbol >=1);
    }
    public static boolean kapital(char x) {
        return (x >= 'A' && x <= 'Z');
    }
    public static boolean kecil(char x) {
        return (x >= 'a' && x <= 'z');
    }
    public static boolean number(char x) {
        return (x >= '0' && x <= '9');
    }
    public static boolean symbol(char x) {
        return (x >= '!' && x <= ')');
    }
}
