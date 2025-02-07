package yesithv.exceptions;

public class ThrowSentence {
    public static void main(String[] args) throws Exception {
        int id = 0;
        validate(id);
    }
    public static void validate(int id) throws Exception {
        if(id == 0){
            throw new CustomizedException("Id can not be zero");
        }
    }
}
