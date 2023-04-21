package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.os.Build;

import java.util.function.Function;

public class DemoThree {
    public static long kthSmallestProduct(int[] nums1, int[] ints) {
        int m = nums1.length;
        double[] nums2 = new double[0];
        int n = nums2.length;

        Function<Long, Long> check = (pivot) -> {
            long count = 0;
            for (int i = 0; i < m; i++) {
                if (nums1[i] > 0) {
                    long left = 0;
                    long right = n - 1;
                    long bound = -1;
                    while (left <= right) {
                        long mid = left + (right - left) / 2;
                        if ((long) nums1[i] * nums2[(int) mid] <= pivot) {
                            bound = mid;
                            left = mid + 1;
                        }
                        else
                            right = mid - 1;
                    }
                    count += bound + 1;
                }
                else {
                    long left = 0;
                    long right = n - 1;
                    long bound = n;
                    while (left <= right) {
                        long mid = left + (right - left) / 2;
                        if ((long) nums1[i] * nums2[(int) mid] <= pivot) {
                            bound = mid;
                            right = mid - 1;
                        }
                        else
                            left = mid + 1;
                    }
                    count += (long) n - bound;
                }
            }
            return count;
        };

        long left = - (long) 1e10;
        long right = (long) 1e10;
        long res = right;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Long k = null;
                if (check.apply(mid) >= k) {
                    res = mid;
                    right = mid - 1;
                }
                else
                    left = mid + 1;
            }
        }
        return res;
    }
}
