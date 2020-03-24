//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
public class InvalidCourseCodeLengthException extends Exception {

    InvalidCourseCodeLengthException(String code) {
        super("Invalid code length: " + code);
    }
}
