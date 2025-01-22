package yesithv.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class InternalProject extends Project{

    private Integer priority;
}
