import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9};
       int[] arr1={5,5,5,5};
       System.arraycopy(arr,0,arr1,0,arr1.length);
        System.out.println(Arrays.toString(arr1));
       int[][] arr3={
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
        System.out.println(Arrays.deepToString(arr3));
       int ret=myBinarySearch(arr,6,0,arr.length-1);
        System.out.println(ret);
        System.out.println(maxNum(arr));
        System.out.println(minNum(arr));
        System.out.println(avg(arr));
       int[] res1=reverse(arr);
        System.out.println(Arrays.toString(res1));
        System.out.println();
        int[] res2=fun(arr);
        System.out.println(Arrays.toString(res2));
    }
    public static int myBinarySearch(int[] arr,int key,int left,int right){
        int mid=(left+right)/2;
        if(left<=right){
            if(arr[mid]>key){
                return myBinarySearch(arr,key,left,mid-1);
            }if(arr[mid]<key){
                return myBinarySearch(arr,key,mid+1,right);
            }
            return mid;
        }
        return -1;
    }
    public static int maxNum(int[] arr){
        int max=arr[0];
        for (int x:arr) {
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    public static int minNum(int[] arr){
        int min=arr[0];
        for (int x:arr) {
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public static double avg(int[] arr){
        double avgNum=0.0;
        double sum=0.0;
        for (int x:arr) {
            sum+=x;
        }
        avgNum=sum/arr.length;
        return avgNum;
    }
    public static int[] reverse(int[] arr){
        int[] res=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            res[arr.length-1-i]=arr[i];
        }
        return res;
    }
    public static int[] fun(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&arr[left]%2==1){
                left++;
            }
            while(left<right&&arr[right]%2==0){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
        return arr;
    }
    public static void print(int[] arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
