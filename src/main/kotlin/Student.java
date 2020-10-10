public class Student {
    private String name = "";
    private String surname = "";
    private Integer myId = 0;

    static Integer id = 0;

    Student(String name, String surname){

        this.name = name;
        this.surname = surname;

        myId = id;
        id++;
    }

    @Override
    public String toString() {
        return ""+name+" "+surname+" "+myId;
    }
}
