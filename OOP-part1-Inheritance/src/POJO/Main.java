package POJO;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92100" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Suzan";
                        case 3 -> "Shawn";
                        case 4 -> "Anna";
                        case 5 -> "Lee Ann";
                        default -> "Anonymous";
                    },
                    "05/05/2022",
                    "Java Masterclass");
            System.out.println(s);
        }
        System.out.println();


        Student pojoStudent = new Student("1","Ann",
                "01/02/2020","Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("2","Bill",
                "05/01/2010","Java Masterclass");


        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println();

        System.out.println(pojoStudent.getName()+" is taking "+
                pojoStudent.getClassList());

        //record class doesn't have get prefix as POJO
        //record class doesn't have set methods either. So you can't set data
        //if you just need to read data from the database, it is better to use record class, otherwise,
        // pojo is more helpful if you want to set data as well
        System.out.println(recordStudent.name()+" is taking "+
                recordStudent.classList());
    }
}
