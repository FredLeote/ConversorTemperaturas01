package pt.ipg.conversortemperaturas;

public class TemperaturaCelsius extends Temperatura {
    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus Fahrenheit
     */
    @Override
    public double getFahrenheit() {
        return valor * 9 / 5 + 32.0; // todo: corrigir BUG
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
