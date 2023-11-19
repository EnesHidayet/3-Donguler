public class Runner_Ornek_For_Dongusu {
    public static void main(String[] args) {
        /**
         * HER D�NG�N�N KEND�NE HAS ARTILARI VE EKS�LER� VARDIR.
         */
        /**
         * For d�ng�s�, bir dizi ��eyi i�lemek i�in kullan�l�r. D�ng�, ba�lang�� de�eri,ko�ul ve son de�er olmak �zere
         * �� parametre al�r.For d�ng�s� ekstra saya� tan�mlamam�za gerek b�rakmadan i�lemler yapmam�z� ve s�ral�
         * yazd�rma i�lemlerini kolayla�t�ran bir yap�ya sahiptir.Performans a��s�ndan for d�ng�s�n� bir �rnek ile g�sterelim.
         *
         * �rne�in bir int dizisi i�erisinde var oldu�unu bildi�imiz bir de�eri for d�ng�s� kullanarak aramak istedi�imizde
         * dizi i�erisindeki konumu ne olursa olsun for d�ng�s� ekstra bir karar yap� veya bir komut girilmedi�i s�rece
         * d�ng�deki ko�ul sa�lanana kadar �al��maya devam eder.A�a��daki dizide yer alan say�lardan 3 � bulmaya �al��al�m
         */

        int [] sayilar={10,15,28,3,55,98};

        for (int i=0;i< sayilar.length;i++){
            if (sayilar[i]==3){
                System.out.println("3 say�s�n� "+i+". indexte buldum");
            }
            System.out.println("D�ng� "+(i+1)+" kez �al��t�.");
        }

        /**
         * Bu program �al��t�r�ld���nda g�r�lece�i gibi break ifadesini kullanmad���mda amac�m olan 3 � bulmak olsa dahi
         * for d�ng�s� girilen ko�ulu sa�layana kadar �al��maya devam edecektir.Bu da performans�m�z� olumsuz etkilicektir.
         */






    }
}
