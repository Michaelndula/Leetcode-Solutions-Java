package Remove_Element;

public class Element {
    public static int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        int element = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                expectedNums[element] = nums[i];
                element++;
            }
        }

        for(int j = 0; j < element; j++){
            nums[j] = expectedNums[j];
        }

        return element;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        int newLength = removeElement(nums, val);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
