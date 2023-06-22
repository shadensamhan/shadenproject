package com.example.shadenproject;

public class Course {
    private int photo;
    private String courseName  ;

    Course(String courseName , int photo)
    {
        this.courseName = courseName ;
        this.photo=photo;

    }




    public static final Course[] course = {
            new Course("class 1:", R.drawable.class1),
            new Course("class 2:", R.drawable.class2),
            new Course("class 3:", R.drawable.class3),
            new Course("class 4:", R.drawable.class4),
            new Course("class 5:", R.drawable.class5),

    };
    public static final Course[] course1 = {
            new Course("class 1:", R.drawable.classm1),
            new Course("class 2:", R.drawable.classm2),
            new Course("class 3:", R.drawable.classm3),
            new Course("class 4:", R.drawable.classm4),
            new Course("class 5:", R.drawable.classm5),
            new Course("class 5:", R.drawable.classm5),

    };




    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }






}
