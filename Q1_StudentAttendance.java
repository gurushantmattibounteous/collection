// ============================================================
// QUESTION 1: Student Attendance System
// COLLECTION USED: LinkedHashSet
//
// WHY LinkedHashSet?
//   - Set = No Duplicates allowed (Rahul added twice -> stored only once)
//   - Linked = Maintains INSERTION ORDER (Rahul, Amit, Neha stays in that order)
//   - HashSet alone does NOT guarantee order, so we use LinkedHashSet
// ============================================================

import java.util.LinkedHashSet;

public class Q1_StudentAttendance {
    public static void main(String[] args) {

        LinkedHashSet<String> attendance = new LinkedHashSet<>();

        
        attendance.add("Rahul");

        attendance.add("Amit");

        attendance.add("Neha");

        attendance.add("Rahul");

        System.out.println("=== Student Attendance ===");
        
        for (String name : attendance) {
            System.out.println(name);
        }
    }
}

