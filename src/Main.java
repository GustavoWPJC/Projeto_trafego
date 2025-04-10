import estruturas.Evento;
import estruturas.filaPrioridade;

public class Main {
    public static void main(String[] args) {
        filaPrioridade fila = new filaPrioridade();

        Evento e1 = new Evento(10, "Gerar_Veículo", null);
        Evento e2 = new Evento(5, "Mudar_Semáforo", null);
        Evento e3 = new Evento(8, "Veículo_Sai_Rua", null);

        fila.inserir(e1);
        fila.imprimirFila();

        fila.inserir(e2);
        fila.imprimirFila();

        fila.inserir(e3);
        fila.imprimirFila();

        System.out.println("Removendo eventos:");

        if(fila.estaVazia()){
            System.out.println("A fila está vazia");
        }

        while (!fila.estaVazia()) {
            Evento removido = fila.removerProximo();
            System.out.println("Evemto removido: " + removido);
            fila.imprimirFila();
        }
    }
}