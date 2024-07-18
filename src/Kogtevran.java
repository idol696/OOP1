public class Kogtevran {
    private Hogwarts student;
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Kogtevran(Hogwarts student, int smart, int wise, int witty, int creativity) {
        if (student != null) this.student = student;
        this.smart = CheckParameter(smart);
        this.wise = CheckParameter(wise);
        this.witty = CheckParameter(witty);
        this.creativity = CheckParameter(creativity);
    }

    public Kogtevran() {
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

    public void equalsBestFaculty(Kogtevran student2) {
        System.out.println("Анализ по Факультету Когтевран:");
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
        return smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return  student.toString() + ", Ум = " + smart +
                ", Мудрость = " + wise +
                ", Остроумность = " + witty +
                ", Креативность = " + creativity;
    }

}
