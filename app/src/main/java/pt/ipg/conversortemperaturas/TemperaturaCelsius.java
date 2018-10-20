package pt.ipg.conversortemperaturas;

public class TemperaturaCelsius extends Temperatura {
    public TemperaturaCelsius(double valor) {
        this.valor = valor;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus Fahrenheit
     */
    @Override
    public double getFahrenheit() {
        return valor * 9.0 / 5.0 + 32.0;
    }

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus Celsius
     */
    @Override
    public double getCelsius() {
        return valor;
    }
}
