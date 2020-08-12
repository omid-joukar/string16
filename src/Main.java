/**
 * Created by KPS on 8/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        String sentence = " omid is here";
        byte[] bytes = sentence.getBytes();
        String newSentence = new String(bytes);
        for (byte c : bytes){
            System.out.println((char)c);
        }
        System.out.println(newSentence);
    }
}
