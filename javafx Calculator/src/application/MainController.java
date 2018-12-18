package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label Result;
	private long number1=0;
	private String operator="";
	private boolean start=true;
	private Modal model=new Modal();
	
@FXML
public void processNumber(ActionEvent event)
{
if(start)
{
	Result.setText("");
	start=false;
}
String value=((Button)event.getSource()).getText();
Result.setText(Result.getText()+value);
}
@FXML
public void processOperators(ActionEvent event)
{
	String value=((Button)event.getSource()).getText();
	if(!value.equals("="))
	{
		if(!operator.isEmpty())
			return;
		operator=value;
		number1=Long.parseLong(Result.getText());
		Result.setText("");
	}
	else
	{
		if(operator.isEmpty())
			return;
		long number2=Long.parseLong(Result.getText());
		float output=model.calculate(number1, number2, operator);
		Result.setText(String.valueOf(output));
		operator= "";
		start=true;
	}
}
}
