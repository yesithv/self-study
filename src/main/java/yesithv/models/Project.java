package yesithv.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private UUID id;
    private String name;
    private List<Task> taskList;

    public Project(String name, List<Task> taskList) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.taskList = taskList;
    }

}
