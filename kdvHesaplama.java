import java.util.Scanner;

public class kdvHesaplama {
  public static void main(String[] args) {

    double tutar, Kdv = 0.18;
    Scanner input = new Scanner(System.in);

    System.out.print("Ücret Tutarını Giriniz : ");
    tutar = input.nextDouble();

    double kdvli = (Kdv*tutar) + tutar;
    double kdvTutari = kdvli - tutar;

    System.out.println("KDV'siz Fiyat : " + tutar);
    System.out.println("KDV'li Fiyat : " + kdvli);
    System.out.println("KDV Tutarı : " + kdvTutari);



    
  }
  
}
