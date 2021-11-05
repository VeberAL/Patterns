package ProxyPattern;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com.VeberAL/Patterns");
        //скачивание и запуск проекта происходит только после выполнения метода run
        project.run();
    }
}
