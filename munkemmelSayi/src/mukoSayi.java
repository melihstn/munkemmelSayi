import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class mukoSayi {
    public static void main(String[] args) {
        int n,counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        n = input.nextInt();

        for(int i = 1; i<n; i++){
            if(n%i==0){
                counter+=i;
            }
        }
        if(counter == n){
            System.out.print(n+ " bir münkemmel sayıdır.");
        }else {
            System.out.print(n + " maalesef münkemmel sayı değildir.");
        }
    }
}
