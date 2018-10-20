package pt.ipg.conversortemperaturas;

public abstract class Temperatura {
    protected double valor;

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus Fahrenheit
     */
    public abstract double getFahrenheit();

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return um número que representa a temperatura em graus Celsius
     */
    public abstract double getCelsius();
}
