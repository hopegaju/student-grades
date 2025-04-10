import java.util.*;

public class GradeManager {
    public static void main(String[] args) {

    }

    public void printGrades(int[] grades){
        for(int grade:grades){
            System.out.println(grade + " ");
        }
    }
    public void sortGrades(int[] grades){
        Arrays.sort(grades);
    }
    public int  searchGrade(int[] grades, int target){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public int getGrade(int[] grades, int index){
        try {
            return grades[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:Invalid index!");
            return -1;
        }
    }
}
