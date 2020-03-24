//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
public class InvalidCourseNumberException extends Exception {
    InvalidCourseNumberException(String code){
        super("Invalid course number: "+code);
    }
}
