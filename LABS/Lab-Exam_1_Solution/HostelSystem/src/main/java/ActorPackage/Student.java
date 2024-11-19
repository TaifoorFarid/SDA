/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActorPackage;

/**
 *
 * @author Dell
 */
public class Student implements Observer
{
    private String stdId;
    private String std_name;
    private double distanceFromHostel;
    private String number;
    private boolean freeSubmitted;
    
    public Student(String stdId, String std_name, double distanceFromHostel, String number) {
        this.stdId = stdId;
        this.std_name = std_name;
        this.distanceFromHostel = distanceFromHostel;
        this.number = number;
    }
    
    public Student(String stdId, String std_name) {
        this.stdId = stdId;
        this.std_name = std_name;
    }
        
    public String getStdId() {
        return stdId;
    }

    public void setStdId(String std_id) {
        this.stdId = std_id;
    }

    public String getStdName() {
        return std_name;
    }

    public void setStdName(String std_name) {
        this.std_name = std_name;
    }

    public double getDistanceFromHostel() {
        return distanceFromHostel;
    }

    public void setDistanceFromHostel(double distanceFromHostel) {
        this.distanceFromHostel = distanceFromHostel;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public boolean isFeeSubmitted() {
        return freeSubmitted;
    }    
    
    public void update(String message) {
        System.out.println(message + " send to student with contact number " + this.number);
    }
}
