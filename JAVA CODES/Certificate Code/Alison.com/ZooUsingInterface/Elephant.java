package ZooUsingInterface;

public class Elephant extends Herbivorous{

    @Override
    public String getSound() {
        return "Trumpet";
    }

    @Override
    public String getCollar() {
        return collar.getLargeCollar();
    }

    @Override
    public String getCageType() {
        return cage.getLargeCage();
    }
}
