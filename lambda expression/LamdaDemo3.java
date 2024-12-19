interface StringFunc {
    String func(String str);
}

public class LamdaDemo3 {

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "I love Java";
        String outStr;

        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("Перевернутая строка: "
                + outStr);
        System.out.println();


        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);

                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }

            return result;

        }, inStr);

        System.out.println("Регистры букв наоборот: "
                + outStr);
    }
}
