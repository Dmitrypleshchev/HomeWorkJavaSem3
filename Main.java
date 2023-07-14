
/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> int_list = new ArrayList<>(size);
        for (int i =0; i <size; i ++) {
          int_list.add(new Random().nextInt(10));
        }
        System.out.println(int_list.toString());
        System.out.println(removeEvenValue(int_list));
        System.out.printf("  Максимальное: %d", getMax(int_list));
        System.out.printf("  Минимальное: %d", getMin(int_list));
        System.out.printf("  Cреднее арифметичское: %d", getAverage(int_list));

    }

    public static List<Integer> removeEvenValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0) list.remove(i);
        }
        return list;
    }

    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    public static Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

}
