/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouns_demo;

/**
 *
 * @author Shimaa Ahmed
 */
public class cs extends factorypattern{
    public Staff getStaff(String staffType)
    {
    if(staffType==null)
    {
        return null;
    }
    if(staffType.equalsIgnoreCase("TEACHINGASSISTAN"))
        
    {
        return new TeachingAssistant();
    }
    else if(staffType.equalsIgnoreCase("DOCTOR"))
        
    {
        return (Staff) new Doctor();

    }
    return null;
    }
    
}
