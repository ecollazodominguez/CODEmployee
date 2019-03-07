/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpackage;

/**
 *
 * @author ecollazodominguez
 */
public class Main {
    
    
    public static void main(String[] args) {
        Employee EmpleadoA;
        EmpleadoA = new BuilderEmployee("Maria",350445)
                    .setLastName("Vazquez")
                    .setMiddleName("Perez")
                    .createEmployee();
        System.out.println(EmpleadoA.toString());
        
        Employee EmpleadoB;
        EmpleadoB = new BuilderEmployee("Alfonso",350654)
                    .setHireDate(25012018)
                    .setBirthDate(12061956)
                    .createEmployee();
        System.out.println(EmpleadoB.toString());
    }
    
}
