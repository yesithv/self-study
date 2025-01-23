package yesithv.solid.openextensionclosedmodification.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar {
    private String model;
    private int volume;
}
