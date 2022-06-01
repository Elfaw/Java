package Lesson_3;

public class HomeWork3 {
    public static void main (String[] args) {
        mass();
        mass2();
        mass3();
        mass4();
    }
    public static void mass () {
        int[] tels = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i < tels.length; i++){
            if(tels[i] == 0){
                tels[i] = 1;
            }
            else {
                tels [i] = 0;
            }
            System.out.print(tels[i]);
        }
        System.out.println();
    }
    public static void mass2 () {
        int[] tels = new int [100];
        for (int i = 0; i < tels.length; i++){
            tels [i] = i + 1;
            System.out.print(tels[i] + ",");
        }
        System.out.println();
    }
    public static void mass3 () {
        int[] tels = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i =0; i < tels.length; i++) {
            if (tels [i] < 6) {
                tels[i] = tels[i] *2;
            }

            System.out.print(tels[i] + ",");
        }
        System.out.println();
    }
    public static void  mass4 (){
        int[][] field = new int[5][5];
        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i==j){
                    System.out.print("1 ");
                }
                else if (i+j == field.length - 1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}

