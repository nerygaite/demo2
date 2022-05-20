package nya.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloController {
///////////////////////////////////////////
     // данные со сценбилдера
    @FXML private Label lblResult;
    @FXML private Button btn0;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;
    @FXML private Button btnClear;
    @FXML private ImageView btnClose;
    @FXML private Button btnDivide;
    @FXML private Button btnEquals;
    @FXML private Button btnMinus;
    @FXML private Button btnMultiply;
    @FXML private Button btnPlus;
    @FXML private ImageView icon;
    @FXML private Pane titlePane;

///////////////////////////////////////////

    @FXML
    void Close() { //обрабатываю кнопку "закрыть окно приложения"
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }
    @FXML void symbol(MouseEvent event) { //символьное нажатие
    }
    @FXML void number() { //числовое нажатие

    }
    @FXML void number1() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+1);
    }
    @FXML void number2() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+2);
    }
    @FXML void number3() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+3);
    }
    @FXML void number4() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+4);
    }
    @FXML void number5() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+5);
    }
    @FXML void number6() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+6);
    }
    @FXML void number7() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+7);
    }
    @FXML void number8() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+8);
    }
    @FXML void number9() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+9);
    }
    @FXML void number0() {
        if(lblResult.getText()==""){
            lblResult.setText("");
        }
        lblResult.setText(lblResult.getText()+0);
    }
    @FXML void symbolP() {
        lblResult.setText("");
    }
    @FXML void symbolD() {

    }
    @FXML void symbolMu() {

    }
    @FXML void symbolE() {

    }
    @FXML void symbolMi() {

    }

}

