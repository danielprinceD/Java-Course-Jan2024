class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time = 0; double wait = 0;
        for(int i=0;i<customers.length;i++)
        {
            if(time > customers[i][0])
            {
                wait += time - customers[i][0];
                customers[i][0] += time - customers[i][0];
            }
            wait += customers[i][1];
            time = customers[i][0] + customers[i][1];
        }
        return wait / customers.length;
    }
}