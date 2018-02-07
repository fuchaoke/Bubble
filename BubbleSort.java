public class BubbleSort {
    public static void main(String[]args){
        int arr[]={6,7,3,4,7,1,0,9,5};
        System.out.println("before sort");
        for(int num:arr){
            System.out.print(num+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sort");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
