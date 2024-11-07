class MinMax{
    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: "+ min);
    }
}