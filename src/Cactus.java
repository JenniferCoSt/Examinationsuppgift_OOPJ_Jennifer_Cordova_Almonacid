public class Cactus extends Plants {
    //Ärver Plants

    private final WaterType waterType = WaterType.MINERALVATTEN;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    //Nedanför - Polymorfism
    @Override
    public double wateringNeeds() {
        double waterNeedPerDay = 0.02;
        return waterNeedPerDay;
    }

    @Override
    public String printWateringNeeds() {
        return getName() + " behöver " + wateringNeeds() + " l " + waterType.water + " per dag.";
    }
}
