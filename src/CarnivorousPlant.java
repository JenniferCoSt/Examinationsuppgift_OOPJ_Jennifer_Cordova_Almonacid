public class CarnivorousPlant extends Plants {
    //Ärver Plants

    private final WaterType waterType = WaterType.PROTEINDRYCK;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    //Nedanför - Polymorfism
    @Override
    public double wateringNeeds() {
        double nutritionNeedPerDay = 0.1;
        double nutritionPerMeter = 0.2;
        return (nutritionPerMeter * getHeightInMeters()) + nutritionNeedPerDay;
    }

    @Override
    public String printWateringNeeds() {
        return getName() + " behöver " + wateringNeeds() + " l " + waterType.water + " per dag.";
    }
}
