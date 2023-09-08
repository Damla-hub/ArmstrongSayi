import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int a,basNumber=0,basDeger,tempA,total=1,result=0,tempB;
        System.out.print("Sayı giriniz: ");
        a=input.nextInt();
        tempA=a;
        tempB=a;
        while(a!=0){
            a=a/10;
            basNumber++;
        }
        while(tempA!=0){
            basDeger=tempA%10;
            for(int i=1;i<=basNumber;i++){
                 total*=basDeger;
            }
            result+=total;
            total=1;
            tempA/=10;

        }
        if(result==tempB){
            System.out.print(tempB+" bir Armstrong sayıdır.");
        }else {
            System.out.print(tempB+" Armstrong sayı değildir.");
        }


    }
}
