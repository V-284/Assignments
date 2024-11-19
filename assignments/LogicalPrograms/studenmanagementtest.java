package LogicalPrograms;

class studenmanagementtest{
    
    
    void f (){
        
        studentManagement x=new studentManagement();
        x.setStudentid(3);
        x.setAge(31);
        x.setName("Vijay");
        x.setGrade('A');
        System.out.println(x.toString());
    }
}
class studentManagement{
    
    
    int studentid;
    String name;
    int age;
    char grade;
    
     public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
     public String toString() {
        return "{" +
                "studentid=" + studentid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
    
}