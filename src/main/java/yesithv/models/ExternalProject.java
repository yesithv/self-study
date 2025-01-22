package yesithv.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * INHERITANCE:
 * ExternalProject is a child class that inherits properties (fields) and behaviours (constructors and methods) from Project parent class
 */
@Data
@EqualsAndHashCode
public class ExternalProject extends Project {

    private Double budged;
    // java.time is more completed than Date, and easy to use
    private LocalDate dueDate;
    private boolean completed;

    public void finishProject(){
        this.setCompleted(Boolean.TRUE);
        System.out.println("The project: " + this.getName() + " with due date: " + getDueDate() + " is finished");
    }
}
