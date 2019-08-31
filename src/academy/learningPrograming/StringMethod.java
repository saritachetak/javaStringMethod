package academy.learningPrograming;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Java is fun";
        //J a v a   i s   f u n
        //0 1 2 3 4 5 6 7 8 9 10

        System.out.println(str.concat("And").toLowerCase().substring(5, 9)); //substring returns string from index including given index value.


        System.out.println(str);


        //length method
        System.out.println("length os str is = " + str.length());
        //charAt method
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(10));
//        System.out.println(str.charAt(11));

        //indexOf method
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 4));  //from index 4 there is no a leeter in the given string
        System.out.println(str.indexOf("fun"));  //fun is start fron index 8
        System.out.println(str.indexOf("fun", 10)); //no more fun in the sting of index

        //substring method


        System.out.println(str.substring(8));

        System.out.println("****");
        System.out.println(str.substring(5, 5)); // empty string
        System.out.println("****");
        System.out.println(str.substring(4, 10));
        System.out.println(str.substring(0, 5));
        // System.out.println(str.substring(4,2)); this will throw out of range exception
        //System.out.println(str.substring(4,14)); this will throw out of range exception

        //toLowerCase, toUpperCase methods

        System.out.println("converts string to lower case = " + str.toLowerCase());
        //System.out.println(str);
        System.out.println("converts string to upper case = " + str.toUpperCase());
        //System.out.println(str);

        //equals ignore case

        String str1 = "Java";
        String str2 = "java";
        String str3 = "ja";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //starts with & ends with


        System.out.println(str1.startsWith("J"));
        System.out.println(str1.startsWith(str3));
        System.out.println(str1.startsWith("j"));

        System.out.println(str1.endsWith("a"));
        System.out.println(str1.endsWith("va"));
//        str.st

        //contains method

        System.out.println(str1.contains("v"));
        System.out.println(str1.contains(str3));

        //replace

        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace('a', 'A'));
        System.out.println(myString.replace(' ', '_'));
        System.out.println(myString.replace("is", "_"));

        //trim

        System.out.println("Java".trim());
        System.out.println(" Java ".trim());
        System.out.println("Java is cool".trim());
        System.out.println("   Java is cool   ".trim());


    }
}
