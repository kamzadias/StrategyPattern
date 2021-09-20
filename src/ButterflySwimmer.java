public class ButterflySwimmer extends Athlete {

    public ButterflySwimmer() {
        swimBehavior = new SwimButterfly();
        wrestleBehavior = new WrestleNoWay();
        runBehavior = new RunNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am butterly style Swimmer");
    }
}
