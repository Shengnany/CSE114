//Shengnan You
//112361646
//CSE 114
//Lab#11
package lab11;
import java.util.Scanner;
public class CourseCode {
    public static void main(String[] args ){
        System.out.print("Enter coursecode: ");
        Scanner butter=new Scanner (System.in);
        String code=butter.nextLine();
        checkCourseCode(code);

    }

    public static void checkCourseCode(String code) {
        try {
            method1(code);
      method2(code);
      method3(code);
      method4(code);
      method5(code);
        } catch (InvalidCourseCodeLengthException ex) {
            System.out.println(ex);
        } catch(InvalidDeptCodeException ex) {
            System.out.println(ex);
        }catch(InvalidCourseNumberException ex){
            System.out.println(ex);
        }
        catch(InvalidSectionTypeException ex){
            System.out.println(ex);
        }
        catch(InvalidSectionNumberException ex){
            System.out.println(ex);
        }
        System.out.println("Department code: "+code.substring(0,3));
        System.out.println("Course Number: "+code.substring(3,6));
        System.out.println("Section Type: "+code.substring(6,7));
        System.out.println("Section Number:: "+code.substring(7,8));
    }

public static void method1(String code)throws InvalidCourseCodeLengthException {
    if (code.length()!=9) throw new InvalidCourseCodeLengthException(code);
}

    public static void method2(String code)throws InvalidDeptCodeException {
        if (!(Character.isUpperCase(code.charAt(0)))||!(Character.isUpperCase(code.charAt(1)))||!(Character.isUpperCase(code.charAt(2))))
            throw new InvalidDeptCodeException(code);
    }


    public static void method3(String code)throws InvalidCourseNumberException {

        if (!(Character.isDigit(code.charAt(3)))||!(Character.isDigit(code.charAt(3)))||!(Character.isDigit(code.charAt(5))))
            throw new InvalidCourseNumberException(code);

    }


    public static void method4(String code)throws InvalidSectionTypeException {

        if (!(code.charAt(6)!='R')||!(code.charAt(6)!='L'))
            throw new InvalidSectionTypeException(code);

    }

    public  static void method5(String code)throws InvalidSectionNumberException{
        if(!(Character.isDigit(code.charAt(7)))||!(Character.isDigit(code.charAt(7))))
            throw new InvalidSectionNumberException(code);
    }


}
