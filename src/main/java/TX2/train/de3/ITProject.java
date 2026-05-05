/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX2.train.de3;



/**
 *
 * @author Minh Tuyen
 */
public class ITProject extends Project implements Comparable<ITProject>{

    private String language;
    private boolean isDeployable;

    public ITProject() {
        super();
    }

    public ITProject(String language, boolean isDeployable, int projectId, String projectName, String studentName, double rawScore) {
        super(projectId, projectName, studentName, rawScore);
        this.language = language;
        this.isDeployable = isDeployable;
    }

    @Override
    public double finalScore() {
        double res = rawScore;
        if (isDeployable == true) {
            res += 1;
        }
        if (res > 10) {
            res = 10;
        }
        return res;
    }
    @Override
    public void printTitle(){
        super.printTitle();
        System.out.printf("| %-15s | %-15s | %-15s |","Language","Deployable?","FinalScore");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    }
    @Override
    public void printData(){
       super.printData();
        System.out.printf("| %-15s | %-15s | %-15.1f |",this.language,this.isDeployable,finalScore());
    }
    
    @Override
    public int compareTo(ITProject other){
        return Double.compare(other.finalScore(), this.finalScore());
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isIsDeployable() {
        return isDeployable;
    }

    public void setIsDeployable(boolean isDeployable) {
        this.isDeployable = isDeployable;
    }
    
    
    
}
