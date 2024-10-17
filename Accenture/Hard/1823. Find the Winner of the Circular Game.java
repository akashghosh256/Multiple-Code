 1823. Find the Winner of the Circular Game 

 Easy but remeber to use Queue
 There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.

 class Solution {
    public int findTheWinner(int n, int k) {
    Queue<Integer> q = new ArrayDeque();
    for(int i= 1; i<=n; i++)
    q.add(i);

    while(q.size() != 1){

        for(int i=1; i<k; i++){
            q.add(q.peek());
            q.remove();
        }
        q.remove();
    }

    return q.peek();


    }
}
    


class Solution(object):
    def findTheWinner(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        q = deque(range(1,n+1))
        while len(q) != 1:
            for _ in range(k-1):
                q.append(q.popleft())
            q.popleft()
        return q[0]