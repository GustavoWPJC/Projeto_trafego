public class No {
    private Evento evento;
    private No prox;

    public No(Evento evento) {
        this.evento = evento;
        this.prox = null;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
