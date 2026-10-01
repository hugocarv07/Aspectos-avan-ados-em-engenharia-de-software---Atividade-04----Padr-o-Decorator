package padroesprojeto.decorator.hospital;

public class ColetaDomiciliar extends ExameDecorator {

    public ColetaDomiciliar(Exame exame) {
        super(exame);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Coleta Domiciliar";
    }
}
