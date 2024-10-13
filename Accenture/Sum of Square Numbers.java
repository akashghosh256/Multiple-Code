Approach
Initial Setup:
Calculate the integer square root of c, denoted as stop, which represents the maximum possible value for a and b (i.e., stop = sqrt(c)).
Two-Pointer Technique:
Initialize two pointers:
a starting from 0 (the smallest possible value).
b starting from stop (the largest possible value).
Use a while loop to move these pointers based on the comparison between the sum of their squares and c.
Pointer Movement:
Calculate the sum of squares of a and b: comp = (long) a * a + (long) b * b.
If comp equals c, return true as we have found valid integers a and b.
If comp is greater than c, decrement b to reduce the sum.
If comp is less than c, increment a to increase the sum.
Continue this process until a surpasses b.
Return False:
If the loop exits without finding a valid pair, return false.


class Solution {
    public boolean judgeSquareSum(int c) {
        long stop = (long)Math.sqrt(c);
        long a=0, b = stop;
        while(a<=b){
            long comp = a*a + b*b;
            if(comp == c) return true;
            else if(comp>c) b--;
            else a++;
        }
        return false;
    }
}