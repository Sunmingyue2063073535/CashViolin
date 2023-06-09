package com.music.violin.cash.violin.music.loan.store.cash.loan;

import java.util.PriorityQueue;

public class TextOrder {
    public  int minRefuelStops(int target, int startFuel, int[][] stations) {

        //这一题就是优先队列的应用，太扯淡了
        //完全就是特题特解，别的方法都相形见绌
        //优先队列可以是nlogn的解法，这太霸道了

        if(stations.length == 0)
            return startFuel>=target?0:-1;
        PriorityQueue<Integer>queue = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            queue = new PriorityQueue<Integer>((o1, o2)->{
                return o2-o1;
            });
        }
        int sum = startFuel;
        int ans = 0;
        for(int i = 0;i < stations.length;i++)
        {
            while(sum < stations[i][0])
            {
                Integer ii = queue.poll();
                if(ii == null)return -1;
                sum += ii;
                ans++;
            }
            queue.offer(stations[i][1]);
        }
        while(sum < target)
        {
            Integer ii = queue.poll();
            if(ii == null)return -1;
            sum += ii;
            ans++;
        }
        return ans;


    }
}
