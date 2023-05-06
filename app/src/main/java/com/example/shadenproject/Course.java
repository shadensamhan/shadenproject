package com.example.shadenproject;

public class Course {
    private String photo , courseName , classes ;

    Course(String  classes ,String courseName , String photo)
    {
        this.courseName = courseName ;
        this.photo = photo ;
        this.classes = classes ;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Course{" +
                "photo='" + photo + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
