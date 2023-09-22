import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char word = s.charAt(i);
            if(word == ')'){
                if(stack.isEmpty()){ // 비어있을때
                    answer = false;
                    break;
                }else if(stack.peek() == '('){
                    stack.pop();
                }else if(stack.peek()==')'){
                    stack.push(word);
                }
            }else{
                stack.push(word);
            }


        }
        if(stack.isEmpty()){
            return answer;
        }else{
            answer = false;
        }

        return answer;
    }
}