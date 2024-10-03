public class PalmTree extends Plants {
    //Ärver Plants

    //Nedanför - Enum
    private final WaterType waterType = WaterType.KRANVATTEN;

    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    //Nedanför - Polymorfism
    @Override
    public double wateringNeeds() {
        double waterNeedInLiter = 0.5;
        return waterNeedInLiter * getHeightInMeters();
    }

    @Override
    public String printWateringNeeds() {
        return getName() + " behöver " + wateringNeeds() + " l " + waterType.water + " per dag.";
    }
}
