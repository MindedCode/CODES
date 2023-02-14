package ZooUsingInterface;

public class Lion extends Carnivorous{
    @Override
    public String getSound() {
        return "Roar";
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
