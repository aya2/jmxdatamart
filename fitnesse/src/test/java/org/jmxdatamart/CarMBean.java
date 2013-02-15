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
public class CarMBean implements CarMXBean{
    
    public static String NAME;
    public static String YEAR;
    public static int ENGINE;
    public static int POWER;
    

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public String getNAME() {
    return NAME;
  }

  public void setYEAR(String YEAR) {
    this.YEAR = YEAR;
  }

  public String getYEAR() {
    return YEAR;
  }

  public void setENGINE(int ENGINE) {
    this.ENGINE = ENGINE;
  }
  
  public int getENGINE(){
    return ENGINE;
  }
  
  public void setPOWER(int POWER) {
    this.POWER = POWER;
  }

  public int getPOWER() {
    return POWER;
  }
    
}
