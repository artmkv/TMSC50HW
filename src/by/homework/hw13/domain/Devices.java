package by.homework.hw13.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Devices {

    private List<Device> devicesList;

    public Devices() {
    }

    @JsonCreator
    public Devices(@JsonProperty("device") List<Device> devicesList) {
        this.devicesList = devicesList;
    }

    public List<Device> getDevicesList() {
        return devicesList;
    }

    public void setDevicesList(List<Device> devicesList) {
        this.devicesList = devicesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devices devices = (Devices) o;

        return devicesList != null ? devicesList.equals(devices.devicesList) : devices.devicesList == null;
    }

    @Override
    public int hashCode() {
        return devicesList != null ? devicesList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devicesList=" + devicesList +
                '}';
    }
}
