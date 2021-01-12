void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int i=m-1,j=0;
    for(; i>=0; i--){
        nums1[i+n] = nums1[i];
    }
    i = n;
    int in = 0;
    while(i<(n+m) && j<n){
        if(nums1[i]<nums2[j]){
            nums1[in] = nums1[i];
            i++;
            in++;
        }
        else{
            nums1[in] = nums2[j];
            j++;
            in++;
        }
    }
    while( i< (n+m) ){
        nums1[in]=nums1[i];
        i++;
        in++;
    }
    while(j < n){
        nums1[in]=nums2[j];
        j++;
        in++;
    }
}