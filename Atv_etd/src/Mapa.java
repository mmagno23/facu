import java.util.Objects;

class Entrada<a, b> {
    a chave;
    b valor;
    Entrada<a, b> proxima;
    Entrada<a, b> anterior;

    public Entrada(a chave, b valor) {
        this.chave = chave;
        this.valor = valor;
    }
}

public class Mapa<a, b> {
    private Entrada<a, b>[] baldes;
    private int capacidade;
    private int tamanho;

    public Mapa(int capacidade) {
        this.capacidade = capacidade;
        this.baldes = new Entrada[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(a chave, b valor) {
        int indice = calcularIndice(chave);
        Entrada<a, b> entrada = new Entrada<>(chave, valor);

        if (baldes[indice] == null) {
            baldes[indice] = entrada;
        } else {
            Entrada<a, b> atual = baldes[indice];
            while (atual.proxima != null) {
                if (Objects.equals(atual.chave, chave)) {
                    atual.valor = valor;
                    return;
                }
                atual = atual.proxima;
            }
            if (Objects.equals(atual.chave, chave)) {
                atual.valor = valor;
            } else {
                atual.proxima = entrada;
                entrada.anterior = atual;
            }
        }
        tamanho++;
    }

    public b obter(a chave) {
        int indice = calcularIndice(chave);
        Entrada<a, b> atual = baldes[indice];
        while (atual != null) {
            if (Objects.equals(atual.chave, chave)) {
                return atual.valor;
            }
            atual = atual.proxima;
        }
        return null;
    }

    public boolean contemChave(a chave) {
        int indice = calcularIndice(chave);
        Entrada<a, b> atual = baldes[indice];
        while (atual != null) {
            if (Objects.equals(atual.chave, chave)) {
                return true;
            }
            atual = atual.proxima;
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    private int calcularIndice(a chave) {
        int hashCode = Objects.hashCode(chave);
        return Math.abs(hashCode) % capacidade;
    }

    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>(10);
        mapa.adicionar("um", 1);
        mapa.adicionar("dois", 2);
        mapa.adicionar("três", 3);

        System.out.println("Tamanho: " + mapa.tamanho());
        System.out.println("Contém a chave 'dois': " + mapa.contemChave("dois"));
        System.out.println("Obter 'três': " + mapa.obter("três"));
        System.out.println("Contém a chave 'quatro': " + mapa.contemChave("quatro"));
    }
}
