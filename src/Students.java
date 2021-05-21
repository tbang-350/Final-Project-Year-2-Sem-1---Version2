class Student {
    protected static String firstname;
    protected static String middlename;
    protected static String lastname;
    protected static int age;
    protected static String gender;
    protected static String address;

    public Student(String firstname, String middlename, String lastname, int age, String gender, String address) {
        Student.firstname = firstname;
        Student.middlename = middlename;
        Student.lastname = lastname;
        Student.age = age;
        Student.gender = gender;
        Student.address = address;
    }

    public void setFirstname(String fname) {
        firstname = fname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setMiddlename(String mname) {
        middlename = mname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setLastname(String lname) {
        lastname = lname;
    }

    public String getLastname(){
    return lastname;
    }

    public void setAge(int Age) {
        age = Age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gndr) {
        gender = gndr;
    }

    public String getGender() {
        return gender;
    }

    public void setAddres(String addrs) {
        address = addrs;
    }

    public String getAddres() {
        return address;
    }
}
