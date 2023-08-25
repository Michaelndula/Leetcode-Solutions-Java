package Remove_Element;
import java.util.Arrays;

public class Element {
    public static int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                expectedNums[k] = nums[i];
                k++;
            }
        }


        for(int j = 0; j < k; j++){
            nums[j] = expectedNums[j];
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        int[] expectedNums = {2, 2};
        assert k == expectedNums.length;

        Arrays.sort(nums, 0, k);

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("Test passed!");
    }
}
