/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgit;

/**
 *
 * @author wwwsa
 */
public class StudentGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] ch=new char[5];
        Student[] s=new Student[5];
        s[0].id=10;
        s[0].name="Megha";

    }
    
}

 class Student {
        public String name;
        public int id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
 }

