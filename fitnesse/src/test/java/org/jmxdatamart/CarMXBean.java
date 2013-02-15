/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmxdatamart;

import org.jmxdatamart.JMXTestServer.Car;

/**
 *
 * @author ayayakura
 */
public interface CarMXBean {
    
  public void setNAME(String NAME);

  public String getNAME();

  public void setYEAR(String YEAR);

  public String getYEAR();

  public void setENGINE(int ENGINE);
  
  public int getENGINE();
  
  public void setPOWER(int POWER);

  public int getPOWER();
    
}
