public class HollePrinter
{
    public static void main(String[] args)
    {
        String regular = "Hello, World!";
        String temp = regular.replace("e", "&");
        String changed = temp.replace("o", "e");
        changed = changed.replace("&", "o");
        System.out.println(regular + ", " + changed);
    }
}    