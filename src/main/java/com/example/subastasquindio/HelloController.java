package com.example.subastasquindio;

import com.example.subastasquindio.model.Anuncio;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class HelloController {
    @FXML
    public ImageView imageV;
    @FXML
    private Label lblNombre;

    @FXML
    private Label lblDescripcion;

    @FXML
    private final ArrayList<Anuncio> anuncios = new ArrayList<>();
    private int currentIndex = 0;

    @FXML
    private void initialize() {


        // Llenar la lista de anuncios
        Anuncio a = new Anuncio();
        a.setFoto("/Imagenes/reina.png");
        a.setNombreAnunciante("jacobo");
        Anuncio b = new Anuncio();
        b.setFoto("/Imagenes/reina.png");
        b.setNombreAnunciante("juan");
        Anuncio c = new Anuncio();
        c.setFoto("/Imagenes/tarjeta.png");
        c.setNombreAnunciante("nadie");

        anuncios.add(a);
        anuncios.add(b);
        anuncios.add(c);

        // Mostrar el primer anuncio
        mostrarAnuncio(anuncios.get(currentIndex));
    }

    @FXML
    private void onNextButtonClicked() {
        currentIndex = (currentIndex + 1) % anuncios.size();
        mostrarAnuncio(anuncios.get(currentIndex));
    }

    @FXML
    private void onPrevButtonClicked() {
        currentIndex = (currentIndex - 1 + anuncios.size()) % anuncios.size();
        mostrarAnuncio(anuncios.get(currentIndex));
    }

    @FXML
    private void mostrarAnuncio(Anuncio anuncio) {
        lblNombre.setText(anuncio.getNombreAnunciante());
        lblDescripcion.setText(anuncio.getDescripcion());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(anuncio.getFoto())));
        imageV.setImage(image);
    }

}