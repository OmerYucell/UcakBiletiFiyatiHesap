import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, yas, normalTutar, yasindirimi, indirimliTutar,gidisDonusBilet,toplamTutar ;

        int yolculukTipi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek Mesafeyi Giriniz :");
        mesafe = inp.nextInt();

        System.out.print("Yasinizi Giriniz :");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipi 1 Gidiş 2 Gidis Donus :");
        yolculukTipi = inp.nextInt();
        if (mesafe >1){

            switch (yolculukTipi) {
                case 1:
                    if (yas <12) {
                        normalTutar = mesafe * 0.10;

                        yasindirimi = normalTutar * 0.50;
                        toplamTutar = normalTutar - yasindirimi;
                        System.out.println("Bilet Fiyatı" + toplamTutar +"TL");

                    }if (yas >=12 && yas < 25) {

                    normalTutar = mesafe * 0.10;
                    yasindirimi = normalTutar * 0.10;
                    toplamTutar = normalTutar - yasindirimi;

                    System.out.println("Bilet Fiyati : " + toplamTutar +"TL");

                    }if (yas >=25 && yas <64){
                    normalTutar = mesafe * 0.10;
                    toplamTutar = normalTutar;

                    System.out.println("Bilet Fiyatı" + toplamTutar +"TL");
                }if (yas >=64) {

                    normalTutar = mesafe * 0.10;
                    yasindirimi = normalTutar * 0.30;
                    toplamTutar = normalTutar - yasindirimi;
                    System.out.println("Bilet Fiyatı" + toplamTutar +"TL");


                    }break;

                case 2:
                    if (yas >=1 && yas <12) {
                        normalTutar = mesafe * 0.10;

                        yasindirimi = normalTutar * 0.50;
                        indirimliTutar = normalTutar - yasindirimi;
                        gidisDonusBilet = indirimliTutar * 0.20;
                        toplamTutar = (indirimliTutar - gidisDonusBilet)*2;

                        System.out.println("Bilet Fiyatı" + toplamTutar +"TL");
                    }if (yas >=12 && yas <=24) {
                    normalTutar = mesafe * 0.10;

                    yasindirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasindirimi;
                    gidisDonusBilet = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusBilet)*2;
                    System.out.println("Bilet Fiyatı" + toplamTutar +"TL");
                }if (yas >=25 && yas <64){
                    normalTutar = mesafe * 0.10;



                    gidisDonusBilet = normalTutar * 0.20;
                    toplamTutar = (normalTutar - gidisDonusBilet)*2;
                    System.out.println("Bilet Fiyatı" + toplamTutar +"TL");
                }if (yas >=64) {
                    normalTutar = mesafe * 0.10;

                    yasindirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasindirimi;
                    gidisDonusBilet = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusBilet)*2;
                    System.out.println("Bilet Fiyatı" + toplamTutar +"TL");


                }
                    default:
                    System.out.println("Hatalı Giriş yaptınız");
            }




        }else {
            System.out.println("Hatalı Giriş yaptınız");
        }



    }

}
