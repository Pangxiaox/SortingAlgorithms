import java.util.Arrays;

public class SelectionSort{
    public static int[]selectionsort(int[]nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[minIndex]>nums[j])
                    minIndex = j;
            }
            if(i!=minIndex)
            {
                int tmp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tmp;
            }
        }
        return nums;
    }
    public static void main(String[]args)
    {
        int nums[]={1,5,4,3,6,2};
        System.out.println(Arrays.toString(selectionsort(nums)));
    }
}