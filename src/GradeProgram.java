import java.util.Scanner;

public class GradeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Grade[] grades = new Grade[10];

        grades[0] = new Grade("Vinh",9);
        grades[1] = new Grade("Thanh",6.5);
        grades[2] = new Grade("Xuân",4);
        grades[3] = new Grade("Trung",7);
        grades[4] = new Grade("Trí",6.5);
        grades[5] = new Grade("Vũ",5);
        grades[6] = new Grade("Mai",2);
        grades[7] = new Grade("Thảo",9.5);
        grades[8] = new Grade("Trân",10);
        grades[9] = new Grade("Tuấn",8);

        int countGioi = 0;
        int countKha = 0;
        int countTB = 0;
        int countYeu = 0;

        System.out.printf("Hoc sinh co diem > 8.0: \n");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getGrade() > 8.0) {
                countGioi++;
                System.out.printf("Hoc vien: " + grades[i].name + ", diem so: " + grades[i].grade + "\n");
            }
        }

        System.out.printf("\n" + "Thong ke: \n");
        for (int i = 0; i < grades.length; i++ ){
            if (grades[i].getGrade() > 7.0) {
                countKha++;
            } else if (grades[i].getGrade() > 5.0) {
                countTB++;
            } else {
                countYeu++;
            }
        }

        System.out.printf("Gioi: " + countGioi  + " hoc sinh \n");
        System.out.printf("Kha: " + countKha  + " hoc sinh \n");
        System.out.printf("Trung binh: " + countTB  + " hoc sinh \n");
        System.out.printf("Yeu: " + countYeu  + " hoc sinh \n");

    }
}
