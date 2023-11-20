package fit.iuh.edu.week05_lap_phamtronghieu.emums;

public enum SkillType {

    SOFT_SKILL(2),
    TECHNICAL_SKILL(0),
     UNSPECIFC(1)  ;

    private int value;

    SkillType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
