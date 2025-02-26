import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonajeTest {
    @ParameterizedTest(name = "Con vida inicial {0} y daño {1}, se espera que la vida sea {2}")
    @CsvSource({
            // Caso: daño negativo (se setea la vida al valor de restarle al valor positivo ya que no tiene sentido restarle un valor negativo a la vida)
            "10, -5, 5",
            // Caso: daño mayor que la vida
            "10, 15, 0",
            // Caso: daño menor que la vida
            "10, 5, 5",
            // Caso: daño igual a la vida (se resta y queda 0)
            "10, 10, 0",
            // Caso: daño 0, la vida permanece igual
            "10, 0, 10",
            // Caso: vida menor o igual a 0 (sin importar el daño, la vida es 0)
            "0, 5, 0",
            "-1, 3, 0",
            "908,10,898"
    })
    void testPerderVida(int vidaInicial, int dano, int vidaEsperada) {
        Personaje objeto = new Personaje("Mutenroy",vidaInicial);
        int resultado = objeto.perderVida(dano);
        assertEquals(vidaEsperada, resultado, "Falló para vidaInicial: " + vidaInicial + " y daño: " + dano);
    }

}