import javax.swing.*;
import java.util.Arrays;
import java.util.List;


public class Huvudprogram {

    public Huvudprogram() {

        boolean program = true;

        WaterPlants igge = new Cactus("Igge", 0.2);
        WaterPlants laura = new PalmTree("Laura", 5);
        WaterPlants meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        WaterPlants olof = new PalmTree("Olof", 1);
        List<WaterPlants> checkedInPlants = Arrays.asList(igge, laura, meatloaf, olof);

        while (program) {
            String växt = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            if (växt != null) {

            boolean plantCheckedIn = false;
            for (WaterPlants p: checkedInPlants) {
                if (växt.equalsIgnoreCase(p.toString())) {
                    JOptionPane.showMessageDialog(null,p.printWateringNeeds());
                    plantCheckedIn = true;
                }
            }
            if (!plantCheckedIn) {
                JOptionPane.showMessageDialog(null, "Växten finns inte incheckad hos oss.");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Tack för denna gång!");
                program = false;
            }
        }
    }

    public static void main(String[] args) {

        Huvudprogram program = new Huvudprogram();

    }
}