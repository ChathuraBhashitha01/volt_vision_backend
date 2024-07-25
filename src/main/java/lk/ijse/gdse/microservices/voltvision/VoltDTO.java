package lk.ijse.gdse.microservices.voltvision;

public class VoltDTO {

    private String id;
    private String time;
    private double volt;
    private double amp;

    public VoltDTO() {
    }

    public VoltDTO(String id,String time, double volt, double amp) {
        this.id = id;
        this.time = time;
        this.volt = volt;
        this.amp = amp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public double getAmp() {
        return amp;
    }

    public void setAmp(double amp) {
        this.amp = amp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "VoltDTO{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", volt=" + volt +
                ", amp=" + amp +
                '}';
    }
}
