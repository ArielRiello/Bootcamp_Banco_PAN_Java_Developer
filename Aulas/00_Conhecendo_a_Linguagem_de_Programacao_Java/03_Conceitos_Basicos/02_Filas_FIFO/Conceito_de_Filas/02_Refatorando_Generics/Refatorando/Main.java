package Refatorando;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFIla = new Fila<>();

        minhaFIla.enqueue("primeiro");
        minhaFIla.enqueue("segundo");
        minhaFIla.enqueue("terceiro");
        minhaFIla.enqueue("quarto");

        System.out.println(minhaFIla);

        System.out.println(minhaFIla.dequeue());

        System.out.println(minhaFIla);
    }
}
