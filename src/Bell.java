/**
 *
 * @author tackedev
 * @since Jan 18, 2021 8:42:00 AM
 */
public class Bell {
    private String id;
    private String manufacturer;
    private double frequency;
    private double weight;

    public Bell() {
    }

    public Bell(String id) {
        this.id = id;
    }

    public Bell(String id, String manufacturer, double frequency, double weight) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Bell)obj).getId());
    }

    @Override
    public String toString() {
        return "id: " + id + "; manufacturer: " + manufacturer + "; frequency: " + frequency + "Hz; weight: " + weight + "kg";
    }
}
