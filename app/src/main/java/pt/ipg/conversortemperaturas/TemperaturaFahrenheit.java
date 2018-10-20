package pt.ipg.conversortemperaturas;

public class TemperaturaFahrenheit extends Temperatura {
    public TemperaturaFahrenheit(double valor) {
        this.valor = valor;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     *
     * @return um número que representa a temperatura em graus Fahrenheit
     */
    @Override
    public double getFahrenheit() {
        return valor;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     *
     * @return um número que representa a temperatura em graus Celsius
     */
    @Override
    public double getCelsius() {
        return (valor - 32.0) / (9.0 / 5.0);
    }
}
