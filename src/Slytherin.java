public class Slytherin extends Hogwarts {
    private Hogwarts student;
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int authoritativeness;

    public Slytherin(String firstName, String lastName, int magicPower, int transgressionDistance,  int cunning, int determination, int ambition, int resourcefulness, int authoritativeness) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.cunning = checkParameter(cunning);
        this.determination = checkParameter(determination);
        this.ambition = checkParameter(ambition);
        this.resourcefulness = checkParameter(resourcefulness);
        this.authoritativeness = checkParameter(authoritativeness);
    }

    public Slytherin() {
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

    public void bestStudentFaculty(Slytherin student2) {
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

    private int getPower() {
        return cunning + determination + ambition + resourcefulness + authoritativeness;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Хитрость = " + cunning +
                ", Целеустремленность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Авторитетность = " + authoritativeness;
    }

}
