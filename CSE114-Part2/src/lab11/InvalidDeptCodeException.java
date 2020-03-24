//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
public class InvalidDeptCodeException extends Exception {
    InvalidDeptCodeException(String code){
        super("Invalid deptcode: "+code);
    }
}
