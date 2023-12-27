package headfirst.decorator.aleksBrainSkills;

public class SpiritualSkill extends SkillDecorator {
    public SpiritualSkill(BrainSkill newBrain) {
        super(newBrain);
    }

    public String getSkillDescription() {
        return brainSkill.getSkillDescription() + ", develop spiritual skills";
    }

    public String getPathToAcquire() {
        return brainSkill.getPathToAcquire() + ", read Spiritual books (24 months)";
    }

    public int getMonthsToAcquire() {
        return brainSkill.getMonthsToAcquire() + 24;
    }
}
