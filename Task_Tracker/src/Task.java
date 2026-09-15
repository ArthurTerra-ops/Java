public class Task {

    private final String name;
    private final int priority;


    public Task(final String name,final int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }
    public String getName(){
        return name;
    }
}
