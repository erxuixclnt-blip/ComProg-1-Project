public class Main {
    public static void main(String[] args) {

        char[] chars = {'A','h','r','o','n',' ','D','e','c','e','m','b','e','r'};
        String s = new String(chars);
        System.out.println(s);

        String str2 = new String(chars, 6, 8);
        System.out.println(str2);

        byte[] byteArr = {67, 108, 105, 110, 116};
        String str3 = new String(byteArr);
        System.out.println(str3);

        byte[] byteArr2 = {65, 104, 114, 111, 110, 32, 68, 101, 99, 101, 109, 98, 101, 114};
        String str4 = new String(byteArr2, 6, 8);
        System.out.println(str4);
    }
}
