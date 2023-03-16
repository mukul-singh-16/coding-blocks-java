// package lec7;
public class finite_coin_combination
{
    // finite coin supply but we can use current element again
    public static void main(String[] args) {
        int arr[]={4,5,3,8};
        int target=8;
        finite(arr,target,0,"");
    }
    public static void finite(int arr[],int target,int index,String ans)
    {
        if(0==target)
        {
            System.out.println(ans);
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(target >= arr[i])
            finite(arr, target-arr[i],i, ans+arr[i]+"");
        }
    }
}