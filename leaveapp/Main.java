package leaveapp;
import java.io.FileInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import leaveapp.Manager;

import static java.lang.System.exit;
import static java.lang.System.out;
class Main
{
public static void main(String ar[]){ 
Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee No: ");
        int empno = sc.nextInt();
        Manager mn = new Manager();
        int g = mn.newEmp(empID);
         if (g == 0) {
            out.println("Employee Not Found");
            exit(1);
           }
   int choice; 
   do {
        out.println("1. View Applied Leaves");
            out.println("2. Apply For Leave");
            out.println("3. Cancel Leave");
            out.println("4. View Leaves Summary");
            out.println("5. Exit");
            out.print("Enter Choice: ");
            ch = sc.nextInt();
            out.println();
            switch (ch) {
                case 1:
                    emp.viewAppliedLeaves();
                    break;

                case 2:
                    LeaveRequest addRequest = new LeaveRequest();
                    addRequest.requestId = emp.leaveRequest.size();
                    sc.nextLine();
                    out.print("Enter Reason: ");
                    addRequest.reason = sc.nextLine();
                    out.print("Enter No of days:");
                    int days = sc.nextInt();
                    if(days > emp.getAvailableLeave()) {
                        out.println("Requested Leave Days is More Than Available Days.");
                        out.println("Leave cannot be added");
                        break;
                    }
                    else {
                        addRequest.days = days;
                    }

                    out.println();
                    emp.applyLeave(addRequest);
                    mn.setDetails();
                    out.println("Leave Details: " + addRequest.toString());
                    flag = false;
                    break;

                case 3:
                    out.print("\tEnter Request Id: ");
                    int id = sc.nextInt();
                    int c = 0;
                    for (int i = 0; i < emp.leaveRequest.size(); i++) {
                        if (emp.leaveRequest.get(i).requestId == id) {
                            emp.cancelLeave((LeaveRequest) emp.leaveRequest.get(i));
                            mn.delEmp();
                            c = 1;
                            break;
                        }
                    }

                    if (c ==0) {
                        out.println("Request Unsuccessful");
                    }
                    break;
                     
               case 4:
                    emp.viewLeaveSummary();
                    break;

                default:
                    out.println("Invalid Input");
            }
        } while(ch !=5);
}
}