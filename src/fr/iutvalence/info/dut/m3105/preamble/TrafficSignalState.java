package fr.iutvalence.info.dut.m3105.preamble;

public abstract class TrafficSignalState
{
	protected final int durationInSeconds;
	
	protected TrafficSignalState(int durationInSeconds)
	{
		this.durationInSeconds = durationInSeconds;
	}
	
	public void callButton(TrafficSignal ts){
		
	}
	
	public void tick(TrafficSignal ts){
		
	}
}
