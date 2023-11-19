public class Runner_Ornek_For_Each {
    public static void main(String[] args) {
        /**
         * HER DÖNGÜNÜN KENDÝNE HAS ARTILARI VE EKSÝLERÝ VARDIR.
         */
        /**
         * For each döngü yapýsý dizi içerisindeki deðerleri sýralý olarak bir deðiþkene atayabilir.
         * Elimizdeki bir diziyi yazdýrmak için for each ve for döngüsünü kullanalým performanslarýný örneðimizde karþýlaþtýralým.
         */

        String  [] sayilar=new String[300000];

        long forEachBaslangic = System.currentTimeMillis();
        for (String i : sayilar) {
            System.out.println(i);
        }
        long forEachBitis = System.currentTimeMillis();



        long forBaslangic = System.currentTimeMillis();
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        long forBitis = System.currentTimeMillis();


        System.out.println("For döngüsü süresi: " + (forBitis - forBaslangic));

        System.out.println("For-each döngüsü süresi: " + (forEachBitis - forEachBaslangic));

        /**
         * örnekten görülebileceði gibi yukarýdaki ve benzeri iþlemler için for each döngüsü daha verimli bi yoldur.
         */

    }
}
