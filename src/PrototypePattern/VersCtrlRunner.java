package PrototypePattern;

public class VersCtrlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"Pr1", "Code code = new Code();");
        System.out.println(master);
        //Копирует объект
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("Копия:");
        System.out.println(masterClone);
    }
}
