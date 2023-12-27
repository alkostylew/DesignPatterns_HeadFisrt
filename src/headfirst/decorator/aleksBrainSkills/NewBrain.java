package headfirst.decorator.aleksBrainSkills;

public class NewBrain implements BrainSkill {

    public NewBrain() {}

    @Override
    public String getSkillDescription() {
        return "Child skills";
    }

    @Override
    public String getPathToAcquire() {
        return String.format("Be born (%d months)", getMonthsToAcquire());
    }

    @Override
    public int getMonthsToAcquire() {
        return 0;
    }
}
