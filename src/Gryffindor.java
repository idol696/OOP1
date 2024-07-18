public class Gryffindor {
    private Hogwarts student;
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(Hogwarts student, int nobility, int honor, int courage) {
        if (student != null) this.student = student;
        this.nobility = CheckParameter(nobility);
        this.honor = CheckParameter(honor);
        this.courage = CheckParameter(courage);
    }

    public Gryffindor() {
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

    public void equalsBestFaculty(Gryffindor student2) {
        System.out.println("Анализ по Факультету Гриффиндор:");
        int powerStudent1 = getPower();
        int powerStudent2 = student2.getPower();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Ученик " + getFullName() + " сильнее чем ученик " + student2.getFullName());
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Ученик " + getFullName() + " слабее ученика " + student2.getFullName());
        } else {
            System.out.println("Ученик " + getFullName() + " равен по силе " + student2.getFullName());
        }
    }

    public void equalsBestHogwarts(Object o) {
        student.equalsBestHogwarts(o);
    }

    private int getPower() {
        return nobility + honor + courage;
    }

    public String getFullName() {
        return student.getFullName();
    }

    @Override
    public String toString() {
        return student.toString() + ", Благородство = " + nobility +
                ", Честь = " + honor +
                ", Смелость = " + courage;
    }
}
