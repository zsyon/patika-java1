/**
 * notOrtHesaplama
 */
import java.util.Scanner;
import java.util.SortedMap;

public class notOrtHesaplama {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int mat ,fizik ,kimya ,turce, tarih, muzuk ,ort;

    System.out.print("Matematik Notu :");
    mat = input.nextInt();

    System.out.print("Fizik Notu :");
    fizik = input.nextInt();

    System.out.print("Kimya Notu :");
    kimya = input.nextInt();

    System.out.print("Türkçe Notu :");
    turce = input.nextInt();

    System.out.print("Tarih Notu :");
    tarih = input.nextInt();

    System.out.print("Müzik Notu :");
    muzuk = input.nextInt();

  }
}