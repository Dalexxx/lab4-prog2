package atividade1;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        ListProcessor processor = new ListProcessor();
        processor.removeDuplicates(numeros);
        processor.printLists();

        ArrayList<Object> letras = new ArrayList<>();
        letras.add('a');
        letras.add('b');
        letras.add('b');
        letras.add('f');
        letras.add('c');
        letras.add('v');
        letras.add('x');

        ListProcessor processor2 = new ListProcessor();
        processor2.removeDuplicates(letras);
        processor2.printLists();
    }
}