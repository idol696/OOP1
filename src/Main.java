public class Main {
    public static void main(String[] args) throws Exception {

        Hogwarts HarryPotter = new Hogwarts("Harry", "Potter", 80, 56);
        Hogwarts HermioneGranger = new Hogwarts("Hermione", "Granger", 56, 87);
        Hogwarts RonWeasley = new Hogwarts("Ron", "Weasley", 10, 23);
        Gryffindor studentHarryPotter = new Gryffindor(HarryPotter, 90, 91, 92);
        Gryffindor studentHermioneGranger = new Gryffindor(HermioneGranger, 30, 60, 80);
        Gryffindor studentRonWeasley = new Gryffindor(RonWeasley, 55, 43, 60);

        Hogwarts DracoMalfoy = new Hogwarts("Draco", "Malfoy", 90, 1);
        Hogwarts GrahamMontague = new Hogwarts("Graham", "Montague", 30, 75);
        Hogwarts GregoryGoyle = new Hogwarts("Gregory", "Goyle", 10, 76);
        Slytherin studentDracoMalfoy = new Slytherin(DracoMalfoy, 10, 70, 99, 1, 70);
        Slytherin studentGrahamMontague = new Slytherin(GrahamMontague, 34, 67, 43, 40, 13);
        Slytherin studentGregoryGoyle = new Slytherin(GregoryGoyle, 20, 60, 10, 30, 15);

        Hogwarts ZachariahSmith = new Hogwarts("Zachariah", "Smith", 85, 15);
        Hogwarts CedricDiggory = new Hogwarts("Cedric", "Diggory", 40, 90);
        Hogwarts JustinFinchFletchley = new Hogwarts("Justin", "Finch-Fletchley", 50, 50);
        Hufflepuff studentZachariahSmith = new Hufflepuff(ZachariahSmith, 35, 67, 88);
        Hufflepuff studentCedricDiggory = new Hufflepuff(CedricDiggory, 43, 12, 78);
        Hufflepuff studentJustinFinchFletchley = new Hufflepuff(JustinFinchFletchley, 25, 65, 44);

        Hogwarts ZhouChang = new Hogwarts("Zhou", "Chang", 84, 36);
        Hogwarts PadmaPatil = new Hogwarts("Padma", "Patil", 70, 77);
        Hogwarts MarcusBelby = new Hogwarts("Marcus", "Belby", 40, 48);
        Kogtevran studentZhouChang = new Kogtevran(ZhouChang,54,54,10,34);
        Kogtevran studentPadmaPatil = new Kogtevran(PadmaPatil,65,87,34,20);
        Kogtevran sudentMarcusBelby = new Kogtevran(MarcusBelby,87,43,23,54);

        //померим Гриффиндорцев
        studentHarryPotter.equalsBestFaculty(studentHermioneGranger);
        studentDracoMalfoy.equalsBestFaculty(studentGregoryGoyle);

        //померим студентов - общие навыки, например Поттера с Малфоем
        studentHarryPotter.equalsBestHogwarts(studentDracoMalfoy);

        //Гарри Поттер Победил!
        System.out.println(studentHarryPotter);
    }
}