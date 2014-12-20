package org.cloudbus.cloudsim.simulate;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.ResCloudlet;

public class CustomResCloudlet extends ResCloudlet {	
	private int bestVmId;
	private double maxProcessable = 0;
	private int bestDatacenterId;
	
	public CustomResCloudlet(Cloudlet cloudlet) {
		super(cloudlet);
	}

	public double getMaxProcessable() {
		return maxProcessable;
	}

	public void setMaxProcessable(double maxProcessable) {
		this.maxProcessable = maxProcessable;
	}

	public int getBestVmId() {
		return bestVmId;
	}

	public void setBestVmId(int bestVmId) {
		this.bestVmId = bestVmId;
	}

	public int getBestDatacenterId() {
		return bestDatacenterId;
	}

	public void setBestDatacenterId(int bestDatacenterId) {
		this.bestDatacenterId = bestDatacenterId;
	}
}
