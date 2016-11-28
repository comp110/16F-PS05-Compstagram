package comp110.filters;

import comp110.Color;
import comp110.Image;

public class ColorizeFilter implements Filter {

	public Image process(Image input) {
		// TODO:
		return input;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */

	private double _amount;

	private Color _color;

	public ColorizeFilter(double amount, Color color) {
		this._amount = amount;
		this._color = color;
	}

	public double getAmount() {
		return this._amount;
	}

	public void setAmount(double amount) {
		this._amount = amount;
	}

	public Color getColor() {
		return this._color;
	}

	public void setColor(Color color) {
		this._color = color;
	}

	public String toString() {
		return "Colorize";
	}

}