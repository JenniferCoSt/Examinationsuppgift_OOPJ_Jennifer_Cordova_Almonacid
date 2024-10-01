public abstract class Plants implements WaterPlants {
    //Ovanför - Superklass Plants. Interface WaterPlants.

    private String name;
    private double heightInMeters;
    //Ovanför - Inkapsling. Privata variabler

    public Plants(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    //Nedanför - Inkapsling. Setters och getters för de privata variablerna ovan.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double height) {
        this.heightInMeters = height;
    }

    @Override
    public String toString() {
        return getName();
    }

}
