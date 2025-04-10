package estruturas;

public class filaPrioridade {
    private No inicio;
    private No novo;

    public void inserir(Evento evento) {
        No novo = new No(evento);

        if (inicio == null || evento.getTempo() < inicio.getEvento().getTempo()) {
            novo.setProx(inicio);
            inicio = novo;

        } else {
            No atual = inicio;
            while (atual.getProx() != null && atual.getProx().getEvento().getTempo() <= evento.getTempo()) {
                atual = atual.getProx();
            }
            novo.setProx(atual.getProx());
            atual.setProx(novo);
        }
    }

    public Evento removerProximo() {
        if (inicio == null) {
            return null;
        }
        Evento e = inicio.getEvento();
        inicio = inicio.getProx();
        return e;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void imprimirFila(){
        No atual = inicio;
        if(estaVazia()){
            System.out.println("A lista está vazia");
            return;
        }
        System.out.println("Fila de eventos: ");
        while (atual != null){
            System.out.println(" -> " + atual.getEvento());
            atual = atual.getProx();
        }
        System.out.println();
    }


}
