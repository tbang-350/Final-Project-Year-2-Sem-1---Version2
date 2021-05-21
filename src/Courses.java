class Courses extends Student {
    private int year;
    private int semester;

    public Courses(int year, int semester) {
        super(firstname, middlename, lastname, age, gender, address);
        this.year = year;
        this.semester = semester;

    }

    public void setYear(int yre) {
        year = yre;
    }

    public int getYear() {
        return year;
    }

    public void setSemester(int smstr) {
        semester = smstr;
    }

    public int getSemester() {
        return semester;
    }

}