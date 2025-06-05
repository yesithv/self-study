package yesithv.collections.arrays;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
@Data
public class Fruits {
    private String name;
    private String color;
    private Integer size;
}
