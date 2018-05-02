/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 04079893230
 */
public class CalculadoraController implements Initializable {
     
    /**
     * Initializes the controller class.
     */
    @FXML 
    private TextField txtNumero1, txtNumero2, txtResultado;
    
    @FXML 
    private Button btnSoma;
    
    @FXML 
    private void soma(ActionEvent Event){
        Double num1= Double.parseDouble(txtNumero1.getText());
        Double num2=Double.parseDouble(txtNumero2.getText());
        Double Resultado=num1+num2;
        txtResultado.setText(Resultado.toString()); 
    }
    
    @FXML
    private void subtracao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()); 
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado =num1 - num2;
        txtResultado.setText(resultado.toString()); //  toString converte para texto ou String
    }
    
    @FXML
    private void divisao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()); 
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado =num1 / num2;
        txtResultado.setText(resultado.toString()); //  toString converte para texto ou String
    }
    
    @FXML
    private void multiplicacao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText()); 
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resultado =num1 * num2;
        txtResultado.setText(resultado.toString()); //  toString converte para texto ou String
    }
    @FXML
    private void limpar(ActionEvent event) {
        txtResultado.setText(null); 
        txtNumero1.setText(null);
        txtNumero2.setText(null);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
