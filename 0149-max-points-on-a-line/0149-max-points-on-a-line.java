class Solution {
    public int maxPoints(int[][] points) {
    
//         int max= 0 ;
        
//         for(int[] pt : points){
//         HashMap<Double , Integer> slope = new HashMap<>() ;
//             double sl = 0;
            
//            for(int[] pt2 : points){
               
//                if(pt == pt2) continue ;
               
//                if((pt2[0] - pt[0]) == 0) 
//                {sl = 0;}
//                    else{
               
//                sl =Math.abs( (pt2[1] - pt[1]) / (pt2[0] - pt[0]) ) ;
//                    }
               
//                slope.put(sl , slope.getOrDefault(sl , 0) + 1 );
               
//                if(slope.get(sl) > max )
//                    max = slope.get(sl) ;
//            }
//        }
        
//         return max + 1;
        
//     }
        
        
    // {       

        if(points.length <= 0) return 0;
        if(points.length <= 2) return points.length;

        int max = 0;
        for(int[] point1 : points)
        {   
            // Slope, No of points that have the same slope value passing through P1 
            Map<Double,Integer> map= new HashMap<>();
            for(int[] point2 : points)
            {
                if(point1 == point2) continue;
                
                double slope=0;
                // if x2 = x1 are equal then line is vertical
                if(point2[0] == point1[0]) {
                   slope=Double.POSITIVE_INFINITY; 
                }
                else
                {
                    // slope (m) = (y2 - y1) / (x2 - x1) 
                    slope = (point2[1] - point1[1]) / (double)(point2[0] - point1[0]);
                }
                map.put( slope , map.getOrDefault(slope,0)+1 );
                if(map.get(slope)>max)
                    max=map.get(slope);
            }
        }
        return max+1;
    }
}