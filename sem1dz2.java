//Написать метод, который определяет, является 
//ли введенный пользователем год високосным, 
//и возвращает в консоль boolean 
//(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
import java.util.Scanner;
public class sem1dz2 {
    
    public static void main(String[] args) {
    System.out.println("Введите год для проверки на высокосность");
    Scanner console = new Scanner(System.in);
    int a = console.nextInt();
    if (a%400==0)
    {
        System.out.println(true);
    }  else if (a%100>0)
    {
        if (a%4==0)
        {
            System.out.println(true);
        }
        else System.out.println(false);
    }
    }
    
}
