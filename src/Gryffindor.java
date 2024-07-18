public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String firstName, String lastName, int magicPower, int transgressionDistance, int nobility,
                      int honor, int courage) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.nobility = checkParameter(nobility);
        this.honor = checkParameter(honor);
        this.courage = checkParameter(courage);
    }

    public Gryffindor() {
        throw new IllegalArgumentException("Нельзя создать студента не числящегося в Хогвартсе!");
    }


    private int checkParameter(int param) {
        if (param < 0) {
            throw new IllegalArgumentException("Значение не должно быть меньше 0!");
        } else if (param > 100) {
            throw new IllegalArgumentException("Значение не должно быть больше 100!");
        }
        return param;
    }

    public void bestStudentFaculty(Gryffindor student2) {
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

    private int getPower() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Благородство = " + nobility +
                ", Честь = " + honor +
                ", Смелость = " + courage;
    }
}
