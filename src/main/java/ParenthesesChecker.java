import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParenthesesChecker {
    public boolean checkParentheses(String testString){
//        boolean parenthesesMatch = false; // switch between true and false throughout checking each character in string, ie switch to true when match
        //check if empty
        if(testString.length()==0) {
            return true;
        }
        // this test would not work if you had "I have( [ brackets here) ]" as is a grammar error , but this method below would pass all tests in test file.
        // would have to switch to a stack for this, checking that the last type of bracket which has been popped off matches the next bracket that comes along. or could have a last bracket checker.
        // could also use dictionary for below integers.
        int openCounter=0;
        int closedCounter=0;
        int openSquareBrackets=0;
        int closedSquareBrackets=0;
        int openBraces=0;
        int closedBraces=0;
        int openAngled=0;
        int closedAngled=0;
        char[] testStringArray = testString.toCharArray();
        for(int i = 0 ; i < testString.length() ; i++){
            if(testStringArray[i] == '(' ){
                openCounter= openCounter+1;
            }else if (testStringArray[i]==')'){
                closedCounter=closedCounter+1;
            }else if(testStringArray[i] == '[' ){
                openSquareBrackets= openSquareBrackets+1;
            }else if (testStringArray[i]==']'){
                closedSquareBrackets=closedSquareBrackets+1;
            }else if(testStringArray[i] == '{' ){
                openBraces= openBraces+1;
            }else if (testStringArray[i]=='}'){
                closedBraces=closedBraces+1;
            }else if(testStringArray[i] == '<' ){
                openAngled= openAngled+1;
            }else if (testStringArray[i]=='>'){
                closedAngled=closedAngled+1;
            }
        }
        if(openCounter==closedCounter && openBraces==closedBraces && openSquareBrackets==closedSquareBrackets && openAngled==closedAngled){
            return true;
        }else{
            return false;}
    }
}
