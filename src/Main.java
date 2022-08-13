import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
    public static void solution() throws IOException {
        char[] wordArray = get_Word_Array();
        List<Character> wordList = get_UpperCase_Word_List(wordArray);
        HashMap<Character, Integer> mapList = new HashMap<>();
        int maxValue = 0;
        String str = "";
        for(int i = 0; i < wordList.size(); i++){
            char key = 0;
            int value = 0;
            key = wordList.get(i);
            if(str.contains(String.valueOf(key))){
                continue;
            }
            value = Collections.frequency(wordList,key);
            mapList.put(key, value);
            str += key;
        }
        maxValue = Collections.max(mapList.values());
        System.out.println(maxValue);

        // 얻은 maxValue를 이용해서 key를 찾으면 된다.

        for(int i = 0; i < mapList.size(); i++){

        }
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}