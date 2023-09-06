
import java.util.stream.IntStream;
public class CountSum {
    //Метод для поиска суммы
        public long  Count(int a, int b) {
            //Создаём поток целых чисел в диапазоне [a,b), делаем перевод в Long, и вычисляем сумму потока чисел.
            return IntStream.range(a, b).mapToLong(i -> i).sum(); //Возвратим результат
        }

}
