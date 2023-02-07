class Solution {
//     daily later again
    public int totalFruit(int[] fruits) {
        int si = 0, ei = 0, n = fruits.length, count =0, ans = -(int)1e9;
        int[] freq = new int[100001];
        while(ei<n){
            if(freq[fruits[ei]]==0){
                count++;
            }
            freq[fruits[ei]]++;
            ei++;
            while(count>2){
                if(freq[fruits[si]] == 1){
                    count--;
                }
                freq[fruits[si]]--;
                si++;
            }
            ans = Math.max(ans,ei-si);
        }
        return ans;
    }
}