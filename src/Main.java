import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in); //Поток ввода
        System.out.println("Введите  число a: ");
        int a = in.nextInt(); //число а
        System.out.println("Введите  число b: ");
        int b = in.nextInt(); //Число b
        in.close();
        //Создадим объект класса CountSum и вызовем метод класса Count
        System.out.println("Сумма диапазона [a,b): "+new CountSum().Count(a,b)); //Вывод результата
    }
}