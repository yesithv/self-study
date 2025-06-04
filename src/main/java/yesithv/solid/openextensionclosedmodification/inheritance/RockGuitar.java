package yesithv.solid.openextensionclosedmodification.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RockGuitar extends Guitar {
    private String color;

    public RockGuitar(String model, int volume, String color) {
        setModel(model);
        setVolume(volume);
        setColor(color);
    }

}