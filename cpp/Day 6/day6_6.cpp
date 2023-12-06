// 1. Create structure of Student having following attributes
// 1. Roll number
// 2. name of student
// 3. numberofsubject.
// 4. int *mark;
// 5. toatlmark;
// Accept number of studnet, Allocate memory for structure array. Accept and display information.

#include <iostream>
#include <string>
using namespace std;

// Structure definition for Student
struct Student {
    int rollNumber;
    string name;
    int numberOfSubjects;
    int* marks;
    int totalMarks;
};

int main() {
    int numStudents;

    // Accept the number of students
    cout << "Enter the number of students: ";
    cin >> numStudents;

    // Allocate memory for the array of Student structures
    Student* studentArray = new Student[numStudents];

    // Accept information for each student
    for (int i = 0; i < numStudents; ++i) {
        Student& student = studentArray[i];

        // Input student details
        cout << "Enter Roll Number for student " << i + 1 << ": ";
        cin >> student.rollNumber;

        cin.ignore(); // Clear the input buffer
        cout << "Enter Name for student " << i + 1 << ": ";
        getline(cin, student.name);

        cout << "Enter Number of Subjects for student " << i + 1 << ": ";
        cin >> student.numberOfSubjects;

        // Allocate memory for marks array
        student.marks = new int[student.numberOfSubjects];

        // Input marks for each subject
        cout << "Enter Marks for " << student.numberOfSubjects << " subjects:\n";
        student.totalMarks = 0;
        for (int j = 0; j < student.numberOfSubjects; ++j) {
            cout << "Subject " << j + 1 << ": ";
            cin >> student.marks[j];
            student.totalMarks += student.marks[j];
        }
    }

    // Display student information
    cout << "\nStudent Information:\n";
    for (int i = 0; i < numStudents; ++i) {
        const Student& student = studentArray[i];
        cout << "Student " << i + 1 << ":\n";
        cout << "Roll Number: " << student.rollNumber << "\n";
        cout << "Name: " << student.name << "\n";
        cout << "Number of Subjects: " << student.numberOfSubjects << "\n";
        cout << "Total Marks: " << student.totalMarks << "\n\n";
    }

    // Deallocate memory
    for (int i = 0; i < numStudents; ++i) {
        delete[] studentArray[i].marks;
    }
    delete[] studentArray;

    return 0;
}
