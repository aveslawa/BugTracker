package com.company.dao;

import com.company.entities.Ticket;

import com.company.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Viachaslau.
 */
public class TicketDao {

    private static final Object LOCK = new Object();
    private static TicketDao INSTANCE = null;

    public static TicketDao getInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
                if (INSTANCE == null) {
                    INSTANCE = new TicketDao();
                }
            }
        }
        return INSTANCE;
    }

    public void save(Ticket ticket) {
        try (Connection connection = ConnectionManager.getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO tickets (ticket_id, title, description, category, incident_type, "
                            + "priority, resolution, severity, status) VALUES(?,?,?) ; ")) {
                preparedStatement.setLong(1, ticket.getId());
                preparedStatement.setString(2, ticket.getTitle());
                preparedStatement.setString(3, ticket.getDescription());
//                preparedStatement.(4, ticket.getCategory());
//                preparedStatement.setString(5, ticket.getIncidentType());
//                preparedStatement.setString(6, ticket.getPriority());
//                preparedStatement.setString(7, ticket.getResolution());
//                preparedStatement.setString(8, ticket.getSeverity());
//                preparedStatement.setString(9, ticket.getStatus());
                preparedStatement.executeUpdate();
            }
        } catch (
                SQLException e)

        {
            e.printStackTrace();
        }
    }

}
