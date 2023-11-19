public class Runner_Ornek_While_Dongusu {
    public static void main(String[] args) {
        /**
         * HER DÖNGÜNÜN KENDÝNE HAS ARTILARI VE EKSÝLERÝ VARDIR.
         */
        /**
         * While döngüsü, bir koþul saðlandýðý sürece bir iþlemi tekrar eder.
         *
         * for döngüsünde kullandýðýmýz örneði kullanarak while döngüsünün performansý hakkýnda fikir saibi olalým
         */

        int [] sayilar={10,15,28,3,55,98};
        int sayac=0;


        while (sayilar[sayac]!=3){
            System.out.println("Döngü "+(sayac+1)+". kez çalýþtý.");
            sayac++;
        }

        System.out.println("3 sayýsý "+sayac+". indexte buldum.");

        /**
         * 3 ü bulana dek while döngüm for döngüsünün aksine 3 kez çalýþtý ve daha sonra sonlandý bu da ihtiyaca
         * yönelik aramada daha kýsa süren bir döngü süresi sundu performansýmý olumlu yönde etkiledi.
         */

    }
}
