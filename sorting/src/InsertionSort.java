import java.util.Arrays;

public class InsertionSort{
    public static int[] insertSort(int[] a){
        for(int i=1;i<a.length;i++){//插入的次数
            int insertNum=a[i];//要插入的数
            int j=i-1;//已经排序好的序列元素个数
            while(j>=0&&a[j]>insertNum){//序列从后到前循环，将大于insertNum的数向后移动一格
                a[j+1]=a[j];//元素移动一格
                j--;
            }
            a[j+1]=insertNum;//将需要插入的数放在要插入的位置。
        }
        return a;
    }
    public static void main(String[]args)
    {
        int nums[]={1,5,4,3,6,2};
        System.out.println(Arrays.toString(insertSort(nums)));
    }
}