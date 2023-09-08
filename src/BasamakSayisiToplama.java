import java.util.Scanner;
public class BasamakSayisiToplama {
    public static void main(String[] args) {
        int number,mod,total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamakları toplanacak sayıyı giriniz: ");
        number=input.nextInt();
        while(number!=0){
            mod=number%10;
            total+=mod;
            number/=10;
        }
        System.out.print("Basamak Toplamı: "+total);

    }
}
