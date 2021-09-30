class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double ans=0;
        int l=nums1.length+nums2.length;
        double[] res=new double[l];
        int pos=0;
        for(int i:nums1)
            res[pos++]=i;
        for(int j:nums2)
            res[pos++]=j;
        Arrays.sort(res);
        if(l%2==0){
            ans=(res[l/2-1]+res[l/2])/2;
            return ans;
        }
        ans=res[l/2];
        return ans;
    }
}
