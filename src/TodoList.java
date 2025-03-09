import java.util.LinkedList;
import java.util.List;

public class TodoList {
    private List<Task> taskList;

    public TodoList(){
        taskList = new LinkedList<Task>();
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void completeTask(int index){
        Task task = taskList.get(index);
        task.setIsCompleted();
    }

    public void displayTasks(){
        for(Task task : taskList){
            System.out.println(task.getDescription() + " " + task.getIsCompleted());
        }
    }
}
