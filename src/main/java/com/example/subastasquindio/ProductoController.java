package com.example.subastasquindio;

import com.example.subastasquindio.model.TipoArticulo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import static com.example.subastasquindio.model.TipoArticulo.*;


public class ProductoController {
    @FXML
    public Button botonEliminar;
    @FXML
    public Button botonBuscar;
    @FXML
    public Button botonActualizar;
    @FXML
    public Button botonBorrar;
    @FXML
    public TableColumn tableColumnId;
    @FXML
    public TableColumn tableColumnTipoArticulo;
    @FXML
    public TableColumn tableColumnNombre;
    @FXML
    public TextField textFieldIdProducto;
    @FXML
    public TextField textFieldNombre;
    @FXML
    public ComboBox comboBoxTipoArticulo;

    public void initialize(){
        ObservableList articulos= FXCollections.observableArrayList(TipoArticulo.values());
        comboBoxTipoArticulo.setItems(articulos);
    }


}
