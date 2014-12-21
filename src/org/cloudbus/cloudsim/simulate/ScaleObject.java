package org.cloudbus.cloudsim.simulate;

public class ScaleObject {
	private int mips;
	private double scaleTime;
	
	public ScaleObject(int mips, double scaleTime) {
		this.mips = mips;
		this.scaleTime = scaleTime;
	}
	
	public double getScaleTime() {
		return scaleTime;
	}
	public void setScaleTime(double scaleTime) {
		this.scaleTime = scaleTime;
	}
	public int getMips() {
		return mips;
	}
	public void setMips(int mips) {
		this.mips = mips;
	}
}
