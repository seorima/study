
import java.util.*;

class Word implements Comparable<Word>{
    public String word;
    public int len;
    Word(String word, int len){
        this.word = word;
        this.len = len;
    }

    @Override
    public int compareTo(Word o){
        if(this.len == o.len) return this.word.compareTo(o.word); // compareTo
        else return this.len-o.len;
    }

}
public class Main {//인프런에서 했던 방식과 동일하게도 한번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //hash쓰니까 value,key따로따로 보기가 너무 힘듦
//        HashMap<Integer,String> map = new HashMap<Integer,String>();
//        for(int i=0;i<n;i++){
//            String tmp = sc.next();
//            map.put(tmp.length(),tmp);
//            if(map.containsKey(tmp)){
//                map.remove(tmp);
//            }//중복제거완
//
//        }

        ArrayList<String> del = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tmp = sc.next();
            if(del.contains(tmp)) del.remove(tmp);
            del.add(tmp);
        }


        ArrayList<Word> arr = new ArrayList<>();
        for(int i=0;i<del.size();i++){
            String word = del.get(i);
            int len = word.length();
             arr.add(new Word(word,len));
        }

        Collections.sort(arr);

        for(Word o : arr) System.out.println(o.word);


    }
}
