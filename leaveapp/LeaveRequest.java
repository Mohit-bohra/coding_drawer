package leaveapp;

class LeaveRequest implements Serializable{
    int requestId;
    String reason;
    int days;
}