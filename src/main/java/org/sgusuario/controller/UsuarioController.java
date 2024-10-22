package org.sgusuario.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.sgusuario.model.Contato;
import org.sgusuario.model.Usuario;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UsuarioController implements Initializable {
    @FXML
    private HBox pnTitulo;

    @FXML
    private GridPane pnForm;

    @FXML
    private HBox pnButtons;

    @FXML
    private Label nome;

    @FXML
    private Label CPF;

    @FXML
    private Label genero;

    @FXML
    private Label email;

    @FXML
    private Label celular;

    @FXML
    private Label Perfil;

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCPF;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txCelular;

    @FXML
    private TextField txPerfil;

    @FXML
    private RadioButton txRandR;

    @FXML
    private RadioButton txSert;

    @FXML
    private ToggleGroup tgGrupo;

    @FXML
    private ComboBox<String> cbPerfil;
    private ObservableList<String> obListPerfil;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnLimpar;

    private Usuario usuario;
    private Contato contato;

    @FXML
    public void onBtnOkAct(){
        this.usuario.setNome(this.txNome.getText());
        this.usuario.setCpf(this.txCPF.getText());
        this.contato.setEmail(this.txEmail.getText());
        this.contato.setCelular(this.txCelular.getText());
        this.usuario.setContato(this.contato);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.usuario = new Usuario();
        this.contato = new Contato();
        List<String> listPerfil = new ArrayList<String>();
        listPerfil.add("Aluno");
        listPerfil.add("Professor");
        listPerfil.add("Cordenador");
        listPerfil.add("Administrativo");
        listPerfil.add("Direção");
        this.obListPerfil = FXCollections.observableList(listPerfil);
        this.cbPerfil.setItems(this.obListPerfil);
    }
}