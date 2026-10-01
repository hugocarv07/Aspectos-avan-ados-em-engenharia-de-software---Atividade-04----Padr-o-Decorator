package padroesprojeto.decorator.hospital;

public abstract class ExameDecorator implements Exame {

    private Exame exame;

    public ExameDecorator(Exame exame) {
        this.exame = exame;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public abstract float getPercentualAcrescimo();

    public float getValor() {
        return this.exame.getValor() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDescricao() {
        return this.exame.getDescricao() + "/" + this.getNomeAdicional();
    }
}
