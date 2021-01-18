package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button five;

    @FXML
    private Button two;

    @FXML
    private Button four;

    @FXML
    private Button ac;

    @FXML
    private Button three;

    @FXML
    private Button six;

    @FXML
    private Button point;

    @FXML
    private Button zero;

    @FXML
    private Button pow;

    @FXML
    private Button div;

    @FXML
    private Button sub;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button mult;

    @FXML
    private Button add;

    @FXML
    private Button one;

    @FXML
    private Button equals;

    @FXML
    private Button ans;

    @FXML
    private Button del;

    @FXML
    private Button sin;

    @FXML
    private Button cos;

    @FXML
    private Button tan;

    @FXML
    private Button sqrt;

    @FXML
    private Button mod;

    @FXML
    private TextField display;

    private boolean dotActive = true;
    private byte operation;
    private double data1;
    private double data2;
    private double result = 0;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#######");

    @FXML
    void handleButtonAction(ActionEvent event) {
        //numbers
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == point) {
            if (dotActive) {
                display.setText(display.getText() + ".");
                dotActive = false;
            }

        }
        //functions 1
        else if (event.getSource() == add) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 1;
            dotActive = true;
        } else if (event.getSource() == sub) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 2;
            dotActive = true;
        } else if (event.getSource() == mult) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 3;
            dotActive = true;
        } else if (event.getSource() == div) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 4;
            dotActive = true;
        }
        //functions 2
        else if (event.getSource() == mod) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 5;
            dotActive = true;
        } else if (event.getSource() == pow) {
            data1 = Double.parseDouble(display.getText());
            display.setText("");
            operation = 6;
            dotActive = true;
        }
        //functions 3
        else if (event.getSource() == ac) {
            display.setText("");
            dotActive = true;
        } else if (event.getSource() == del) {
            if(display.getText().substring(display.getText().length()-1).equals(".")){
                dotActive = true;
            }
            display.setText(removeLastCharacter(display.getText()));
        }
        //function 4
        else if (event.getSource() == sqrt) {
            display.setText(decimalFormat.format(Math.sqrt(Double.parseDouble(display.getText()))));
        } else if (event.getSource() == sin) {
            display.setText(decimalFormat.format(Math.sin(Math.toRadians(Double.parseDouble(display.getText())))));
        } else if (event.getSource() == cos) {
            display.setText(decimalFormat.format(Math.cos(Math.toRadians(Double.parseDouble(display.getText())))));
        } else if (event.getSource() == tan) {
            if (Double.parseDouble(display.getText()) == 90 || Double.parseDouble(display.getText()) == 270) {
                display.setText("Infinity");
            } else {
                display.setText(decimalFormat.format(Math.tan(Math.toRadians(Double.parseDouble(display.getText())))));
            }

        }
        //function 5
        else if (event.getSource() == equals) {
            data2 = Double.parseDouble(display.getText());

            switch (operation) {
                case 1:
                    result = data1 + data2;
                    break;
                case 2:
                    result = data1 - data2;
                    break;
                case 3:
                    result = data1 * data2;
                    break;
                case 4:
                    try {
                        result = data1 / data2;
                    } catch (ArithmeticException e) {
                        display.setText("can't be divided by zero");
                    }
                    break;
                case 5:
                    result = data1 % data2;
                    break;
                case 6:
                    result = Math.pow(data1, data2);
                    break;
            }

            display.setText(Double.toString(result));
        } else if (event.getSource() == ans) {
            display.setText(Double.toString(result));
        }


    }

    public String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
