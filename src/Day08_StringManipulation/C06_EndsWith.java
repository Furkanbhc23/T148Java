package Day08_StringManipulation;

public class C06_EndsWith {
    public static void main(String[] args) {

        String str="Java ogrenmek cok zevkli";
        System.out.println(str.endsWith("i"));
        System.out.println(str.endsWith("zevkli"));
        System.out.println(str.endsWith("cok zevkli"));
        // hepsini true olarak verir.
        System.out.println(str.endsWith("Java cok guzel")); // false verir.













    }
}
