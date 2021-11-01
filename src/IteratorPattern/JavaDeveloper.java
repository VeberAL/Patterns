package IteratorPattern;

public class JavaDeveloper implements Collection{
    private String Name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.Name = Name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    private class SkillIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
