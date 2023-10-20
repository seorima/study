import java.util.*;
import java.io.*;

class File implements Comparable<File>{
    String head;
    String num;
    String tail;
    
    File(String head, String num, String tail){
        this.head = head;
        this.num = num;
        this.tail = tail;
    }
    
    @Override
    public int compareTo(File o){
        if(this.head.toUpperCase().equals(o.head.toUpperCase())) return Integer.parseInt(this.num)-Integer.parseInt(o.num);
        else return this.head.toUpperCase().compareTo(o.head.toUpperCase());
    }
    
}

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        ArrayList<File> arr = new ArrayList<>();
        
        
        int n = files.length;

        for(int i=0;i<n;i++){
            String head ="";
            String num ="";
            String tail="";

            int line1=0;
            int line2=0;
            boolean flag1 = false;

            for(int j=0;j<files[i].length();j++){
                int tmp = (int)files[i].toUpperCase().charAt(j);
                if( flag1 == false && (( tmp>=65 && tmp<=90 ) || tmp==46 || tmp==45 || tmp==32 )){
                    head+=files[i].charAt(j);
                }
                else if(tmp>=48 && tmp<=57 ){ // 처음나온 숫자이면
                    num+=files[i].charAt(j);
                    flag1 = true;
                    line1 = j;
                }else if(flag1 == true){
                    line2 = j;
                    break;

                }


            }

            if(line1 == files[i].length()-1){ // f014같은 경우
                tail = "";
            }else{
                tail = files[i].substring(line2);
            }

//            System.out.println("head : "+head + " num : "+ num + " tail : "+tail);

            arr.add(new File(head,num,tail));
            

        }
        
        Collections.sort(arr);
        
        for(int i=0;i<n;i++){
            answer[i] = arr.get(i).head + arr.get(i).num + arr.get(i).tail;
        }

        
        
        return answer;
    }
}