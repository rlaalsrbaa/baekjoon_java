import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static char[] get_Word_Array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        br.close();
        return word;
    }
    public static List<Character> get_UpperCase_Word_List(char[] word) {
        List<Character> wordList = new ArrayList<>();
        for (char var : word
        ) {
            if ((int) var > 91) {
                var -= 32;
            }
            wordList.add(var);
        }
        return wordList;
    }
    public static int get_maxValue_List(List<Character> wordList) {
        int maxValue = 0;
        String str = "";
        for (int i = 0; i < wordList.size(); i++) {
            String var = String.valueOf(wordList.get(i));
            if (str.contains(var)) {
                continue;
            }
            int tempValue = Collections.frequency(wordList, wordList.get(i));

            if (maxValue < tempValue) {
                maxValue = tempValue;
            }

            str += var;
        }
        return maxValue;
    }
    private static char get_Answer(List<Character> wordList, int maxValue) {
        char answer = 0;
        int i = 0;
        int cnt = 0;
        String str = "";
        for (char var: wordList
        ) {
            if(str.contains(String.valueOf(var))){
                continue;
            }
            int tempValue = Collections.frequency(wordList,var);
            if(maxValue == tempValue){
                answer = var;
                cnt++;
            }
            i++;
            str += var;
        }
        if(cnt != 1){
            return '?';
        }
        return answer;
    }
    public static void solution() throws IOException {
        char[] wordArray = get_Word_Array();
        List<Character> wordList = get_UpperCase_Word_List(wordArray);
        int maxValue = get_maxValue_List(wordList);
        char answer = get_Answer(wordList,maxValue);
        System.out.println(answer);
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}