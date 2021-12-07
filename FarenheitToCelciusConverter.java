public class FarenheitToCelciusConverter implements TemperatureConverter {
    public float convert(float t) {
        return (float) ((t - 32) * (5.0 / 9.0));
    }
}
