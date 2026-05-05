/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de3;

import java.io.Serializable;

/**
 *
 * @author Minh Tuyen
 */
public abstract class Project implements Serializable{

    protected int projectId;
    protected String projectName;
    protected String studentName;
    protected double rawScore;

    public String getStudentNameNormal() {
        if (studentName == null) {
            return " ";
        } 
        String []words = studentName.toLowerCase().trim().split("\\s+");
        String res = " ";
        for(String w : words){
        if(!w.isEmpty()){
          String wordNormal = w.toUpperCase().charAt(0)+w.substring(1);
          
          res += wordNormal +" ";
        }
        }
        return res.trim();
    }
    public abstract double finalScore();
    public void printTitle(){
        System.out.printf("| %-10s | %-15s | %-20s | %-10s ","ID","ProjectName","StudentName","rawScore");
        
    }
    public void printData(){
        System.out.printf("| %-10d | %-15s | %-20s | %-10.1f ",this.projectId,this.projectName,getStudentNameNormal(),this.rawScore);
    }

    public Project() {
    }

    public Project(int projectId, String projectName, String studentName, double rawScore) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.studentName = studentName;
        this.rawScore = rawScore;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getRawScore() {
        return rawScore;
    }

    public void setRawScore(double rawScore) {
        this.rawScore = rawScore;
    }
    
}
