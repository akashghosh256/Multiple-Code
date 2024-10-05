https://studyx.ai/homework/101189751-rearrangement-of-bits-alex-gives-you-a-positive-number-n-and-wants-you-to-re-arrange-the

If count = 3, we want a number with 3 consecutive set bits: 0111 (binary) or 7 (decimal).
1 << 3 gives us 1000 (which is 8).
Subtracting 1 from 1000 results in 0111 (which is 7).
So, the -1 ensures that we get the correct sequence of count consecutive 1's.






import java.util.Scanner;

public class Main {

    public static int rearrangeBits(int N) {
        int count = 0;

        // Count the number of set bits (1's) in N
        while (N > 0) {
            count += (N & 1);
            N >>= 1;
        }
        count = 3;
        System.out.println(count);

        // The minimum number will have 'count' set bits starting from the least significant position
        int result = (1 << count) -1;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int minNumber = rearrangeBits(N);
        System.out.println("The minimum possible number is: " + minNumber);
    }
}
