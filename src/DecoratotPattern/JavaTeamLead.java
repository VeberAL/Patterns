package DecoratotPattern;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
       return "Send week report.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
