
class Main {
    public static void main(String[] args) {

        String str1 = "Music Therapy";
        int indexSpace = str1.indexOf(" ");
        System.out.println("PROGRAM 1 - indexOf(): " + indexSpace);


        String str2 = "Pao Plata Mate";
        int indexX = str2.indexOf("x");
        System.out.println("PROGRAM 2 - indexOf(): " + indexX);


        String str3 = "Out";
        String str4 = "Inside";
        String concat1 = str4.concat(str3);
        String concat2 = str3.concat(str4);
        System.out.println("PROGRAM 3 - concat(): " + concat1 + ", " + concat2);


        String str5 = "Programming";
        String str6 = "Coding";
        String str7 = "Writing";
        int cmp1 = str5.compareTo(str6);
        int cmp2 = str5.compareTo(str7);
        int cmp3 = str7.compareTo(str5);
        System.out.println("PROGRAM 4 - compareTo(): " + cmp1 + ", " + cmp2 + ", " + cmp3);
    }
