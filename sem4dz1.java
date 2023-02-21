// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.*;;
public class sem4dz1 {
    public static void main(String[] args) {
    System.out.println("Введите строки для запоминания");
    System.out.println("Введите print для вывода запомненного задом-наперед");
    System.out.println("Введите revert для удаления последней введенной строки");
    Deque<String> deque = new ArrayDeque<>();
    String print= "print";
    String revert = "revert";
    String exit= "exit";
    Scanner console = new Scanner(System.in);
    String result;
    while (true) 
    {
        deque.addLast(console.next());
        result=deque.getLast();
            if (result.equals(exit))
            {
                break;
            }
            if (result.equals(print))
            {
                deque.removeLast();
                while(deque.peek()!=null)
                {
                    System.out.println(deque.removeLast());
                }

            }
            if (result.equals(revert))
            {
                deque.removeLast();
                deque.removeLast();
            }
    
        
    }
        
    }
















    //deque.add(console.next());
    //System.out.println(deque.pollLast());
    // String a= console.next();
    // if (a=="print")
    // {
    //     System.out.println("1");
    //     System.out.println(deque.pollLast());
    // }
    // if (a=="revert")
    // {
    //     System.out.println("2");
    //     deque.removeLast();
    //     System.out.println("продолжайте");
    // }
    // else 
    // deque.add(console.next());
    
}

