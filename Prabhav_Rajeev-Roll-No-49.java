import java.util.Scanner;

public class Prabhav_Rajeev_Roll_No_49 {

    public static void answer(int n){
        int k=2*n-2;
        for(int i=0;i<=n-1;i++){
            for(int j=1;j<=k;j++)
                System.out.print(" ");
            k--;
            for(int j=0;j<=i*2;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        int c=0;
        for(int z=1;z<=n-2;z++){
            for(int j=0;j<=k-1;j++)
                System.out.print(" ");
            for(int l=0;l<=1;l++){
                for(int i=0;i<=n-1;i++)
                    System.out.print("*");
                for(int i=0;i<=c*2;i++)
                System.out.print(" ");
            }
            c++;
            k--;
            System.out.print("\n");
        }
        for(int l=0;l<=1;l++){
            for(int i=0;i<=n-1;i++)
                System.out.print("*");
            for(int i=0;i<=c*2;i++)
                System.out.print(" ");
        }
        System.out.print("\n");
        k=1;
        for(int z=1;z<=n-2;z++){
            c--;
            for(int j=1;j<=k;j++)
                System.out.print(" ");
            for(int l=0;l<=1;l++){
                for(int i=0;i<=n-1;i++)
                    System.out.print("*");
                for(int i=0;i<=c*2;i++)
                    System.out.print(" ");
            }
            System.out.print("\n");

            k++;
        }
        k=n-1;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=k-1;j++)
                System.out.print(" ");
            for(int j=0;j<=i*2;j++)
                System.out.print("*");
            System.out.print("\n");
            k++;
        }
    }
    public void main(String[] args){
        int n;
        Scanner in= new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter Number : ");
        answer(n);
    }
}