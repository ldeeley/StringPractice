import java.util.Arrays;

public class MexicanWave {

    public static String[] wave(String mexican) {
        // Your code here
        int mexicanLessWhiteSpacesCount = mexican.replaceAll(" ","").length();
        char[] mexicanCharArray = mexican.toCharArray();

        String[] resultWave = new String[mexicanLessWhiteSpacesCount];

        int waveNumber = 0;
        for (int i=0;i<mexicanCharArray.length;i++){
            if (mexicanCharArray[i]!=' ') {
                mexicanCharArray[i] = Character.toUpperCase(mexicanCharArray[i]);
                String wave = new String(mexicanCharArray);
                resultWave[waveNumber] = wave;
                waveNumber++;
                mexicanCharArray[i] = Character.toLowerCase(mexicanCharArray[i]);
            }
        }
        return resultWave;
    }


    public static void main(String[] args) {
       String[] result = wave("two words");
        System.out.println(Arrays.toString(result));
    }

}
