public class SprintRunner extends Athlete{

    public SprintRunner() {
        runBehavior = new RunSprint();
        wrestleBehavior = new WrestleNoWay();
        swimBehavior = new SwimNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am Sprinter. I want to be like Usain Bolt");
    }
}
