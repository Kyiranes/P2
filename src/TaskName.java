public class TaskName {
    public TaskName(String name, String description, int priority) {
        this.priority = priority;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", priority=" + priority +
                ", description='" + description + '\'';
    }

    private String name;
    private int priority;
    private String description;


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        while(true) {
            try {
                if (priority < 0) {
                    this.priority = 0;
                    break;
                } else if (priority > 5) {
                    this.priority = 5;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid priority value");
                priority = 0;
            }
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
