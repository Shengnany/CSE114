//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
public class InvalidSectionTypeException extends Exception {
    InvalidSectionTypeException(String code){
        super("Invalid section type: "+code);
    }
}
