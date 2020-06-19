import java.util.Scanner;
public class soal3{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    System.out.print("Berapakah Panjang Karakter Yang Anda Inginkan : "); //KETIK 8 JIKA INGIN MEMASUKAN DUMBWAYS ATAU 4 UNTUK COOL, INPUT PER KARAKTER
    int panjangKarakter= input2.nextInt();
    String[] drawLine = new String [panjangKarakter];
    for( int i = 0; i < panjangKarakter; i++ ){
            System.out.print("Karakter " + i + ": ");
            drawLine[i] = input.nextLine();
        }
    try {

    for (int i = 0;i <=drawLine.length ; i++ ) {
      for (int x = 0; x<i ;x++ ) {
        System.out.print(" ");

      }
      System.out.println(drawLine[i]);

    }
    System.out.println(" ");
  }
  catch (Exception e) {
    System.out.print("");
    }
  }
}
