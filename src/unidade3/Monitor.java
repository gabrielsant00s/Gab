package unidade3;

// Declara��o da classe
public class Monitor {
    // Declara��o dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    
    void mostrarInfo() {
        System.out.println("Informa��es do Monitor");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho + "''");
        System.out.println(resolucao + " " + frequencia + "hz");
        System.out.println("Pre�o: " + preco);
    }
}
