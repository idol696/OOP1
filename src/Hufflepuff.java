public class Hufflepuff extends Hogwarts{
    private final int workaholic;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String firstName, String lastName, int magicPower, int transgressionDistance,
                      int workaholic, int loyalty, int honesty) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.workaholic = checkParameter(workaholic);
        this.loyalty = checkParameter(loyalty);
        this.honesty = checkParameter(honesty);
    }

    public Hufflepuff() {
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

    public void bestStudentFaculty(Hufflepuff student2) {
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

    private int getPower() {
        return workaholic + loyalty + honesty;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Трудолюбие = " + workaholic +
                ", Верность = " + loyalty +
                ", Честность = " + honesty;
    }

}
