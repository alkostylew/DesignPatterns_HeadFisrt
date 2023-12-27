package headfirst.decorator.aleksBrainSkills;

public class SkillDecorator implements BrainSkill {

    protected final BrainSkill brainSkill;

    public SkillDecorator (BrainSkill brainSkill) {
        this.brainSkill = brainSkill;
    }
    
    @Override
    public String getSkillDescription() {
        return brainSkill.getSkillDescription();
    }

    @Override
    public String getPathToAcquire() {
        return brainSkill.getPathToAcquire();
    }

    @Override
    public int getMonthsToAcquire() {
        return brainSkill.getMonthsToAcquire();
    }
}
