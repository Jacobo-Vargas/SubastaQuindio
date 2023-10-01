package com.example.subastasquindio.viewController;

import com.example.subastasquindio.controller.ProductoController;
import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.model.TipoArticulo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ProductoViewController {
    ProductoController productoController;
    ObservableList<ProductoDto> listaProductosDto = FXCollections.observableArrayList();
    ProductoDto productoDtoSeleccionado;

    @FXML
    public TableView<ProductoDto> tableViewProductos;

    @FXML
    public Button botonAgregar;
    @FXML
    public Button botonEliminar;
    @FXML
    public Button botonBuscar;
    @FXML
    public Button botonActualizar;
    @FXML
    public TableColumn<ProductoDto, String> tcID;
    @FXML
    public TableColumn<ProductoDto, String> tcTipoArticulo;
    @FXML
    public TableColumn<ProductoDto, String> tcNombre;
    @FXML
    public TextField txtID;
    @FXML
    public TextField txtNombre;
    @FXML
    public ComboBox comboBoxTipoArticulo;

    public void initialize() {

        productoController = new ProductoController();
        initView();


    }

    public void initView(){
        initDataBinding();
        obtenerProducto();
        tableViewProductos.setItems(listaProductosDto);
        listenerSelection();
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcID.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().id())));
        tcTipoArticulo.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().tipoArticulo())));
    }

    private void listenerSelection() {
        tableViewProductos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            productoDtoSeleccionado = newSelection;
            mostrarInformacionEmpleado(productoDtoSeleccionado);
        });
    }
    private void mostrarInformacionEmpleado(ProductoDto productoSeleccionado) {
        if(productoSeleccionado != null){
            txtNombre.setText(productoSeleccionado.nombre());
            txtID.setText(String.valueOf(productoSeleccionado.id()));
          //  comboBoxTipoArticulo.setText(productoSeleccionado.tipoArticulo());  pendiente
        }
    }

    private void obtenerProducto() {
        listaProductosDto.addAll(productoController.obtenerProductoDto());
    }

}
