package random;
//05.09.2019 1:07
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField vid;

    @FXML
    private Button button;

    @FXML
    private Label result;

    @FXML
    private TextField dodo;
    
    public int number;

    @FXML
    void f5f5f5(ActionEvent event) {

    }
 
    @FXML
    void initialize() {
button.setOnAction(event ->{
    try{
randomNumber();
}catch(Exception e){
        System.out.println(e);
        result.setText("Eror 404");
        }
});

    }
  public void randomNumber(){

 String myString = vid.getText();
 int vv = Integer.parseInt(myString);
 String myString_2 = dodo.getText();
 int dodd = Integer.parseInt(myString_2);
number = (int)  (vv + Math.random()*((dodd-vv)+1));
result.setText(number +"");
if(vv >= dodd){
result.setText("Eror 404");
}
  }
  
 
}



