package gm.Taller.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Piezas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPieza;
    String piezaName;
    String piezaDescripcion;
    Integer stock;

    @ManyToMany(mappedBy = "piezas", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Reparaciones> reparaciones;

    public Integer getIdPieza(){
        return idPieza;
    }

    public String getPiezaName(){
        return piezaName;
    }
    public String getPiezaDescripcion(){
        return piezaDescripcion;
    }
    public Integer getStock(){
        return stock;
    }

    public void setIdPieza(Integer id) {
        this.idPieza = id;
    }

    public void setPiezaName(String piezaName) {
        this.piezaName = piezaName;
    }

    public void setPiezaDescripcion(String piezaDescripcion) {
        this.piezaDescripcion = piezaDescripcion;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
