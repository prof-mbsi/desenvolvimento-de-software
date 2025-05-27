package aula2705;

import java.util.Objects;

public class Produto {
    String nome;
    int codigo;

    Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Sobrescrevendo hashCode e equals
    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        return this.codigo == other.codigo && this.nome.equals(other.nome);
    }
}