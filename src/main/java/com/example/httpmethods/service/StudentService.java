package com.example.httpmethods.service;


import com.example.httpmethods.model.Student;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class StudentService {

    ArrayList<Student> st = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"ABI","Java"),
                    new Student(2,"arun","Cpp"),
                    new Student(3,"balu","python")
            )
    );


    public List<Student> getStudents() {
        return st;
    }

    public String greet() {
        return "Hello world";
    }

    public Student getstudentbyrno(int roll) {
        int index = 0;
        boolean found = false;
        for(int i=0;i<st.size();i++){
            if(st.get(i).getRno() == roll){
                index = i;
                found = true;
            }
        }
        if(!found) return new Student(0,"not found","not found");
        else{
            return st.get(index);
        }
    }

    public String addStudent(Student student) {
        st.add(student);
        return "Success!";
    }

    public String updateStudent(Student student) {
        int index = 0;
        boolean found = false;
        for(int i=0;i<st.size();i++){
            if(st.get(i).getRno() == student.getRno()){
                index=i;
                found = true;
                break;
            }
        }
        if(!found) return "No such Student found";
        else{
            st.set(index,student);
            return "Updation Success!";
        }
    }

    public String deleteStudent(int rno) {
        int index = 0;
        boolean found = false;

        for(int i=0;i<st.size();i++){
            if(st.get(i).getRno() == rno){
                index = i;
                found = true;
                break;
            }
        }

        if(found){
            st.remove(index);
            return "Deleted successfully!";
        }
        else{
            return "No such student exists";
        }

    }
}
