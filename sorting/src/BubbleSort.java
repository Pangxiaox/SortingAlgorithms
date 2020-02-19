import java.util.Arrays;

public class BubbleSort {
    public static int[]bubblesort(int[] a)
    {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[]args)
    {
        int nums[]={1,5,4,3,6,2};
        System.out.println(Arrays.toString(bubblesort(nums)));
    }
}