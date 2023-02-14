package ZooUsingInterface;

public abstract class Carnivorous implements Animal{
    protected Cage cage = new Cage();
    protected Collar collar = new Collar();

    public String getType(){
        return "carnivorous";
    }
}

