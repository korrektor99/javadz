public class sem1dz1 {
    public static void main(String[] args) {
        int max=0;
        int min=100;
        int[] arr=new int[] {1,2,3};
        for (int i=0;i < arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        
    }
}
