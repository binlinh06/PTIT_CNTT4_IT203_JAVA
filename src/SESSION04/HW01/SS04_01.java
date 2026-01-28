package SESSION04.HW01;

public class SS04_01 {
    public static void main(String[] args) {
        String title = "   lập   TRÌNH   java   cơ   bản   ";
        String author = "   nguyễn   văn   a   ";

        title = title.trim().replaceAll("\\s+"," ");
        author = author.trim().replaceAll("\\s+"," ");

        title = title.toUpperCase();

        String[] words = author.toLowerCase().split("");
        StringBuilder authorFormatted = new StringBuilder();

        for(String w : words){
            authorFormatted.append(
                    Character.toUpperCase(w.charAt(0)) + w.substring(1)+""
            );
        }
        System.out.println("[" + title + "] - Tác giả: " + authorFormatted.toString().trim());
    }
}
