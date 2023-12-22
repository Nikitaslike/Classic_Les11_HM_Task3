package org.example;
import java.util.ArrayList;
import java.util.List;
//1. **Сума елементів:**
//  Створіть двовимірний масив та знайдіть суму всіх його елементів.
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> mulList = new ArrayList<>();
        mulList.add(List.of(1, 2, 3));
        mulList.add(List.of(4, 5, 6, 7));
        mulList.add(new ArrayList<>());

        System.out.println(SumPro(mulList));
    }
    public static int SumPro(List<List<Integer>> mulList){
        int sum = mulList.get(0).get(0);
        for (int i = 0; i < mulList.size(); i++) {
            for (int j = 0; j < mulList.get(i).size(); j++) {
                sum+= mulList.get(i).get(j);
            }
        }
        return sum;
    }
}