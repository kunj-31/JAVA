package PRCTISESET.SET_3;

public class practiceset_3 {
    public static void main(String[] args) {
        //problem-1
        String name="BABY john";
        name=name.toLowerCase();
        System.out.println(name);

        //problem-2
        String text="To Lower Case";
        text=text.replace(" ","-");
        System.out.println(text);

        //problem-3
        String Letter="Dear <|name|>, Thanks a lot";
        Letter=Letter.replace("<|name|>","KUNJ DESAI");
        System.out.println(Letter);

        //problem-4
        String myString="This string   contains   double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem-5
        String myLetter="Dear Harry,\n\tThis Java Course is nice.\nThanks!";
        System.out.println(myLetter);

        
    }
}
