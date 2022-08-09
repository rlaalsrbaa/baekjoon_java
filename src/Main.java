import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] inputWord = br.readLine().toCharArray();
        get_Convert_UpperCase(inputWord);

        List<Character> arr = new ArrayList<>();
        HashSet<Character> removeDupWord = new HashSet<>();

        for (char var : inputWord
        ) {
            removeDupWord.add(var);
            arr.add(var);
        }
        Character[] removedDupArray = removeDupWord.toArray(new Character[0]);

        HashMap<Character, Integer> answer = new HashMap<>();

        for(int i = 0; i < removedDupArray.length; i++){
            char key = removedDupArray[i];
            int value = Collections.frequency(arr,removedDupArray[i]);
            answer.put(key,value);
        }
        // 밸류값으로 키를 찾으면 됨


        int maxValue = Collections.max(answer.values());
        int[] arrayValues = new int[answer.size()];
        int cnt = 0;
        for(int i = 0; i < arrayValues.length; i++){

            if(arrayValues[i] == maxValue && cnt != 0){
                cnt++;
                bw.write("?");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static char[] get_Convert_UpperCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if ((int) arr[i] > 91) {
                arr[i] -= 32;
            }
        }
        return arr;
    }

    public static void Solution(char[] arr) {

    }
}