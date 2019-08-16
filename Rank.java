import java.lang.Math;
import java.util.Scanner;
public class Rank{
    public static void main(String[] args){
        int array[] = new int[10];
        for(int i=0;i<10;i++){
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nWhose rank do you want to find?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int count = 0;
        for(int i=0;i<10;i++) {
            if(array[i] > n) {
                count = count + 1;
            }
        }
        System.out.printf("Rank of %d is %d\n", n, count);
    }
}