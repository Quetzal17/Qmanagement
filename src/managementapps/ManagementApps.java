/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementapps;

/**
 *
 * @author Quetzal's
 */
public class ManagementApps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         splash sp = new splash();
         sp.setVisible(true);
         Login lg = new Login();
         Home ho = new Home();
         //Employees emp = new Employees();
           try{
               for(int i=0; i<=100; i++){
                      Thread.sleep(50);
                   splash.jLabel2.setText(Integer.toString(i)+"%");
                   splash.ProgressBar.setValue(i);
                      if(i==100){
                          sp.setVisible(false);
                          lg.setVisible(true);
                      }
               }
           }
          catch(Exception e){
               System.out.println(e);
    }
    
}

}
