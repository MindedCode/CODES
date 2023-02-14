package ZooUsingInterface;

public abstract class Herbivorous implements Animal{
    protected Cage cage = new Cage();
    protected Collar collar = new Collar();

    public String getType(){
        return "Herbivorous";
    }
}
