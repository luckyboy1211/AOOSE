/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResidentDemandsHandler;

/**
 *
 * @author glori
 */
public interface ComplaintInt {
    public void makeNewComplaint(Complaint c);
    public void deleteComplaint();
    public Complaint viewComplaint();
}
