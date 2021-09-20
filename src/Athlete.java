
public abstract class Athlete {
    RunBehavior runBehavior;
    SwimBehavior swimBehavior;
    WrestleBehavior wrestleBehavior;

    public Athlete(){

    }

    public void performRun(){
        runBehavior.run();
    }
    public void performSwim(){
        swimBehavior.swim();
    }
    public void performWrestle(){
        wrestleBehavior.wrestle();
    }

    public abstract void compete();

    public RunBehavior getRunBehavior() {
        return runBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public WrestleBehavior getWrestleBehavior() {
        return wrestleBehavior;
    }

    public void setRunBehavior(RunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void setWrestleBehavior(WrestleBehavior wrestleBehavior) {
        this.wrestleBehavior = wrestleBehavior;
    }

}
