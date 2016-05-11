import java.util.Random;


public class Main {


    public static void selectionSort(int[] arr){
   
        for (int i = 0; i < arr.length; i++) {
        
            int min = arr[i];
            int min_i = i;
        
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        
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
            
        }
        Main.selectionSort(mas);
        System.out.println();
        for (int i=0;i<mas.length;i++){

            System.out.print(mas[i]+ " ");
        }
    }
}
