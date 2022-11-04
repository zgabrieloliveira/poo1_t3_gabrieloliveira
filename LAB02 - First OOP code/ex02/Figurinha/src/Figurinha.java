public class Figurinha {

    private String nome;
    private String data;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais (String pais) {
        this.pais = pais;
    }

    public void printFigurinha() {

        System.out.println();
        System.out.printf("NOME: %s\n", getNome());
        System.out.printf("DATA: %s\n", getData());
        System.out.printf("ALTURA: %.2f\n", getAltura());
        System.out.printf("PESO: %.2f\n", getPeso());
        System.out.printf("PAIS: %s\n", getPais());
        System.out.println();

    }
}
