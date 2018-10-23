package module8.webinar;

import java.util.List;

public class Task implements Comparable<Task>{
    private String description;
    List<Solution> solutions;

    public Task(String description) {
        this.description = description;
    }

    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }

    @Override
    public int compareTo(Task task) {
        return this.description.length()-task.description.length();
    }

    @Override
    public String toString() {
        return description;
    }
}
