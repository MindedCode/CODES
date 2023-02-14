package ZooUsingInterface;

public class Dog extends Carnivorous {
    @Override
    public String getType() {
        return "Carnivorous";
    }

    @Override
    public String getSound() {
        return "Dog Sound";
    }

    @Override
    public String getCollar() {
        return collar.getMediumCollar();
    }

    @Override
    public String getCageType() {
        return cage.getMediumCage();
    }
}
