package org.example;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 30; // the size of the original list
        int min = 0;   // minimum list item
        int max = 1000;// maximum list item
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList <Integer> randomList = randomList(list, min, max, size);
        System.out.println("Original list: " + randomList);
        LinkedList<Integer> getIvenNumberedList = getIvenNumberedList(randomList);
        System.out.println("Result list: " + getIvenNumberedList);
        System.out.println("Min list item: " + getMin(getIvenNumberedList, max));
        System.out.println("Max list item: " + getMax(getIvenNumberedList, min));
    }
    public static LinkedList<Integer> randomList(LinkedList<Integer> list, int min, int max, int size){

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            list.add(random.nextInt(min,max + 1));
        }
        return list;
    }
    public static LinkedList<Integer> getIvenNumberedList(LinkedList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public static Integer getMin (LinkedList<Integer> list, int max){
        int min = max;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }
    public static Integer getMax (LinkedList<Integer> list, int min){
        int max = min;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }
}