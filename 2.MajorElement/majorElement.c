int majorElement(int* nums, int numsSize){
    int m = nums[0];//存储最多元素
    int count = 1;//记录出现次数
    for(int i = 1; i < numsSize; i++){
        if(m != nums[i] && count > 0){
            count--;
        }
        if(m == nums[i]){
            count++;
        }
        if(count == 0){
            m = nums[i];
            count = 1;
        }
    }
    return m;
}
int main(){
    int a[3] = {3,2,3};
    int m = majorElement(a, 3);
    return m;
}