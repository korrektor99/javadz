import java.util.ArrayList;

public class sem3zad1 {
    //Пусть дан произвольный список целых чисел, 
    //удалить из него четные числа (в языке уже есть что-то готовое для этого)
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,3,1,5,9,7,8,9};
        int k=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%2==0)
            {
            k++;
            }
        }
        k=0;
        int[] arr1= new int[arr.length-k];
        for (int i=0;i<arr1.length;i++)
        {
            if (arr[i]%2==1)
            {
                arr1[i-k]=arr[i];
                System.out.println(arr1[i]);
            }
        }

    }
}
