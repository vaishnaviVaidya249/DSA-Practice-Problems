class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=nums1.length;
        for(int i=m;i<l;i++){

            nums1[i]=nums2[l-(i+1)];
        }
        Arrays.sort(nums1);
        
    }
}