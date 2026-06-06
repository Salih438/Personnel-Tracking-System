import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        personel personel=new personel("salih","yazılım mühendisi",15000,0.15);

        int seçim;
        do {
            System.out.println("Hangi işlemi yapmak istersiniz:\n1.Zam yap\n2.Bonus ekle\n3.Bilgileri göster\n4.Çıkış yap");
            seçim=scanner.nextInt();
            switch (seçim){
                case 1:
                    System.out.println("Zam oranını giriniz:");
                    double zamoranı= scanner.nextDouble();
                    personel.zamyap(zamoranı);
                    break;
                case 2:
                    System.out.println("Bonus miktarını giriniz:");
                    double bonusmiktarı= scanner.nextInt();
                    personel.bonusekle(bonusmiktarı);
                    break;
                case 3:
                    personel.bilgigöster();
                    break;
                case 4:
                    System.out.println("Sistemden çıkış yapılıyor. ");
                    break;
                default:
                    System.out.println("Geçersiz işlem girildi. Lütfen 1-4 arasında bir değer giriniz.");
                            break;
            }
        }while (seçim!=4);








    }
}