/**
 * notOrtHesaplama
 */
import java.util.Scanner;
import java.util.SortedMap;

public class notOrtHesaplama {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    float mat ,fizik ,kimya ,turce, tarih, muzuk;

    System.out.print("Matematik Notu :");
    mat = input.nextFloat();

    System.out.print("Fizik Notu :");
    fizik = input.nextFloat();

    System.out.print("Kimya Notu :");
    kimya = input.nextFloat();

    System.out.print("Türkçe Notu :");
    turce = input.nextFloat();

    System.out.print("Tarih Notu :");
    tarih = input.nextFloat();

    System.out.print("Müzik Notu :");
    muzuk = input.nextFloat();

    float ort;

    ort = (mat+fizik+kimya+turce+tarih+muzuk) / 6 ;
    System.out.print("Derlerin ortalaması : ");
    System.out.print(ort);

  }
}