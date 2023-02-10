//3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class sem1zad3 {
    public static void main(String[] args) {
        int[] arr=new int[] {3,2,2,3};
        int val=3;
        int k =0;
        int box=0;
        while (k<arr.length){
            for (int i=0;i<arr.length-1;i++)
            {
            if (arr[i]==val)
            {
                box=arr[i];
                
                arr[i]=arr[i+1];
                
                //System.out.println(arr[i]);
                arr[i+1]=box;
            }
            }k++;
        } 
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        
    }
}
