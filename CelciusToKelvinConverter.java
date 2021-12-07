public class CelciusToKelvinConverter implements TemperatureConverter{
    public float convert(float t) {
        return (float) (t + 273.15);
    }
}
