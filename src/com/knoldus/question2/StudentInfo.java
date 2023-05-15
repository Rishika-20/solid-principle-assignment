package com.knoldus.question2;

/**
 * The Open-Closed Principle (OCP) of SOLID principles can be used to resolve the scenario described in the code.
 *
 * According to OCP, a class should be open for extension but closed for modification. In the given code,
 * the StudentInfo class violates this principle by checking the type of the Student object and returning
 * the stream name based on the type of the object. This approach makes the code tightly coupled to the
 * specific types of Student, and any new type of Student added in the future would require modification of
 * the Streamname method.
 *
 **/
public class StudentInfo {
    public String streamName(Student st) {
        return st.getStream();
    }
}
