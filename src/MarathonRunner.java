public class MarathonRunner extends Athlete{

    public MarathonRunner(){
        runBehavior = new RunMarathon();
        wrestleBehavior = new WrestleNoWay();
        swimBehavior = new SwimNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am Marathon Runner");
    }
}
