public class Student {
    private String name;
    private double quiz;
    private double exam;

    //CONSTRUCTOR
    public Student(String name, double quiz, double exam) {
        this.name = name;
        this.quiz = quiz;
        this.exam = exam;
    }

    //AVERAGE
    public double computeAverage() {
        return (quiz + exam) / 2; //PEMDAS rule
    }

    //ENCAPSULATION
    //getter
    public String getName(){
        return name;
    }
    public double getQuiz(){
        return quiz;
    }
    public double getExam(){
        return exam;
    }
    private double getAverage(){
        return computeAverage();
    }
    private String getRemark(){
        if (computeAverage() >= 75) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    //display info
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Quiz: " + getQuiz());
        System.out.println("Exam: " + getExam());
        System.out.println("Average: " + getAverage());
        System.out.println("Remark: " + getRemark());
    }
}
