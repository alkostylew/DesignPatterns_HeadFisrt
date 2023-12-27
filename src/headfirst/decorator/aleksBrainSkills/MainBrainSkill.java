package headfirst.decorator.aleksBrainSkills;

public class MainBrainSkill {

    public static void main(String[] args) {

        BrainSkill brainSkill = new NewBrain();

        printDecorators(brainSkill);

        brainSkill = new NewBrain();
        brainSkill = new ProgrammingSkill(brainSkill);
        brainSkill = new MusicSkill(brainSkill);
        brainSkill = new SpiritualSkill(brainSkill);

        printDecorators(brainSkill);
    }

    private static void printDecorators(BrainSkill brainSkill) {
        System.out.println("Brain Skills Decorator Result");
        System.out.println("=============================");
        System.out.println("Skills description: " + brainSkill.getSkillDescription());
        System.out.println("Paths to acquire the skill: " + brainSkill.getPathToAcquire());
        System.out.println("Months to acquire all the skills: " + brainSkill.getMonthsToAcquire());
        System.out.println("\n");
    }

}
