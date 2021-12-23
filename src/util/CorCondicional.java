package util;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CorCondicional {

	public static void alteracaoCorButton (int contador, Button bt1,  Button bt2) {
		removerCorBt(bt1, "verdeBt");
		removerCorBt(bt1, "vermelhoBt");
		
		removerCorBt(bt2, "verdeBt");
		removerCorBt(bt2, "vermelhoBt");
		
		
		if (contador > 0) {
			bt1.getStyleClass().add("verdeBt");
			bt2.getStyleClass().add("verdeBt");
		}
		else if (contador < 0) {
			bt1.getStyleClass().add("vermelhoBt");
			bt2.getStyleClass().add("vermelhoBt");
		}
	}
	
	public static void alteracaoCorLb (int contador, Label label) {
		label.setText(Integer.toString(contador));
		
		removerCorLb(label, "verdeLb");
		removerCorLb(label, "vermelhoLb");
		
		if (contador > 0) {
			label.getStyleClass().add("verdeLb");
		}
		else if (contador < 0) {
			label.getStyleClass().add("vermelhoLb");
		}
	}
	
	public static void removerCorBt(Button bt1, String cor) {
		bt1.getStyleClass().remove(cor);
	}
	
	public static void removerCorLb(Label lb1, String cor) {
		lb1.getStyleClass().remove(cor);
	}
	
}
