/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Ganta
 */
public class FXMLDocumentController implements Initializable {
    
    LinkedList<Estudiante> listaest;
    
    @FXML
    private Label labelnom;
    @FXML
    private Label labelcode;
    @FXML
    private TextField nom;
    @FXML
    private TextField code;
    
    
    @FXML
    private void handleButtonAceptar(ActionEvent event) {
        String nombre = nom.getText();
        String codigo = code.getText();
        
        Estudiante objE = new Estudiante(nombre, codigo);
        boolean guardar = listaest.add(objE);
        
        if (guardar){
       nom.setText("");
       code.setText("");
       
        }
    }
    @FXML
    private void handleButtonMostrar(ActionEvent event){
        String mostrar="";
        for (int i = 0; i < listaest.size(); i++) {
            
           mostrar+= listaest.get(i)+ "\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaest = new LinkedList<>();
    }    
    
}
