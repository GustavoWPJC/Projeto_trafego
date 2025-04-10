public class Evento {
    private int tempo;
    private String tipo;
    private Object dados;

    public Evento(int tempo, String tipo, Object dados) {
        this.tempo = tempo;
        this.tipo = tipo;
        this.dados = dados;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    @Override
    public String toString() {
        return "[Tipo do evento: " + getTipo() + ", tempo: " + getTempo() + "]";
    }
}
