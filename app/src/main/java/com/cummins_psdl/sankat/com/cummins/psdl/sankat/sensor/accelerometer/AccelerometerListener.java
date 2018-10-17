package com.cummins_psdl.sankat.com.cummins.psdl.sankat.sensor.accelerometer;

public interface AccelerometerListener {
    
    public void onAccelerationChanged(float x, float y, float z);
  
    public void onShake(float force);
  
}