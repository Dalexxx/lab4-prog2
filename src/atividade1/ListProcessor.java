package atividade1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListProcessor {
    private ArrayList<Object> resultList;
    private LinkedList<Object> filteredList;

    public ListProcessor() {
        resultList = new ArrayList<>();
        filteredList = new LinkedList<>();
    }

    public void removeDuplicates(ArrayList<Object> inputList) {
        for (Object item : inputList) {
            if (resultList.contains(item)) {
                filteredList.add(item);
            } else {
                resultList.add(item);
            }
        }
    }

    public void printLists() {
        System.out.print("Resultado (Lista 1): ");
        for (Object item : resultList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Filtrados (Lista 2): ");
        for (Object item : filteredList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}