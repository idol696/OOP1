public class Main {
    public static void main(String[] args) {

        Gryffindor studentHarryPotter = new Gryffindor("Harry", "Potter", 80, 56, 90, 91, 92);
        Gryffindor studentHermioneGranger = new Gryffindor("Hermione", "Granger", 56, 87, 30, 60, 80);
        Gryffindor studentRonWeasley = new Gryffindor("Ron", "Weasley", 10, 23, 55, 43, 60);

        Slytherin studentDracoMalfoy = new Slytherin("Draco", "Malfoy", 90, 1, 10, 70, 99, 1, 70);
        Slytherin studentGrahamMontague = new Slytherin("Graham", "Montague", 30, 75, 34, 67, 43, 40, 13);
        Slytherin studentGregoryGoyle = new Slytherin("Gregory", "Goyle", 10, 76, 20, 60, 10, 30, 15);

        Hufflepuff studentZachariahSmith = new Hufflepuff("Zachariah", "Smith", 85, 15, 35, 67, 88);
        Hufflepuff studentCedricDiggory = new Hufflepuff("Cedric", "Diggory", 40, 90, 43, 12, 78);
        Hufflepuff studentJustinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 50, 50, 25, 65, 44);

        Kogtevran studentZhouChang = new Kogtevran("Zhou", "Chang", 84, 36,54,54,10,34);
        Kogtevran studentPadmaPatil = new Kogtevran("Padma", "Patil", 70, 77,65,87,34,20);
        Kogtevran sudentMarcusBelby = new Kogtevran("Marcus", "Belby", 40, 48,87,43,23,54);

        //померим Гриффиндорцев
        studentHarryPotter.bestStudentFaculty(studentHermioneGranger);
        studentDracoMalfoy.bestStudentFaculty(studentGregoryGoyle);
        studentCedricDiggory.bestStudentFaculty(studentJustinFinchFletchley);

        //померим студентов - общие навыки, например Поттера с Малфоем
        studentHarryPotter.bestStudentHogwarts(studentDracoMalfoy);

        //Гарри Поттер Победил!
        System.out.println(studentHarryPotter);
    }
}