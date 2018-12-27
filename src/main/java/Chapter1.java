public class Chapter1 {

    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "String";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Str").append("ing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString().equals(s2));
        System.out.println(sb1.toString() == s2);
    }
}
