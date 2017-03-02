package calcbasica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/* @author Álvaro García Fernández */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button BotonSumar;
    @FXML
    private Label numero1;
    @FXML
    private Button BotonPorcentaje;
    @FXML
    private Button BotonElevarA;
    @FXML
    private Button BotonDividir;
    @FXML
    private TextField NumeroInsert;
    @FXML
    private Label numero2;
    @FXML
    private TextField Insertnum2;
    @FXML
    private Label resultado;
    @FXML
    private TextField Resultado;
    @FXML
    private Button BotonLimpiar;
    @FXML
    private TextArea Resumen_Operaciones;
    @FXML
    private Label numero11;
    String operacion=null;
    int numoperacion=0;
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AccionSumar(ActionEvent event) {
       this.numoperacion++;
       this.operacion="Suma:";
       double num1 = 0;
       double num2 = 0;
       double resultado;
       String num1Text;
       String num2Text;
       num1Text=this.NumeroInsert.getText();
       try{
       num1= Integer.parseInt(num1Text);
       }catch(Exception e){
           this.NumeroInsert.setText("Datos no validos");
       }
       num2Text=this.Insertnum2.getText();
        try{
        num2= Integer.parseInt(num2Text);
       }catch(Exception e){
           this.Insertnum2.setText("Datos no validos");
       } 
       resultado=num1+num2;
       this.Resultado.setText(""+resultado);
       Resumen(this.operacion,this.numoperacion,num1,num2,"+",resultado);
    }
    private void Resumen(String operacion,int numoperacion,double num1,double num2,String simbolo,double resultado){
        this.Resumen_Operaciones.appendText("Operación "+numoperacion+", "+operacion+" "+num1+simbolo+num2+"="+resultado+"\n");
    }
    @FXML
    private void AccionPorcentaje(ActionEvent event) {
       this.numoperacion++;
       this.operacion="Porcentaje:";
        double num1 = 0;
       double num2 = 0;
       double resultado;
       String num1Text;
       String num2Text;
       num1Text=this.NumeroInsert.getText();
       try{
       num1= Integer.parseInt(num1Text);
       }catch(Exception e){
           this.NumeroInsert.setText("Datos no validos");
       }
       num2Text=this.Insertnum2.getText();
        try{
        num2= Integer.parseInt(num2Text);
       }catch(Exception e){
           this.Insertnum2.setText("Datos no validos");
       } 
       resultado=num1-num2;
       resultado=resultado/num1;
       resultado=resultado*100;
       this.Resultado.setText(""+resultado);
       Resumen(this.operacion,this.numoperacion,num1,num2,"% de ",resultado);
    }

    @FXML
    private void AccionElevarA(ActionEvent event) {
       this.numoperacion++;
       this.operacion="Potencia:";
        double base = 0;
       double exponente = 0;
       double resultado;
       String num1Text;
       String num2Text;
       num1Text=this.NumeroInsert.getText();
       try{
       base= Integer.parseInt(num1Text);
       }catch(Exception e){
           this.NumeroInsert.setText("Datos no validos");
       }
       num2Text=this.Insertnum2.getText();
        try{
        exponente= Integer.parseInt(num2Text);
       }catch(Exception e){
           this.Insertnum2.setText("Datos no validos");
       } 
       resultado=Math.pow(base, exponente);
       this.Resultado.setText(""+resultado);
       Resumen(this.operacion,this.numoperacion,base,exponente," elevado a ",resultado);
    }
    @FXML
    private void AccionDividir(ActionEvent event) {
       this.numoperacion++;
       this.operacion="División:";
       double num1 = 0;
       double num2 = 0;
       double resultado = 0;
       String num1Text;
       String num2Text;
       num1Text=this.NumeroInsert.getText();
       try{
       num1= Integer.parseInt(num1Text);
       }catch(Exception e){
           this.NumeroInsert.setText("Datos no validos");
       }
       num2Text=this.Insertnum2.getText();
        try{
        num2= Integer.parseInt(num2Text);
       }catch(Exception e){
           this.Insertnum2.setText("Datos no validos");
       }
        if(num2==0){
             this.Resultado.setText("Error");
        }else{
       resultado=num1/num2;
       this.Resultado.setText(""+resultado);
        }
        Resumen(this.operacion,this.numoperacion,num1,num2,"/",resultado);
    }

    @FXML
    private void InsertarNumero1(ActionEvent event) {
    }

    @FXML
    private void Numero2Insertar(ActionEvent event) {
    }

    @FXML
    private void AccionResultado(ActionEvent event) {
    }

    @FXML
    private void AccionLimpiar(ActionEvent event) {
        this.NumeroInsert.setText("");
        this.Insertnum2.setText("");
        this.Resultado.setText("");
    }

    @FXML
    private void Resumen(MouseEvent event) {
    }
    
}
