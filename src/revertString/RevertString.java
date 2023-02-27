package revertString;

public class RevertString {
    public static void main(String[] args) {
        String text = "This is a text to be reverted";
        StringBuffer revertedText = new StringBuffer(text);
        revertedText.reverse();
        System.out.println(revertedText);

    }
}

