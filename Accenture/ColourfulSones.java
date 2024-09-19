

https://codeforces.com/contest/265/problem/A


static public void solve(String s, String t) {
    int n = t.length();
    int c = 1;
    int cur = 0;
    
    for(int i=0; i<n; i++){
        
        if(s.charAt(cur) == t.charAt(i)){
            cur++;
            c++;
        }
    }
    
    System.out.println(c);
    
        
        // code here 
       
     
     
  }
