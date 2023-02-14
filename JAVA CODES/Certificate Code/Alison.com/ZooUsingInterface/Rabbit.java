package ZooUsingInterface;

public class Rabbit extends Herbivorous{
    @Override
    public String getSound() {
        return "Rabbit Sound";
    }

    @Override
    public String getCollar() {
        return collar.getSmallCollar();
    }

    @Override
    public String getCageType() {
        return cage.getSmallCage();
    }
}
