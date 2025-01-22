package yesithv.models;


import lombok.Data;


@Data
public class Task {

    private String code;
    private String description;
    private User owner;

}
