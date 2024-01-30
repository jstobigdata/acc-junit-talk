package c.a.junit.examples;

public class StringUtils {
    public static String concatenate(String str1, String str2) {
        //TODO - 1 - uncomment and see
        return str1.concat(str2);
        //return str1 + str2;
    }

    public static void main(String[] args) {
        String str = concatenate("123", "Hello");
        System.out.println("=============== concatenate ===========");
        System.out.println(str);

        String strWithNull = concatenate(null, "test");
        System.out.println("=============== concatenate ===========");
        System.out.println(strWithNull);
    }
}
