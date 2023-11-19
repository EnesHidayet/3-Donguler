public class Runner_Ornek_For_Each {
    public static void main(String[] args) {
        /**
         * HER D�NG�N�N KEND�NE HAS ARTILARI VE EKS�LER� VARDIR.
         */
        /**
         * For each d�ng� yap�s� dizi i�erisindeki de�erleri s�ral� olarak bir de�i�kene atayabilir.
         * Elimizdeki bir diziyi yazd�rmak i�in for each ve for d�ng�s�n� kullanal�m performanslar�n� �rne�imizde kar��la�t�ral�m.
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


        System.out.println("For d�ng�s� s�resi: " + (forBitis - forBaslangic));

        System.out.println("For-each d�ng�s� s�resi: " + (forEachBitis - forEachBaslangic));

        /**
         * �rnekten g�r�lebilece�i gibi yukar�daki ve benzeri i�lemler i�in for each d�ng�s� daha verimli bi yoldur.
         */

    }
}
