import java.util.Scanner;
public class Rickshaw_Ride{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] w = new long[n];
        for(int i=0; i<n; i++)
        {
            w[i] = sc.nextLong();
        }
        int left =0;
        int right = n-1;
        int count = 0;
        while(left <= right)
        {
            if(w[left] + w[right] <= x)
            {
                left++;
                right--;
            }
            else{
                right--;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}