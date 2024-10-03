public class CarnivorousPlant extends Plants {
    //Ärver Plants

    //Nedanför - Enum
    private final WaterType waterType = WaterType.PROTEINDRYCK;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    //Nedanför - Polymorfism
    @Override
    public double wateringNeeds() {
        double nutritionNeedInLiter = 0.1;
        double extraNutritionInLiter = 0.2;
        return (extraNutritionInLiter * getHeightInMeters()) + nutritionNeedInLiter;
    }

    @Override
    public String printWateringNeeds() {
        return getName() + " behöver " + wateringNeeds() + " l " + waterType.water + " per dag.";
    }
}
