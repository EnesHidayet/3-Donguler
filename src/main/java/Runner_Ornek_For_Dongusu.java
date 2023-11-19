public class Runner_Ornek_For_Dongusu {
    public static void main(String[] args) {
        /**
         * HER DÖNGÜNÜN KENDÝNE HAS ARTILARI VE EKSÝLERÝ VARDIR.
         */
        /**
         * For döngüsü, bir dizi öðeyi iþlemek için kullanýlýr. Döngü, baþlangýç deðeri,koþul ve son deðer olmak üzere
         * üç parametre alýr.For döngüsü ekstra sayaç tanýmlamamýza gerek býrakmadan iþlemler yapmamýzý ve sýralý
         * yazdýrma iþlemlerini kolaylaþtýran bir yapýya sahiptir.Performans açýsýndan for döngüsünü bir örnek ile gösterelim.
         *
         * Örneðin bir int dizisi içerisinde var olduðunu bildiðimiz bir deðeri for döngüsü kullanarak aramak istediðimizde
         * dizi içerisindeki konumu ne olursa olsun for döngüsü ekstra bir karar yapý veya bir komut girilmediði sürece
         * döngüdeki koþul saðlanana kadar çalýþmaya devam eder.Aþaðýdaki dizide yer alan sayýlardan 3 ü bulmaya çalýþalým
         */

        int [] sayilar={10,15,28,3,55,98};

        for (int i=0;i< sayilar.length;i++){
            if (sayilar[i]==3){
                System.out.println("3 sayýsýný "+i+". indexte buldum");
            }
            System.out.println("Döngü "+(i+1)+" kez çalýþtý.");
        }

        /**
         * Bu program çalýþtýrýldýðýnda görüleceði gibi break ifadesini kullanmadýðýmda amacým olan 3 ü bulmak olsa dahi
         * for döngüsü girilen koþulu saðlayana kadar çalýþmaya devam edecektir.Bu da performansýmýzý olumsuz etkilicektir.
         */






    }
}
