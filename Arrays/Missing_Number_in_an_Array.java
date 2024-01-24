package Arrays;

public class Missing_Number_in_an_Array {
    public static void main(String[] args) {
        int arr[] = {1,3,6,8,2,4,7};

        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        System.out.println("The missing Number is:- "+sum);
    }
}
