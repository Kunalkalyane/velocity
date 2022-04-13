package Generalisation;

import Generalisation.Generalisation_study.TRAI;

public class JIO implements TRAI {

	@Override
	public void call() {
		System.out.println("1rs/min");
	}

	@Override
	public void msg() {
		System.out.println("100msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("2GB/day");
		
	}
	public void NEWMETHOD_JIO()

	{
		System.out.println("JIO'S NEW METHOD");
	}
}
