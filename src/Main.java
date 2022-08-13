import java.io.*;
import java.util.*;

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
    private static HashMap<Character, Integer> get_Word_Map(List<Character> wordList) {
        HashMap<Character, Integer> wordMap = new HashMap<>();
        String str = "";

        for (int i = 0; i < wordList.size(); i++) {
            char key = 0;
            int value = 0;
            key = wordList.get(i);
            if (str.contains(String.valueOf(key))) {
                continue;
            }
            value = Collections.frequency(wordList, key);
            wordMap.put(key, value);
            str += key;
        }

        return wordMap;
    }
    private static char get_Answer(HashMap<Character, Integer> wordMap) {
        int maxValue = 0;
        char answer = 0;
        maxValue = Collections.max(wordMap.values());
        int cnt = 0;

        for (char key : wordMap.keySet()
        ) {
            int value = wordMap.get(key);
            if(value == maxValue){
                answer = key;
                cnt++;
                if(cnt == 2){
                    answer = '?';
                    break;
                }
            }
        }
        return answer;
    }
    public static void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] wordArray = get_Word_Array();
        List<Character> wordList = get_UpperCase_Word_List(wordArray);
        HashMap<Character, Integer> wordMap = get_Word_Map(wordList);
        char answer = get_Answer(wordMap);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}