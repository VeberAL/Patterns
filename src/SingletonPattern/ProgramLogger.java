package SingletonPattern;

public class ProgramLogger {
    private static  ProgramLogger programLogger;
    private static String LogFile = "This is log file.\n\n";
    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }
    public void addLogInfo(String logInfo){
        LogFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(LogFile);
    }
}

