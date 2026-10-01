package padroesprojeto.decorator.hospital;

public class ExameUrgente extends ExameDecorator {

    public ExameUrgente(Exame exame) {
        super(exame);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Urgente";
    }
}
