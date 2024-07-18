public class Slytherin {
    private Hogwarts student;
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int authoritativeness;

    public Slytherin(Hogwarts student, int cunning, int determination, int ambition, int resourcefulness, int authoritativeness) {
        if (student != null) this.student = student;
        this.cunning = CheckParameter(cunning);
        this.determination = CheckParameter(determination);
        this.ambition = CheckParameter(ambition);
        this.resourcefulness = CheckParameter(resourcefulness);
        this.authoritativeness = CheckParameter(authoritativeness);
    }

    public Slytherin() {
        throw new IllegalArgumentException("Нельзя создать студента не числящегося в Хогвартсе!");
    }

    public Hogwarts getStudent() {
        return student;
    }

    private int CheckParameter(int param) {
        if (param < 0) {
            throw new IllegalArgumentException("Значение не должно быть меньше 0!");
        } else if (param > 100) {
            throw new IllegalArgumentException("Значение не должно быть больше 100!");
        }
        return param;
    }

    public void equalsBestFaculty(Slytherin student2) {
        System.out.println("Анализ по Факультету Слизерин:");
        int powerStudent1 = getPower();
        int powerStudent2 =  student2.getPower();
        if(powerStudent1 > powerStudent2) {
            System.out.println("Ученик " + getFullName() + " сильнее чем ученик " + student2.getFullName() );
        }
        else if (powerStudent1 < powerStudent2) {
            System.out.println("Ученик " + getFullName() + " слабее ученика " + student2.getFullName() );
        } else {
            System.out.println("Ученик " + getFullName() + " равен по силе " + student2.getFullName() );
        }
    }

    public void equalsBestHogwarts(Object o) {
        student.equalsBestHogwarts(o);
    }

    public String getFullName() {
        return student.getFullName();
    }

    private int getPower() {
        return cunning + determination + ambition + resourcefulness + authoritativeness;
    }

    @Override
    public String toString() {
        return  student.toString() + ", Хитрость = " + cunning +
                ", Целеустремленность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Авторитетность = " + authoritativeness;
    }

}
