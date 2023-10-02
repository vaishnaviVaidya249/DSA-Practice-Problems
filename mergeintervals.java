class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new ArrayList<>();

        if(intervals.length==0){
            return result.toArray(new int[0][]);
        }

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int start=intervals[0][0];//1
        int end=intervals[0][1];//3

        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);

            }else{
                result.add(new int[]{start,end});
                start=i[0];
                end=i[1];


            }

        }
        result.add(new int[]{start,end});
        return result.toArray(new int[0][]);

        
        
    }
}