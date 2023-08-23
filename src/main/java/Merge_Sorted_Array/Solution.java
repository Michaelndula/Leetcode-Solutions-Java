package Merge_Sorted_Array;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }

    }
}

// Output: 1 2 2 3 5 6

//In this implementation, we start from the end of both arrays and work our way backwards.
// We compare the last elements of nums1 and nums2, place the larger one in the last position of nums1,
// and then move the corresponding pointer accordingly. We repeat this process until we have processed all elements from nums2.
// If there are any remaining elements in nums2, we copy them to their correct positions in nums1.
