import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int yil;
        String cinzodyagi=" ";
        System.out.print("Doğum yılınızı giriniz: ");
        yil=inp.nextInt();
        switch (yil%12) {
            case 0:
                cinzodyagi="Maymun";
                break;
            case 1:
                cinzodyagi="Horoz";
                break;
            case 2:
                cinzodyagi="Köpek";
                break;
            case 3:
                cinzodyagi="Domuz";
                break;
            case 4:
                cinzodyagi="Fare";
                break;
            case 5:
                cinzodyagi="Öküz";
                break;
            case 6:
                cinzodyagi="Kaplan";
                break;
            case 7:
                cinzodyagi="Tavşan";
                break;
            case 8:
                cinzodyagi="Ejderha";
                break;
            case 9:
                cinzodyagi="Yılan";
                break;
            case 10:
                cinzodyagi="At";
                break;
            case 11:
                cinzodyagi="Koyun";
                break;
        }
        System.out.print("Çin Zodyağı sonucunuz: "+cinzodyagi);
    }
}

/*Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun*/