public class Hogwarts {
    protected final String firstName;
    protected final String lastName;
    protected final int magicPower;
    protected final int transgressionDistance;

    public Hogwarts(String firstName, String lastName, int magicPower, int transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = checkParameter(magicPower);
        this.transgressionDistance = checkParameter(transgressionDistance);
    }

    public Hogwarts() {
        throw new IllegalArgumentException("Нельзя принять в Хогвартс безымянного человека без способностей к магии!");
    }

    private int checkParameter(int param) {
        if (param < 0) {
            throw new IllegalArgumentException("Значение не должно быть меньше 0!");
        } else if (param > 100) {
            throw new IllegalArgumentException("Значение не должно быть больше 100!");
        }
        return param;
    }

    public void bestStudentHogwarts(Object o) {
        if (this == o) throw new IllegalArgumentException("Это один и тот же ученик!");
        Hogwarts student2;
        if (o instanceof Hogwarts) {
            student2 = (Hogwarts) o;
        } else {
            throw new IllegalArgumentException("Можно сравнивать силу" +
                    " учеников только между учениками!");
        }
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

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    private int getPower() {
        return magicPower + transgressionDistance;
    }

    @Override
    public String toString() {
        return getFullName() + ": Сила магии =" + magicPower +
                ", Дальность трансгресии =" + transgressionDistance;
    }
}
