public class FreestyleSwimmer extends Athlete{
    public FreestyleSwimmer() {
        swimBehavior = new SwimFreestyle();
        wrestleBehavior = new WrestleNoWay();
        runBehavior = new RunNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am Freestyle Swimmer");
    }

}
