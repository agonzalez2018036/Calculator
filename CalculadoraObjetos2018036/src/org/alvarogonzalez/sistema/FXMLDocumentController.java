package org.alvarogonzalez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    float dato1, dato2, dato3 = 1, resultado, acumulador;
    int op;
    
    // Objetos
        @FXML Button btnMasMenos;
        @FXML Button btnPunto;
        @FXML Button btnIgual;
        @FXML Button btnSumar;
        @FXML Button btnRestar;
        @FXML Button btnMultiplicar;
        @FXML Button btnUnoPartidoX;
        @FXML Button btnDividir;
        @FXML Button btnPorcentaje;
        @FXML Button btnCuadrado;
        @FXML Button btnRaiz;
        @FXML Button btnCero;
        @FXML Button btnUno;
        @FXML Button btnDos;
        @FXML Button btnTres;
        @FXML Button btnCuatro;
        @FXML Button btnCinco;
        @FXML Button btnSeis;
        @FXML Button btnSiete;
        @FXML Button btnOcho;
        @FXML Button btnNueve;
        @FXML Button btnC;
        @FXML Button btnCE;
        @FXML TextField txtValores;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        // Botones numericos
        if(event.getSource() == btnUno)
            txtValores.setText(txtValores.getText() + "1");
        else if(event.getSource() == btnDos)
            txtValores.setText(txtValores.getText() + "2");
        else if(event.getSource() == btnTres)
            txtValores.setText(txtValores.getText() + "3");
        else if(event.getSource() == btnCuatro)
            txtValores.setText(txtValores.getText() + "4");
        else if(event.getSource() == btnCinco)
            txtValores.setText(txtValores.getText() + "5");
        else if(event.getSource() == btnSeis)
            txtValores.setText(txtValores.getText() + "6");
        else if(event.getSource() == btnSiete)
            txtValores.setText(txtValores.getText() + "7");
        else if(event.getSource() == btnOcho)
            txtValores.setText(txtValores.getText() + "8");
        else if(event.getSource() == btnNueve)
            txtValores.setText(txtValores.getText() + "9");
        else if(event.getSource() == btnCero)
            txtValores.setText(txtValores.getText() + "0");
        
        // Botones para operaciones
        // Suma
        else if(event.getSource() == btnSumar){
            dato1 = dato1 + Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;
            btnPunto.setDisable(false);
        }
        // Resta
        else if(event.getSource() == btnRestar){
            dato1 = dato1 - Float.parseFloat(txtValores.getText());
            txtValores.setText("-");
            op = 2;
            btnPunto.setDisable(false);
        }
        //Multiplicar
        else if(event.getSource() == btnMultiplicar){
            dato3 = dato3 * Float.parseFloat(txtValores.getText());
            dato1 = dato3;
            txtValores.setText("");
            op = 3;
            btnPunto.setDisable(false);
        }
        //Dividir
        else if(event.getSource() == btnDividir){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 4;
            btnPunto.setDisable(false);
        }
        //Porcentaje
        else if(event.getSource() == btnPorcentaje){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 5;
            btnPunto.setDisable(false);
        }
        //Cuadrado
        else if(event.getSource() == btnCuadrado){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = dato1 * dato1;
            txtValores.setText(String.valueOf(resultado));
            dato1 = 0;
        }
        //Uno partido X
        else if(event.getSource() == btnUnoPartidoX){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = 1 / dato1;
            txtValores.setText("");
            txtValores.setText(String.valueOf(resultado));  
        }
        //Raiz cuadrada
        else if(event.getSource() == btnRaiz){
            dato1 = Float.parseFloat(txtValores.getText());
            if(dato1 >= 0){
                resultado = (float)Math.sqrt(dato1);
                txtValores.setText(String.valueOf(resultado));
            } else
                txtValores.setText("Operacion no válida!");
            
            dato1 = 0;
          /*dato2 = 0;
            resultado = 0;*/
        }
        //Mas-Menos
        else if(event.getSource() == btnMasMenos){
            dato1 = Float.parseFloat(txtValores.getText());
            if(dato1 != 0){ 
                resultado = dato1 * -1;
                txtValores.setText(String.valueOf(resultado));
            } else{
              txtValores.setText("0.0");
            }
                dato1 = 0;
        }      
        //Bonton C
        else if(event.getSource() == btnC){
            dato1 = 0;
            dato2 = 0; 
            dato3 = 1;
            resultado = 0;
            txtValores.setText("");
            btnPunto.setDisable(false);
            btnIgual.setDisable(false);
            btnUno.setDisable(false);
            btnDos.setDisable(false);
            btnTres.setDisable(false);
            btnCuatro.setDisable(false);
            btnCinco.setDisable(false);
            btnSeis.setDisable(false);
            btnSiete.setDisable(false);
            btnOcho.setDisable(false);
            btnNueve.setDisable(false);
            btnCero.setDisable(false);
            btnSumar.setDisable(false);
            btnRestar.setDisable(false);
            btnDividir.setDisable(false);
            btnMultiplicar.setDisable(false);
            btnIgual.setDisable(false);
            btnIgual.setDisable(false);
            btnIgual.setDisable(false);
            btnPunto.setDisable(false);
            btnMasMenos.setDisable(false);
            btnUnoPartidoX.setDisable(false);
            btnRaiz.setDisable(false);
            btnCuadrado.setDisable(false);
            btnPorcentaje.setDisable(false);
            btnCE.setDisable(false);
        }
        //Boton CE
        else if(event.getSource() == btnCE){
            if(op == 2){
                txtValores.setText(txtValores.getText().substring(0, 1) + "");
            } else
            txtValores.setText("");
        }
        
        //Boton de igualdad
        else if(event.getSource() == btnIgual){
            try{
                dato2 = Float.parseFloat(txtValores.getText());
                txtValores.setText("");
            
                switch(op){
                    case 1:
                        resultado = dato1 + dato2;
                        txtValores.setText(String.valueOf(resultado));
                        dato1 = 0;
                        break;
                    case 2:
                        resultado = (dato1 - dato2) * -1;
                            if(resultado != 0) 
                                txtValores.setText(String.valueOf(resultado));
                            else
                            txtValores.setText("0.0");
                        dato1 = 0;
                        break;
                    case 3:
                        resultado = dato1 * dato2;
                        txtValores.setText(String.valueOf(resultado));
                        dato1 = 0;
                        break;
                    case 4:
                            if(dato2 != 0){
                                resultado = dato1 / dato2;
                                txtValores.setText(String.valueOf(resultado));
                            } else{
                                txtValores.setText("Operacion no válida!");
                            }
                            dato1 = 0;
                            break;
                    case 5:
                        resultado = (dato1 * dato2) / 100;
                        txtValores.setText(String.valueOf(resultado));
                        dato1 = 0;
                        break;
                }
            } catch(NumberFormatException e){
                txtValores.setText("Error de sintaxis");
                btnIgual.setDisable(true);
                btnUno.setDisable(true);
                btnDos.setDisable(true);
                btnTres.setDisable(true);
                btnCuatro.setDisable(true);
                btnCinco.setDisable(true);
                btnSeis.setDisable(true);
                btnSiete.setDisable(true);
                btnOcho.setDisable(true);
                btnNueve.setDisable(true);
                btnCero.setDisable(true);
                btnSumar.setDisable(true);
                btnRestar.setDisable(true);
                btnDividir.setDisable(true);
                btnMultiplicar.setDisable(true);
                btnPunto.setDisable(true);
                btnMasMenos.setDisable(true);
                btnUnoPartidoX.setDisable(true);
                btnRaiz.setDisable(true);
                btnCuadrado.setDisable(true);
                btnPorcentaje.setDisable(true);
                btnCE.setDisable(true);
            }
        //Boton punto
        } else if(event.getSource() == btnPunto){
            txtValores.setText(txtValores.getText() + ".");
            if(txtValores.getText().equals(".")){
                txtValores.setText("0.");
            } else if(txtValores.getText().equals("-.")){
                txtValores.setText("-0.");
            } else{
            ///txtValores.setText(txtValores.getText() + ".");
            btnPunto.setDisable(true);                
            } 
        }
    }
    
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
    }       
}
