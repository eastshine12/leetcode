class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] trustedCount = new int[n + 1];
        
        
        for(int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            trustedCount[b]++;
            trustedCount[a]--;
            
        }
        
        for(int i = 1; i <= n; i++) {
            if(trustedCount[i] == n - 1) return i;
        }
        

        return -1;
        
    }
    
    
}

/*

각 사람마다 신뢰하거나 신뢰받는 카운트를 합산한다.
신뢰하게 되면 감소, 신뢰받게 되면 증가시켜서, 그 합산 값이 자신을 뺀 나머지 사람 수(n-1)가 되면 그 사람이 town judge가 된다.

*/