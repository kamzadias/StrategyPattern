public class ModelAthlete extends Athlete{

    public ModelAthlete() {
        wrestleBehavior = new WrestleNoWay();
        swimBehavior = new SwimNoWay();
        runBehavior = new RunNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am Model Athlete");
    }
}
