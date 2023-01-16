import java.util.Scanner;

public class BiletHesapla {

        double birimFiyat = 0.10;
        double standartBiletUcreti;
        double biletUcreti;
        Scanner input = new Scanner(System.in);

        public double sehirSec(){
            System.out.println("lutfen gideceginiz sehri b,c yada d olarak giriniz");
            char ch = input.next().charAt(0);
            if (ch=='b'||ch=='B'){
                standartBiletUcreti=birimFiyat*500;
            } else if (ch=='c'||ch=='C'){
                standartBiletUcreti=birimFiyat*700;
            } else if (ch=='d'||ch=='D'){
                standartBiletUcreti=birimFiyat*900;
            } else {
                System.out.println("Uygun bir sehir adi giriniz");
                sehirSec();
            }
            return standartBiletUcreti;
        }

        public void tarifeSec() {
            System.out.println("lutfen tekyon tarifelerinden birini secmek icin t ye gidis donus tarifesi ici g ye basiniz");
            char ch = input.next().charAt(0);

            if (ch == 't' || ch == 'T') {
                System.out.println("Lutfen yasinizi giriniz");
                int yas = input.nextInt();
                if (yas < 0) {
                    System.out.println("Yasi pozitif deger olarak giriniz");
                    tarifeSec();
                } else if (yas < 12) {
                    biletUcreti = standartBiletUcreti * 50 / 100;
                } else if (yas < 24) {
                    biletUcreti = standartBiletUcreti * 90 / 100;
                } else if (yas < 65) {
                    biletUcreti = standartBiletUcreti ;
                } else {
                    biletUcreti = standartBiletUcreti* 70 / 100;
                }
            } else if (ch == 'g' || ch == 'G') {
                biletUcreti=standartBiletUcreti*80/100;
            }else {
                System.out.println("uygun bir giris yapiniz");
                tarifeSec();
            }
            System.out.println("Bilet tutariniz = "+biletUcreti+"TL");

        }



        public static void main(String[] args) {
            BiletHesapla biletHesapla = new BiletHesapla();
            biletHesapla.sehirSec();
            biletHesapla.tarifeSec();

        }

    }


