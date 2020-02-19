import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static int[] radixsort(int[] data) {
        int maxBin = maxBin(data);
        List<List<Integer>> list = new ArrayList<>();
        for(int i  = 0; i < 10; i ++) {
            list.add(new ArrayList<>());
        }
        for(int i = 0, factor = 1; i < maxBin; factor *= 10, i ++) {
            for(int j = 0; j < data.length; j ++) {
                list.get((data[j]/factor)%10).add(data[j]);
            }
            for(int j = 0, k = 0; j < list.size(); j ++) {
                while(!list.get(j).isEmpty()) {
                    data[k] = list.get(j).get(0);
                    list.get(j).remove(0);
                    k ++;
                }
            }
        }
        return data;
    }
    //计算数组里元素的最大位数
    private static int maxBin(int[] data) {
        int maxLen = 0;
        for(int i = 0; i < data.length; i ++) {
            int size = Integer.toString(data[i]).length();
            maxLen =  size > maxLen ? size : maxLen;
        }
        return maxLen;
    }
    public static void main(String[]args)
    {
        int nums[]={5841,7,342,31175,36,42};
        System.out.println(Arrays.toString(radixsort(nums)));
    }
}