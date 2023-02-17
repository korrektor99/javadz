import java.util.ArrayList;

// 2. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное 
// и среднее арифметическое из этого списка.
import java.util.*;
public class sem3dz2 {
    public static void main(String[] args) {
        List<Integer> a= List.of(1,12,123,1234,1,2);
        int max=0;
        int min=100000;
        double srarfm=0;
        double sum=0;
        for(int i:a)
        {
            if(i>max)
            {
                max=i;
            }
            if (i<min)
               { min=i;}
            sum+=i;
            //System.out.println(i);
        }
        srarfm=sum/a.size();
        System.out.println(max);
        System.out.println(min);
        System.out.println(srarfm);
    }
     
    
}
