package headfirst.decorator.aleksBrainSkills;

public class MusicSkill extends SkillDecorator {
    public MusicSkill(BrainSkill newBrain) {
        super(newBrain);
    }

    public String getSkillDescription() {
        return brainSkill.getSkillDescription() + ", jazz music skills";
    }

    public String getPathToAcquire() {
        return brainSkill.getPathToAcquire() + ", learn jazz piano (120 months)";
    }

    public int getMonthsToAcquire() {
        return brainSkill.getMonthsToAcquire() + 120;
    }
}
