package StrategyPattern;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.activity.JustDoIt();
        developer.setActivity(new Reading());
        developer.activity.JustDoIt();
        developer.setActivity(new Training());
        developer.activity.JustDoIt();
        developer.setActivity(new Sleeping());
        developer.activity.JustDoIt();
    }

}
