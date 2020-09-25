package titleCaseDemo;

public class App {
    public static void main(String[] args) {
        String str = "hello hi how are you doing today";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i], 0, arr[i].length() - 1).append(Character.toUpperCase(arr[i].charAt(arr[i].length() - 1))).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
