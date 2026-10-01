package padroesprojeto.decorator.hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExameTest {

    @Test
    void deveRetornarValorExame() {
        Exame exame = new ExamePadrao(1000.0f);

        assertEquals(1000.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComColetaDomiciliar() {
        Exame exame = new ColetaDomiciliar(new ExamePadrao(1000.0f));

        assertEquals(1100.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComExameUrgente() {
        Exame exame = new ExameUrgente(new ExamePadrao(1000.0f));

        assertEquals(1200.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComLaudoDetalhado() {
        Exame exame = new LaudoDetalhado(new ExamePadrao(1000.0f));

        assertEquals(1050.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComColetaDomiciliarMaisExameUrgente() {
        Exame exame = new ColetaDomiciliar(new ExameUrgente(new ExamePadrao(1000.0f)));

        assertEquals(1320.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComColetaDomiciliarMaisLaudoDetalhado() {
        Exame exame = new ColetaDomiciliar(new LaudoDetalhado(new ExamePadrao(1000.0f)));

        assertEquals(1155.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComExameUrgenteMaisLaudoDetalhado() {
        Exame exame = new ExameUrgente(new LaudoDetalhado(new ExamePadrao(1000.0f)));

        assertEquals(1260.0f, exame.getValor());
    }

    @Test
    void deveRetornarValorExameComColetaDomiciliarMaisExameUrgenteMaisLaudoDetalhado() {
        Exame exame = new ColetaDomiciliar(new ExameUrgente(new LaudoDetalhado(new ExamePadrao(1000.0f))));

        assertEquals(1386.0f, exame.getValor());
    }

    @Test
    void deveRetornarDescricaoExame() {
        Exame exame = new ExamePadrao();

        assertEquals("Exame Padrão", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComColetaDomiciliar() {
        Exame exame = new ColetaDomiciliar(new ExamePadrao());

        assertEquals("Exame Padrão/Coleta Domiciliar", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComExameUrgente() {
        Exame exame = new ExameUrgente(new ExamePadrao());

        assertEquals("Exame Padrão/Urgente", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComLaudoDetalhado() {
        Exame exame = new LaudoDetalhado(new ExamePadrao());

        assertEquals("Exame Padrão/Laudo Detalhado", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComColetaDomiciliarMaisExameUrgente() {
        Exame exame = new ColetaDomiciliar(new ExameUrgente(new ExamePadrao()));

        assertEquals("Exame Padrão/Urgente/Coleta Domiciliar", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComColetaDomiciliarMaisLaudoDetalhado() {
        Exame exame = new ColetaDomiciliar(new LaudoDetalhado(new ExamePadrao()));

        assertEquals("Exame Padrão/Laudo Detalhado/Coleta Domiciliar", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComExameUrgenteMaisLaudoDetalhado() {
        Exame exame = new ExameUrgente(new LaudoDetalhado(new ExamePadrao()));

        assertEquals("Exame Padrão/Laudo Detalhado/Urgente", exame.getDescricao());
    }

    @Test
    void deveRetornarDescricaoExameComColetaDomiciliarMaisExameUrgenteMaisLaudoDetalhado() {
        Exame exame = new ColetaDomiciliar(new ExameUrgente(new LaudoDetalhado(new ExamePadrao())));

        assertEquals("Exame Padrão/Laudo Detalhado/Urgente/Coleta Domiciliar", exame.getDescricao());
    }
}
