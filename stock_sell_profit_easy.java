public class stock_sell_profit_easy {
    public static void main(String args[])
    {
        int[] arr ={ 1,10,1,10,3,7};
        int prev = 100,cur = arr[0],max_profit = 0;
        for(int i=0;i<arr.length;i++)
        {
            cur = arr[i];
            if(cur > prev)
                max_profit += (cur - prev);
            prev = cur;
        }
        System.out.println(max_profit);
    }
}
