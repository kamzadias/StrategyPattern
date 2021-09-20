public class GrapllingWrestler extends Athlete{

    public GrapllingWrestler() {
        wrestleBehavior = new WrestleGrappling();
        swimBehavior = new SwimNoWay();
        runBehavior = new RunNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am a Grapller");
    }
}
