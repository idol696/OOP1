public class Hufflepuff {
    private Hogwarts student;
    private final int workaholic;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(Hogwarts student, int workaholic, int loyalty, int honesty) {
        if (student != null) this.student = student;
        this.workaholic = CheckParameter(workaholic);
        this.loyalty = CheckParameter(loyalty);
        this.honesty = CheckParameter(honesty);
    }

    public Hufflepuff() {
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

    public void equalsBestFaculty(Hufflepuff student2) {
        System.out.println("Анализ по Факультету Пуффендуй:");
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

    public String getFullName() {
        return student.getFullName();
    }

    public void equalsBestHogwarts(Object o) {
        student.equalsBestHogwarts(o);
    }

    private int getPower() {
        return workaholic + loyalty + honesty;
    }

    @Override
    public String toString() {
        return  student.toString() + ", Трудолюбие = " + workaholic +
                ", Верность = " + loyalty +
                ", Честность = " + honesty;
    }

}
