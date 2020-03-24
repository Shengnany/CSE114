//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
public class InvalidSectionNumberException extends Exception {
    InvalidSectionNumberException(String code){
        super("Invalid Section Number: "+code);
    }

}
