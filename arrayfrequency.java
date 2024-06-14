public class arrayfrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,5,5,6,9,7,3,4};
        boolean[] flag = new boolean[arr.length];
       
            for(int i = 0; i < arr.length; i++){
                if(!flag[i]){
                    int a, count = 0;
                    a = arr[i];

                    for (int j = 0; j < arr.length; j++){
                        if ( a == arr[j]){
                            count ++;
                            flag[j] = true;
                        }
                    }
                
                if(count > 1)
                System.out.println("Frequency of " + arr[i] + " is : " + count);
            }
        }
    }
}
