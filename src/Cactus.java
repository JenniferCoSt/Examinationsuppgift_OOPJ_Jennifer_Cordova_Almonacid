public class Cactus extends Plants {
    //Ärver Plants

    //Nedanför - Enum
    private final WaterType waterType = WaterType.MINERALVATTEN;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    //Nedanför - Polymorfism
    @Override
    public double wateringNeeds() {
        double waterNeedInLiter = 0.02;
        return waterNeedInLiter;
    }

    @Override
    public String printWateringNeeds() {
        return getName() + " behöver " + wateringNeeds() + " l " + waterType.water + " per dag.";
    }
}
