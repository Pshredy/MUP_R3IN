public class Student implements Human {

    private String name;
    private String surname;


    Student(String name, String surname){
    this.name = name;
    this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void sleep(int time){

    };
    public String eat(){
        return "eat";
    };


    public int div(int v1, int v2){
        return v1/v2;
    }
}
