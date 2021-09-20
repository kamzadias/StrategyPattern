public class Main {

    public static void main(String[] args) {
        Athlete grappler = new GrapllingWrestler();
        grappler.compete();
        grappler.performWrestle();
        grappler.performSwim();
        grappler.performRun();

        System.out.println("--------------------");

        Athlete modelAthlete = new ModelAthlete();
        modelAthlete.compete();
        modelAthlete.performRun();
        modelAthlete.performWrestle();
        modelAthlete.performSwim();

        System.out.println("*****The cheat code is activated*****");
        modelAthlete.setWrestleBehavior(new WrestleJudo());
        modelAthlete.setRunBehavior(new RunSprint());
        modelAthlete.setSwimBehavior(new SwimFreestyle());
        modelAthlete.performRun();
        modelAthlete.performWrestle();
        modelAthlete.performSwim();
    }
}
