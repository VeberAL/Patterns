package IteratorPattern;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Hibernate","Maven","PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("",skills);
        javaDeveloper.setName("Alex");
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+ javaDeveloper.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString()+ " ");
        }
    }
}
