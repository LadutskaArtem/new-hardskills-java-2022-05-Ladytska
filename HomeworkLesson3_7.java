public class HomeworkLesson3_7 {
    public static void main(String[] args) {
        int[][] matrice = {{0, 2, 0},
                           {4, 0, 6},
                           {0, 8, 0}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]+" ");

            }
            System.out.println();
        }
    }
}
