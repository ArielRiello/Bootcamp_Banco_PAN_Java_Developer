package CarroEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<Carro> StackCarros = new Stack<>();

        StackCarros.push(new Carro("Ford"));
        StackCarros.push(new Carro("Chevrolet"));
        StackCarros.push(new Carro("Fiat"));

        System.out.println(StackCarros);

        System.out.println(StackCarros);
        System.out.println(StackCarros.pop());
        System.out.println(StackCarros);

        System.out.println(StackCarros.peek());
        System.out.println(StackCarros);

        System.out.println(StackCarros.empty());
    }
}
