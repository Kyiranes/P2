public class TaskName {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }


}
