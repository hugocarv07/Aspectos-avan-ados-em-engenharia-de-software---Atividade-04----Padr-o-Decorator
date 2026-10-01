package padroesprojeto.decorator.hospital;

public class LaudoDetalhado extends ExameDecorator {

    public LaudoDetalhado(Exame exame) {
        super(exame);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Laudo Detalhado";
    }
}
