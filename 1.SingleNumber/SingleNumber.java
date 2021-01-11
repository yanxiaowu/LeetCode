public class SingleNumber{
    public static int singleNumber(int[] nums){
        int single = 0;
        for(int i : nums){
            single ^= i;
        }
        return single;
    }

    public static void main(String[] args){
        int [] num = new int[] {1,2,2,4,4};
        System.out.println(singleNumber(num));
    }
}