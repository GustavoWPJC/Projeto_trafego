package cidade;

public class Rua {
    private int comprimento;
    private int capacidade;
    private int tempo_travessia;
    private int horario_de_pico;

    public Rua(int comprimento, int capacidade, int tempo_travessia, int horario_de_pico) {
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.tempo_travessia = tempo_travessia;
        this.horario_de_pico = horario_de_pico;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTempo_travessia() {
        return tempo_travessia;
    }

    public void setTempo_travessia(int tempo_travessia) {
        this.tempo_travessia = tempo_travessia;
    }

    public int getHorario_de_pico() {
        return horario_de_pico;
    }

    public void setHorario_de_pico(int horario_de_pico) {
        this.horario_de_pico = horario_de_pico;
    }

}
