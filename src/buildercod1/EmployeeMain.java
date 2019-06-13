/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercod1;

/**
 *
 * @author javiv
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Employee empleado1 = new EmployeeBuilder("David","Rodriguez",11l).setNewBirthDate(3).setNewBirthMonth(10).setNewBirthYear(85).createEmployee();
                
        System.out.println("Empleado del mes" + empleado1.toString());
        
    }
    
}