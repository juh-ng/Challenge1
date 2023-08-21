

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentsInput {

    int studentsN;//numero de estudantes
    Scanner scanner = new Scanner(System.in); //declaro a classe scanner
    int[] studentsGrade;
    ArrayList<String> students = new ArrayList<String>();//lista que vai receber nome dos alunos




    public void ContStudents() {
        System.out.println("Informe a quantidade de alunos");
        studentsN = scanner.nextInt();


        if (studentsN < 1 || studentsN > 100) {
            System.out.println("Quantidade de alunos inesperada, favor informe um valor válido");
            studentsN = scanner.nextInt();

        } else {
            System.out.println("Sua sala possui a seguinte quantidade de alunos:" + studentsN);
            studentsGrade = new int[studentsN]; // lista que vai conter as notas dos estudantes
            scanner.nextLine();
        }
    }



    public void Input () {

        System.out.println("Agora informe o nome dos alunos: ");
        for (int i = 0; i < studentsN; i++) {
            String name = scanner.nextLine();
            if(name.length() > 20) {
                System.out.println("Nome inválido favor forneça outro nome");
                i--;
            }else{

                students.add(name);}
        }

    }



    public void Score (){

        for(int i = 0; i < studentsN; i ++){
            System.out.println("Informe a nota do estudante " + students.get(i) + ": ");
            int grade = scanner.nextInt();


            if(grade <0 || grade >10){
                System.out.println("Nota inválida, favor forneça uma nota entre 0 a 10:");
                i--;

            }else {
                studentsGrade[i] = grade;
                scanner.nextLine();
            }

        }



    }

    public void BadScore(){
        int minScore = studentsGrade[0];
        int loser = 0;
        boolean test = false;




        for (int i = 1; i < studentsN; i++) {
            if (studentsGrade[i] < minScore) {
                minScore = studentsGrade[i];
                loser = i;
                test = false;
            } else if (studentsGrade[i] == minScore) {
                test = true;
            }

        }

        if (test) {
            Collections.sort(students);
            int indexOfLoser = students.size() - 1;
            String loserName = students.get(indexOfLoser);
            int instance = students.indexOf(loserName) + 1;
            System.out.println("Instance : " + instance );
            System.out.println("Infeliz perdedor :"  + loserName);
        } else {
            String loserName = students.get(loser);
            int instance_ = students.indexOf(loserName) + 1;
            System.out.println("Instance:" + instance_);
            System.out.println("Infeliz perdedor: "  + loserName);
        }
    }

}