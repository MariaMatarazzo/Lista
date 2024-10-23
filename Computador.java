public class Computador {
    private String nome;
    private Processador processador; // Composição

    // Construtor
    public Computador(String nome, String modeloProcessador, int velocidadeProcessador) {
        this.nome = nome;
        this.processador = new Processador(modeloProcessador, velocidadeProcessador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcessadorInfo() {
        return "Modelo: " + processador.getModelo() + ", Velocidade: " + processador.getVelocidade() + " GHz";
    }
}



