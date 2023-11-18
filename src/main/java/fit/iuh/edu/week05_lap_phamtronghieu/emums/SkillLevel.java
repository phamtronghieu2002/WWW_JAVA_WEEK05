package fit.iuh.edu.week05_lap_phamtronghieu.emums;

public enum SkillLevel {
    MASTER(1),
    BEGINNER(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    INTERMEDIATE(5);

    private int value;

    private SkillLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

