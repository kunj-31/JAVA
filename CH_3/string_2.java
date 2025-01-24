package CH_3;

public class string_2 {
    public static void main(String[] args) {
        String name = "Kunj";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nonTrimString = "    Kunj    ";
        System.out.println(nonTrimString);
        System.out.println(nonTrimString.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace('n', 'k'));
        System.out.println(name.replace("n", "ms"));

        System.out.println(name.startsWith("km"));
        System.out.println(name.endsWith("nj"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("K"));
        String modified="KUNJDESAI";
        System.out.println(modified.indexOf("DES",3));

        System.out.println(modified.lastIndexOf("ESA"));
        System.out.println(modified.lastIndexOf("UNJ",1));

        System.out.println(name.equals("Kunj"));
        System.out.println(name.equalsIgnoreCase("KUnj"));

    }
}
