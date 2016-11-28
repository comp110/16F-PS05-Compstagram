package comp110.filters;

import comp110.Image;

public class BrightnessFilter implements Filter {

	public Image process(Image input) {
		// TODO
		return input;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;

	public BrightnessFilter(double amount) {
		_amount = amount;
	}

	public String toString() {
		return "Brightness";
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

}