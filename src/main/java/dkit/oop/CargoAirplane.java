package dkit.oop;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
    private int MAX_LOAD_KILOS;
    private int currentLoad;

    // constructor
    public CargoAirplane(String type, int maxLoad)
    {
        super(type);
        this.MAX_LOAD_KILOS = maxLoad;
    }

    // toString()
    @Override
    public String toString() {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }


} // END of CargoAirplane class.

