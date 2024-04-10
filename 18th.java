public class Main {
    public static void main(String[] args) {
      String[][] days = { {"monday","tuesday","wednesday","thursday","friday"},{"saturday","sunday"}};
      for (int i = 0; i < days.length; i++) {
         for(int j = 0; j < days[i].length; j++) {
            System.out.println(days[i][j]);
         }
      }
    }
}
 