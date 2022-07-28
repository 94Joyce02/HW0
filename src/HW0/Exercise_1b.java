package HW0;

public class Exercise_1b {
    public void drawTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Exercise_1b exercise = new Exercise_1b();
        exercise.drawTriangle(10);

    }
}
