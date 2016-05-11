import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 11.05.16
 * Time: 14:27
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        Main main=new Main();
        int mas[]=new int[10];

        for (int i=0;i<mas.length;i++){
            Random r=new Random();
            mas[i]=r.nextInt(50);
            System.out.print(mas[i]+ " ");
        }
        Main.selectionSort(mas);
        System.out.println();
        for (int i=0;i<mas.length;i++){

            System.out.print(mas[i]+ " ");
        }
    }
}
