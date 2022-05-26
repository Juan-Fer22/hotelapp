package co.edu.javeriana.fbd.hotelapp.model.dao.impl;

import co.edu.javeriana.fbd.hotelapp.model.dao.ReservaDAO;
import co.edu.javeriana.fbd.hotelapp.model.dto.ReservaDTO;
import co.edu.javeriana.fbd.hotelapp.util.Oracle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservaDAOimpl implements ReservaDAO {
    private final Oracle oracle;
    public ReservaDAOimpl() {
        this.oracle = new Oracle();
    }

    @Override
    public ReservaDTO create(ReservaDTO reserva) {
        try {
            this.oracle.conectar();
            String query="INSERT INTO reserva (dni_cliente,dni_hotel,numhabitaciones,fechaini,fechafin,canti_niños, canti_adultos, canti_ancianos,precio) VALUES ("
                    +reserva.getDni_cliente()
                    +","+reserva.getDni_hotel()
                    +","+reserva.getNumhabitaciones()
                    +",'"+reserva.getFechaini()
                    +"','"+reserva.getFechafin()
                    +"',"+reserva.getCanti_niños()
                    +","+reserva.getCanti_adultos()
                    +","+reserva.getCanti_ancianos()
                    +","+reserva.getPrecio()
                    +");";
            System.out.println(query);
            Statement stmt= this.oracle.getConnection().createStatement();
            int code=stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code){
                case 1:
                    System.out.println("Se creo la persona.");
                    return findByID(reserva.getDni_cliente());
                default:
                    return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ReservaDTO findByID(Long cliente) {
        try {
            this.oracle.conectar();
            String query="SELECT * FROM reserva WHERE dni_cliente='"+cliente + "';";
            System.out.println(query);
            Statement stmt= this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs =stmt.executeQuery(query);
            if(rs.first()) {
                ReservaDTO reserva=new ReservaDTO(
                        rs.getLong("dni_hotel"),
                        rs.getLong("dni_cliente"),
                        rs.getString("fechaini"),
                        rs.getString("fechafin"),
                        rs.getShort("numhabitaciones"),
                        rs.getShort("canti_niños"),
                        rs.getShort("canti_adultos"),
                        rs.getShort("canti_ancianos"),
                        rs.getShort("precio")
                );
                stmt.close();
                return reserva;
            }else{
                stmt.close();
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
