public class JudoWrestler extends Athlete{

    public JudoWrestler() {
        wrestleBehavior = new WrestleJudo();
        swimBehavior = new SwimNoWay();
        runBehavior = new RunNoWay();
    }

    @Override
    public void compete() {
        System.out.println("I am a Judoka");
    }
}
