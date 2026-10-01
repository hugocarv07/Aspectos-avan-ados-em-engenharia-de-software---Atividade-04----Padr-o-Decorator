package padroesprojeto.decorator.hospital;

public class ExamePadrao implements Exame {

    public float valor;

    public ExamePadrao() {
    }

    public ExamePadrao(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return "Exame Padrão";
    }
}
