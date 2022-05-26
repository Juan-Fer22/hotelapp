package co.edu.javeriana.fbd.hotelapp.model.dto;

import java.util.Objects;

public class ReservaDTO {

    private Long dni_reserva;
    private Long dni_hotel;
    private Long dni_cliente;
    private String fechaini;
    private String fechafin;
    private int numhabitaciones;
    private int canti_niños;
    private int canti_adultos;
    private int canti_ancianos;
    private int precio;

    public ReservaDTO(Long dni_hotel, Long dni_cliente, String fechaini, String fechafin, int numhabitaciones, int canti_niños, int canti_adultos, int canti_ancianos, int precio) {
        this.dni_hotel = dni_hotel;
        this.dni_cliente = dni_cliente;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.numhabitaciones = numhabitaciones;
        this.canti_niños = canti_niños;
        this.canti_adultos = canti_adultos;
        this.canti_ancianos = canti_ancianos;
        this.precio = precio;
    }

    public Long getDni_hotel() {
        return dni_hotel;
    }

    public void setDni_hotel(Long dni_hotel) {
        this.dni_hotel = dni_hotel;
    }

    public Long getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(Long dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public int getNumhabitaciones() {
        return numhabitaciones;
    }

    public void setNumhabitaciones(int numhabitaciones) {
        this.numhabitaciones = numhabitaciones;
    }

    public int getCanti_niños() {
        return canti_niños;
    }

    public void setCanti_niños(int canti_niños) {
        this.canti_niños = canti_niños;
    }

    public int getCanti_adultos() {
        return canti_adultos;
    }

    public void setCanti_adultos(int canti_adultos) {
        this.canti_adultos = canti_adultos;
    }

    public int getCanti_ancianos() {
        return canti_ancianos;
    }

    public void setCanti_ancianos(int canti_ancianos) {
        this.canti_ancianos = canti_ancianos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservaDTO that = (ReservaDTO) o;
        return numhabitaciones == that.numhabitaciones && canti_niños == that.canti_niños && canti_adultos == that.canti_adultos && canti_ancianos == that.canti_ancianos && precio == that.precio && dni_hotel.equals(that.dni_hotel) && dni_cliente.equals(that.dni_cliente) && fechaini.equals(that.fechaini) && fechafin.equals(that.fechafin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni_hotel, dni_cliente, fechaini, fechafin, numhabitaciones, canti_niños, canti_adultos, canti_ancianos, precio);
    }

    @Override
    public String toString() {
        return "ReservaDTO{" +
                "dni_hotel=" + dni_hotel +
                ", dni_cliente=" + dni_cliente +
                ", fechaini='" + fechaini + '\'' +
                ", fechafin='" + fechafin + '\'' +
                ", numhabitaciones=" + numhabitaciones +
                ", canti_niños=" + canti_niños +
                ", canti_adultos=" + canti_adultos +
                ", canti_ancianos=" + canti_ancianos +
                ", precio=" + precio +
                '}';
    }
}
