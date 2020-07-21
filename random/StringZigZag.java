public class StringZigZag {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Incorrect usage <str> <no_of_lines>");
            return;
        }
        String str = args[0];
        //str = "ARJUNAC";
        int lines = Integer.parseInt(args[1]);
        System.out.println(zigZag(str, lines));
    }

    public static String zigZag(String str, int lines) {
        int len = str.length();
        int c = 2*lines - 2;
        StringBuffer sb = new StringBuffer();
        for (int i =0; i<lines; i++) {
            for (int j=0; j+i<len; j += c) {
                sb.append(str.charAt(j+i));
                if (i != 0 && i != lines -1 && j+c-i < len) {
                    sb.append(str.charAt(j+c-i));
                }
            }
        }
        return sb.toString();
    }
}