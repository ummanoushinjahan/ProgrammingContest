import java.util.Scanner;
public class Fest_T_Shirt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long n = sc.nextLong();
            long v = sc.nextLong();
            long j = sc.nextLong();
            long k = sc.nextLong();
            long c = sc.nextLong();
            long people = (3 * n) + v + j;
            long packs = (people + k - 1) / k;
            long cost = packs * c;
            System.out.println(packs + " " + cost);
        }
        sc.close();
    }
}
