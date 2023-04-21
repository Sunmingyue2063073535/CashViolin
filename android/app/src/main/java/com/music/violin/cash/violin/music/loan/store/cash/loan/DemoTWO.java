package com.music.violin.cash.violin.music.loan.store.cash.loan;

public class DemoTWO {
    int diff;
    long ans;

    public  long  numberOfPairs(int[] nums1, int[] nums2, int diff) {
        int n = nums1.length;
        int[] nums = new int[n];
        this.diff = diff;
        for (int i = 0; i < n; i++) {
            nums[i] = nums1[i] - nums2[i];
        }
        mergeSort(nums, 0, n - 1, new int[n]);
        return ans;
    }

    public void mergeSort(int[] nums, int l, int r, int[] temp) {
        if (r <= l) return;
        int m = l + (r - l) / 2;
        mergeSort(nums, l, m, temp);
        mergeSort(nums, m + 1, r, temp);
        merge(nums, l, m, m + 1, r, temp);
    }

    public void merge(int[] nums, int l1, int r1, int l2, int r2, int[] temp) {
        int m = l1;
        int n = l2;
        while (m <= r1 && n <= r2) {
            if (nums[m] <= nums[n] + diff) {
                ans += r2 - n + 1;
                m++;
            } else {
                n++;
            }
        }

        int p = l1;
        int q = l2;
        int cur = l1;
        while (p <= r1 && q <= r2) {
            if (nums[p] <= nums[q]) {
                temp[cur++] = nums[p++];
            }  else {
                temp[cur++] = nums[q++];
            }
        }
        while (p <= r1) temp[cur++] = nums[p++];
        while (q <= r2) temp[cur++] = nums[q++];
        for (int i = l1; i <= r2; i++) nums[i] = temp[i];
    }
}
