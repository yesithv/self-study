package yesithv.solid.openextensionclosedmodification.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RockGuitar extends Guitar {
    private String flameColor;

    public RockGuitar(String model, int volume, String flameColor) {
        setModel(model);
        setVolume(volume);
        setFlameColor(flameColor);
    }

}