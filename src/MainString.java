public class MainString {
    public static void main(String[] args) {
        String [] strings = new String[] {"1"," 2", "3","4", "5"};
        String result = "";
        StringBuilder sb = new StringBuilder();
        for(String str: strings){
            sb.append(str).append(", ");
        }
        System.out.println(result);
    }
}
