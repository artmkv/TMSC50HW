package by.homework.hw13.domain;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Type {

    private boolean peripheral;
    private double power;
    private boolean fan;

    public Type() {

    }

    @JsonCreator
    public Type(
            @JsonProperty("peripheral") boolean peripheral,
            @JsonProperty("power") double power,
            @JsonProperty("fun") boolean fan) {
        this.peripheral = peripheral;
        this.power = power;
        this.fan = fan;
    }

    @Override
    public String toString() {
        return "Type{" +
                "peripheral=" + peripheral +
                ", power=" + power +
                ", fan=" + fan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Type type = (Type) o;

        if (peripheral != type.peripheral) return false;
        if (Double.compare(type.power, power) != 0) return false;
        return fan == type.fan;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (peripheral ? 1 : 0);
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fan ? 1 : 0);
        return result;
    }

    public boolean isPeripheral() {
        return peripheral;
    }

    public void setPeripheral(boolean peripheral) {
        this.peripheral = peripheral;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isFan() {
        return fan;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }
}
