package co.edu.javeriana.fbd.hotelapp.view;

import co.edu.javeriana.fbd.hotelapp.model.dao.ReservaDAO;
import co.edu.javeriana.fbd.hotelapp.model.dao.impl.ReservaDAOimpl;
import co.edu.javeriana.fbd.hotelapp.model.dto.ReservaDTO;

public class Principal {
    public static void main (String[] args){
        ReservaDTO r1= new ReservaDTO(1L, 1L,"04/02/2021","04/02/2022",9,4,3,4,34600);
        ReservaDAO rdao = new ReservaDAOimpl();
        ReservaDTO r2= rdao.create(r1);
        System.out.println("r2: "+r2);

    }

}
