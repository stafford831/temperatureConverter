public class CelciusToFarenheitConverter implements TemperatureConverter {
    public float convert(float t) {
        return (float) (((9.0 / 5.0) * t) + 32);
    }
}
