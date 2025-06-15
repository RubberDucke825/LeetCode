class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start_index = 0;
        int end_index = 0;
        for (int i = 0; i<intervals.length;i++){
            if (intervals[i][0] <= newInterval[0] && newInterval[0] <= intervals[i])[1]){
                start_index = i;
            }
            if (intervals[i][0] <= newInterval[1] && newInterval[0] <= intervals[i])[1]){
                end_index = i;
            }
        }
        int[][] new_intervals = new int[intervals.length-(end_index-start_index)][2];
        for (int i = 0; i<start_index){
            new_intervals[i] = intervals[i]
        }
        new_intervals[start_index] = new int[] {intervals[start_index][0], intervals[end_index][1]};
        for (int i = start_index+1;i<new_intervals.length;i++){
            new_intervals[i] = intervals[end_index+i-start_index];
        }
        return new_intervals
    }
}
