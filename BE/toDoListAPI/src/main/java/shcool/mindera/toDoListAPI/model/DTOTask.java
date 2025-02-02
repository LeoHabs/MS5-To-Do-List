package shcool.mindera.toDoListAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DTOTask {
    private Integer taskId;
    private String title;
    private String description;
    private String endDate;
    private Boolean isDone;
    private Boolean expired;
    private List<DTOTag> tags;
    private Integer groupId;
}
