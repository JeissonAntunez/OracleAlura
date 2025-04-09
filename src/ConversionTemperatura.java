public class ConversionTemperatura {
    public static void main (String[] args){
        System.out.println("Hola");



        class ConversionFahrenheit {
            double convertir(double celsius) {
                return (celsius * 1.8) + 32;
            }
        }

        int temperaturaCelsius = 16;
        // Creamos una instancia de la clase
        ConversionFahrenheit conver = new ConversionFahrenheit();
        double temperaturaFahrenheit = conver.convertir(temperaturaCelsius);
        int castingEntero = (int) temperaturaFahrenheit;
        System.out.println(("La temperatura celsius que es %d en conversion a Faherenheit es %f \n " +
                " quitando los decimales de la temperatura Fahrenheit quedaria en %d ").formatted(temperaturaCelsius,temperaturaFahrenheit,castingEntero));





    }
}
