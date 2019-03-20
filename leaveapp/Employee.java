package leaveapp;
import java.io.FileInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;
import leaveapp.LeaveRequest;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
        ArrayList<LeaveRequest> leaveRequest = new ArrayList<LeaveRequest>();
         int empID;
         String name;
         int availableLeave;
         int currentLeaveCount;

	
	int getempID() {
        return empID;
               }
        int getAvailableLeave() {
        return availableLeave;
                      }
        void applyLeave	(LeaveRequest req){
        leaveRequest.add(req);
        availableLeave -= req.days;
        currentLeaveCount += req.days;
        out.println("\tRequest Added");
    }

    void cancelLeave(LeaveRequest req) {
        leaveRequest.remove(req);
        availableLeave += req.days;
        currentLeaveCount -= req.days;
        out.println("\tRequest Cancelled");
    }
   void viewAppliedLeaves() {
        out.println("\tEmpolyee ID: " + empID);
        out.println("\tName: " + name);
        out.println("\tAvailable Leave: " + availableLeave);
        out.println("\tCurrent Leave Count: " + currentLeaveCount);
        out.println("\tLEAVE DETAILS: ");
        if(leaveRequest.size() == 0) {
            out.println("\tNo Leaves issued\n");
        }
        else {
            for (int i = 0; i < leaveRequest.size(); i++) {
                out.println("\tRequest No: " + leaveRequest.get(i).requestId);
                out.println("\tRequest Reason: " + leaveRequest.get(i).reason);
                out.println("\tPeriod (in Days): " + leaveRequest.get(i).days);
                out.println();
            }
        }
    }

    void viewLeaveSummary(){
        out.println("\tEmpolyee ID: " + empID);
        out.println("\tName: " + name);
        out.println("\tAvailable Leave: " + availableLeave);
        out.println("\tTotal number of leaves applied: " + currentLeaveCount + " Days");
    }
	
           

   
}