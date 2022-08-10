import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Character> get_UpperCase_Word_List(char[] word){
        List<Character> wordList = new ArrayList<>();
        for (char var: word
        ) {
            if((int)var > 91){
                var -= 32;
            }
            wordList.add(var);
        }
        return wordList;
    }
    public static char[] get_Word_Array() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        br.close();
        return word;
    }
    public static void solution() throws IOException{
        char[] wordArray = get_Word_Array();
        List<Character> wordList = get_UpperCase_Word_List(wordArray);
        String str = "";

        for(int i = 0; i < wordList.size(); i++ ){
            if(){

            }
            Collections.frequency(wordList,wordList.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}