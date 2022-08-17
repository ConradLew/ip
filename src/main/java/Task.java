public class Task {
    private String taskDescription;
    private boolean completed;

    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.completed = false;
    }

    public void setCompleted() {
        this.completed = true;
    }

    public void setUncompleted() {
        this.completed = false;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }

    @Override
    public String toString() {
        String taskStatusIndicator = this.completed ? " [X] " : " [ ] ";
        return taskStatusIndicator + this.taskDescription;
    }
}