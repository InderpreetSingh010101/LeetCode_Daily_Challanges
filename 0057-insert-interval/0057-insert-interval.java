class Solution {
   
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>() ;
        int i = 0 ;
        int len = intervals.length ;
        
        while(i < len && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        
        while(i < len  && intervals[i][0] <=  newInterval[1]){
           newInterval[0] =  Math.min(intervals[i][0] , newInterval[0]) ;
            newInterval[1] =  Math.max(intervals[i][1] , newInterval[1]) ;
            i++ ;
        }
        ans.add(newInterval) ;
        
        while(i < len){
            ans.add(intervals[i]) ;
            i++ ;
        }
        
        int[][] res = new int[ans.size()][2] ;
        
        int j = 0 ;
        while( j < res.length){
            res[j]  = ans.get(j);
            j++;
        }
        
        return res ;
        
        
    }
}