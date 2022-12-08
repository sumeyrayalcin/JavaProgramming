package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA",110000);
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Tester[] testers = {tester1,tester2,tester3,tester4};

        //4 developers object

        Developer developer1 = new Developer("Olga",22,"Java Developer",125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers ={developer1,developer2,developer3,developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira",14);

        scrum.addDeveloper(developer1);
        scrum.addTester(tester1);

        System.out.println(scrum);

        System.out.println("---------------------");

        scrum.addDevelopers(developers);
        scrum.addTesters(testers);

        System.out.println(scrum);

        System.out.println("---------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);

        }

        System.out.println("-------------------------------");


        for (Developer eachDeveloper : scrum.devopsList) {

            System.out.println(eachDeveloper.name + ": "+ eachDeveloper.salary );
        }


        scrum.removeTester(23);
        scrum.removeDeveloper( 22 );

        System.out.println(scrum);




        //1 scrumTeam object


    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */