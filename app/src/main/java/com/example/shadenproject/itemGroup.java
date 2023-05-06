package com.example.shadenproject;
import java.util.ArrayList;
import java.util.List;
public class itemGroup {


        private ArrayList<Course> c = new ArrayList<>();

        itemGroup() {
            c.add(new Course("1", "Arabic", "class1"));
            c.add(new Course("1", "Math", "classm1"));

            c.add(new Course("2", "Arabic", "class2"));
            c.add(new Course("2", "Math", "classm2"));

            c.add(new Course("3", "Arabic", "class3"));
            c.add(new Course("3", "Math", "classm3"));

            c.add(new Course("4", "Arabic", "class4"));
            c.add(new Course("4", "Math", "classm4"));

            c.add(new Course("5", "Arabic", "class5"));
            c.add(new Course("5", "Math", "classm5"));

        }

        public ArrayList<String> getCat1() {
            ArrayList<String> c1 = new ArrayList<>();
            c1.add("1");
            c1.add("2");
            c1.add("3");
            c1.add("4");
            c1.add("5");

            return c1;
        }

        public ArrayList<String> getCat2() {
            ArrayList<String> c1 = new ArrayList<>();
            c1.add("Arabic");
            c1.add("Math");

            return c1;
        }

        public String getItem(String classes, String course) {
            for (int i = 0; i < c.size(); i++) {
                if (c.get(i).getCourseName().equals(course) && c.get(i).getClasses().equals(classes)) {
                    return c.get(i).getPhoto();
                }
            }
            return "not found";
        }
    }

