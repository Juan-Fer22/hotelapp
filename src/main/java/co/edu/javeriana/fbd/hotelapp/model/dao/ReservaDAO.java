package co.edu.javeriana.fbd.hotelapp.model.dao;

import co.edu.javeriana.fbd.hotelapp.model.dto.ReservaDTO;

public interface ReservaDAO {
    public ReservaDTO create(ReservaDTO reserva);
    public ReservaDTO findByID(Long cliente);
}
