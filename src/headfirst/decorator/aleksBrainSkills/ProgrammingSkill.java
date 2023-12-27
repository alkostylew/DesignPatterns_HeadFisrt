package headfirst.decorator.aleksBrainSkills;

public class ProgrammingSkill extends SkillDecorator {
    public ProgrammingSkill(BrainSkill newBrain) {
        super(newBrain);
    }

    public String getSkillDescription() {
        return brainSkill.getSkillDescription() + ", programing skills";
    }

    public String getPathToAcquire() {
        return brainSkill.getPathToAcquire() + ", learn java technology (60 months)";
    }

    public int getMonthsToAcquire() {
        return brainSkill.getMonthsToAcquire() + 60;
    }
}
