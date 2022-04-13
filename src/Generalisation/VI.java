package Generalisation;

import Generalisation.Generalisation_study.TRAI;

public class VI implements TRAI {

	@Override
	public void call() {
		System.out.println("1.2rs/min");		
	}

	@Override
	public void msg() {
		System.out.println("200msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("1.8GB/day");
		
	}
	
	public void NEWMETHOD_VI()
	{
		System.out.println("VI NEW METHOD");
	}

}
