import java.util.Arrays;

public class QuickSort {
    public static int[] quicksort(int[] numbers, int start, int end) {
        if (start < end) {
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end))
                    i++;
                while ((numbers[j] > base) && (j > start))
                    j--;
                if (i <= j) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j)
                quicksort(numbers, start, j);
            if (end > i)
                quicksort(numbers, i, end);
        }
        return numbers;
    }
    public static void main(String[]args)
    {
        int nums[]={1,5,4,3,6,2,100,0,4};
        System.out.println(Arrays.toString(quicksort(nums,0,8)));
    }
}
