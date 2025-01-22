package yesithv.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Seniority {

    JR("Junior", 4, Boolean.TRUE),
    SS("Semi Senior", 6, Boolean.FALSE),
    SR("Senior", 10, Boolean.TRUE),
    AD("Advanced", 15, Boolean.TRUE);

    private final String name;
    private final Integer yearsOfExperience;
    private final boolean enabled;
}
