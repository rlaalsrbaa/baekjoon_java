import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        solution();
    }
    public static char[] get_Convert_UpperCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if ((int) arr[i] > 91) {
                arr[i] -= 32;
            }
        }
        return arr;
    }
    public static List<Character> get_ArrayList_Words(char[] inputWord){
        List<Character> arr = new ArrayList<>();
        for (char var : inputWord
        ) {

            arr.add(var);
        }
        return arr;
    }
    public static Character[] get_Removed_Duplicate_Array(char[] inputWord){

        HashSet<Character> removeDupWord = new HashSet<>();

        for (char var : inputWord
        ) {
            removeDupWord.add(var);

        }

        Character[] removedDupArray = removeDupWord.toArray(new Character[0]);

        return removedDupArray;
    }
    public static char[] get_Input_Word() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputWord = br.readLine().toCharArray();
        br.close();
        return inputWord;
    }
    private static HashMap<Character, Integer> get_Frequency_Words(Character[] removedDupArray, List<Character> wordsArrayList){
        HashMap<Character, Integer> answer = new HashMap<>();
        for(int i = 0; i < removedDupArray.length; i++){
            char key = removedDupArray[i];
            int value = Collections.frequency(wordsArrayList,removedDupArray[i]);
            answer.put(key,value);
        }
        return answer;
    }
    public static void solution() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] inputWord = get_Input_Word();

        get_Convert_UpperCase(inputWord);

        Character[] removedDupArray = get_Removed_Duplicate_Array(inputWord);

        List<Character> wordsArrayList = get_ArrayList_Words(inputWord);

        HashMap<Character, Integer> wordsMapping = get_Frequency_Words(removedDupArray,wordsArrayList);

        char answer = get_Answer(wordsMapping);

        bw.write(answer);
        bw.flush();
        bw.close();
    }
    public static char get_Answer(HashMap<Character, Integer> wordsMapping){
        int maxValue = Collections.max(wordsMapping.values());
        char answer = 0;
        int cnt = 0;

        for (Map.Entry<Character, Integer> var: wordsMapping.entrySet()
        ) {
            if(var.getValue() == maxValue){
                answer = var.getKey();
                cnt++;
            }
        }
        if(cnt > 1){
            answer = '?';
        }
        return answer;
    }

}