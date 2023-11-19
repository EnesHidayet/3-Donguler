public class Runner_Ornek_While_Dongusu {
    public static void main(String[] args) {
        /**
         * HER D�NG�N�N KEND�NE HAS ARTILARI VE EKS�LER� VARDIR.
         */
        /**
         * While d�ng�s�, bir ko�ul sa�land��� s�rece bir i�lemi tekrar eder.
         *
         * for d�ng�s�nde kulland���m�z �rne�i kullanarak while d�ng�s�n�n performans� hakk�nda fikir saibi olal�m
         */

        int [] sayilar={10,15,28,3,55,98};
        int sayac=0;


        while (sayilar[sayac]!=3){
            System.out.println("D�ng� "+(sayac+1)+". kez �al��t�.");
            sayac++;
        }

        System.out.println("3 say�s� "+sayac+". indexte buldum.");

        /**
         * 3 � bulana dek while d�ng�m for d�ng�s�n�n aksine 3 kez �al��t� ve daha sonra sonland� bu da ihtiyaca
         * y�nelik aramada daha k�sa s�ren bir d�ng� s�resi sundu performans�m� olumlu y�nde etkiledi.
         */

    }
}
