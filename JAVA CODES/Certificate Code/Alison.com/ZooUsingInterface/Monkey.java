package ZooUsingInterface;

public class Monkey extends Herbivorous{
    @Override
    public String getSound() {
        return "Chatter (Khikhiyana)";
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
